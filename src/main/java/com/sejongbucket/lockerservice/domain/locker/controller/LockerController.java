package com.sejongbucket.lockerservice.domain.locker.controller;

import com.sejongbucket.lockerservice.domain.locker.controller.request.FindAllLockerInMajorRequestDto;
import com.sejongbucket.lockerservice.domain.locker.controller.response.LockersInfoInMajorResponse;
import com.sejongbucket.lockerservice.domain.locker.service.LockerService;
import com.sejongbucket.lockerservice.global.format.success.SuccessResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.user.prefix}")
public class LockerController {
    private final LockerService lockerService;

    @Operation(
            summary = "사물함 정보조회",
            description = "사물함 이름, 기간, 각 사물함 칸의 예약여부정보는 없음"
    )
//    @GetMapping("/users/{userId}/majors/lockers")
    @GetMapping("/majors/{majorId}/lockers")
    public SuccessResponse<LockersInfoInMajorResponse> findAllLockerInMajor(@PathVariable("majorId") Long majorId) {
        long startTime = System.currentTimeMillis();
        SuccessResponse successResponse = new SuccessResponse(lockerService.findAllLockerInMajor(FindAllLockerInMajorRequestDto.builder()
                .majorId(majorId).build()));
        long stopTime = System.currentTimeMillis();
        System.out.println("코드 실행 시간: " + (stopTime - startTime));
        return successResponse;
    }
}
