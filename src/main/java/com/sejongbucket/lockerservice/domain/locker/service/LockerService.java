package com.sejongbucket.lockerservice.domain.locker.service;

import com.sejongbucket.lockerservice.domain.locker.controller.request.FindAllLockerInMajorRequestDto;
import com.sejongbucket.lockerservice.domain.locker.controller.response.LockersInfoInMajorResponse;
import com.sejongbucket.lockerservice.domain.locker.dto.LockerDetailInfoDto;
import com.sejongbucket.lockerservice.domain.locker.dto.LockersInfoDto;
import com.sejongbucket.lockerservice.domain.locker.dto.LockersInfoInMajorDto;
import com.sejongbucket.lockerservice.domain.locker.entity.Locker;
import com.sejongbucket.lockerservice.domain.locker.repository.LockerJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Transactional
@Service
public class LockerService {
    private final LockerJpaRepository lockerJpaRepository;

    public LockersInfoInMajorResponse findAllLockerInMajor(FindAllLockerInMajorRequestDto requestDto) {
        log.info("사물함 전체 조회 --> 시작");

        List<Locker> lockersInMajor = lockerJpaRepository.findAllByMajorId(requestDto.getMajorId());
        log.info("사물함 전체 조회 --> 끝");
        LockersInfoInMajorResponse response = LockersInfoInMajorResponse.builder()
                .lockersInfo(lockersInMajor.stream()
                        .map(locker -> LockersInfoDto.builder()
                                .lockerInfo(getLockerInfo(locker))
                                .lockerDetailInfo(getLockerDetailInfo(locker))
                                .build())
                        .collect(Collectors.toList()))
                .build();
        return response;
    }

    private List<LockerDetailInfoDto> getLockerDetailInfo(Locker locker) {
        return locker.getLockerDetails().stream()
                .map(lockerDetail -> LockerDetailInfoDto.builder()
                        .lockerNum(lockerDetail.getLockerNum())
                        .rowNum(lockerDetail.getRowNum())
                        .columnNum(lockerDetail.getColumnNum())
                        .id(lockerDetail.getId())
                        .build())
                .collect(Collectors.toList());
    }

    private LockersInfoInMajorDto getLockerInfo(Locker locker) {
        return LockersInfoInMajorDto.builder()
                .id(locker.getId())
                .name(locker.getName())
                .permitStates(locker.getPermitUserState())
                .endReservationTime(locker.getPeriod().getEndDateTime())
                .startReservationTime(locker.getPeriod().getStartDateTime())
                .totalColumn(locker.getTotalColumn())
                .totalRow(locker.getTotalRow())
                .build();
    }
}
