package com.sejongbucket.lockerservice.domain.locker.entity.role;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Embeddable
public class PermitUserState {
    private boolean isAttend;
    private boolean isRest;
    private boolean isGraduate;
}
