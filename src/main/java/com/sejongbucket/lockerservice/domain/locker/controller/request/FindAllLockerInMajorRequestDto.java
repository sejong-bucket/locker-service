package com.sejongbucket.lockerservice.domain.locker.controller.request;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class FindAllLockerInMajorRequestDto {
    private Long majorId;
}
