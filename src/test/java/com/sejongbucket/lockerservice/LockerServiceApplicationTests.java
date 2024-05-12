package com.sejongbucket.lockerservice;

import com.sejongbucket.lockerservice.domain.locker.controller.request.FindAllLockerInMajorRequestDto;
import com.sejongbucket.lockerservice.domain.locker.controller.response.LockersInfoInMajorResponse;
import com.sejongbucket.lockerservice.domain.locker.entity.Locker;
import com.sejongbucket.lockerservice.domain.locker.entity.LockerDetail;
import com.sejongbucket.lockerservice.domain.locker.entity.Period;
import com.sejongbucket.lockerservice.domain.locker.entity.role.PermitUserState;
import com.sejongbucket.lockerservice.domain.locker.repository.LockerDetailJpaRepository;
import com.sejongbucket.lockerservice.domain.locker.repository.LockerJpaRepository;
import com.sejongbucket.lockerservice.domain.locker.service.LockerService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDateTime;

@ActiveProfiles("test")
@SpringBootTest
class LockerServiceApplicationTests {
    @Autowired
    private LockerJpaRepository lockerJpaRepository;
    @Autowired
    private LockerDetailJpaRepository lockerDetailJpaRepository;
    @Autowired
    private LockerService lockerService;

    @DisplayName("")
    @Test
    void findAllLockerInMajorTest() {
        //given

        lockerDetailJpaRepository.save(LockerDetail.builder().lockerNum("1").rowNum("1").columnNum("1").build());
        lockerJpaRepository.save(Locker.builder()
                .majorId(1l)
                .totalColumn("1")
                .name("test")
                .totalRow("1")
                .period(new Period(LocalDateTime.now(), LocalDateTime.now()))
                .permitUserState(new PermitUserState(true, true, true))
                .build());
        //when
        LockersInfoInMajorResponse allLockerInMajor = lockerService.findAllLockerInMajor(FindAllLockerInMajorRequestDto.builder().majorId(1l).build());
        //then
        Assertions.assertThat(allLockerInMajor.getLockersInfo().size()).isOne();
    }

}
