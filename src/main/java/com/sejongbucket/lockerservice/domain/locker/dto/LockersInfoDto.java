package com.sejongbucket.lockerservice.domain.locker.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class LockersInfoDto {
    @Schema(description = "사물함에 대한 정보")
    private LockersInfoInMajorDto lockerInfo;
    @Schema(description = "사물함 칸에 대한 정보")
    private List<LockerDetailInfoDto> lockerDetailInfo;
}
