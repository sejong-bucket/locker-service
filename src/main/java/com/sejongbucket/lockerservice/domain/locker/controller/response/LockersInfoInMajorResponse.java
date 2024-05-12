package com.sejongbucket.lockerservice.domain.locker.controller.response;

import com.sejongbucket.lockerservice.domain.locker.dto.LockersInfoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class LockersInfoInMajorResponse {
    @Schema(description = "사물함과 칸들의 정보")
    private List<LockersInfoDto> lockersInfo;
}
