package com.sejongbucket.lockerservice.domain.locker.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;

@Schema(description = "사물함 각 칸의 정보")
@Getter
@Builder
public class LockerDetailInfoDto {
    @Schema(description = "해당 칸의 pk값")
    private Long id;
    @Schema(description = "해당 칸의 행번호")
    private String rowNum;
    @Schema(description = "해당 칸의 열번호")
    private String columnNum;
    @Schema(description = "해당 칸의 번호")
    private String lockerNum;
}
