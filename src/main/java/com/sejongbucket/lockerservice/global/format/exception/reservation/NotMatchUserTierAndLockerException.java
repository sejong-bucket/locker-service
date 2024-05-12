package com.sejongbucket.lockerservice.global.format.exception.reservation;


import com.sejongbucket.lockerservice.global.format.exception.ApplicationRunException;
import com.sejongbucket.lockerservice.global.format.exception.ErrorEnumCode;

import static com.sejongbucket.lockerservice.global.format.exception.reservation.errorCode.ReservationErrorCode.NOT_MATCH_USER_TIER_AND_LOCKER;

public class NotMatchUserTierAndLockerException extends ApplicationRunException {
    private final static ErrorEnumCode CODE = NOT_MATCH_USER_TIER_AND_LOCKER;

    public NotMatchUserTierAndLockerException() {
        this(CODE);
    }

    private NotMatchUserTierAndLockerException(ErrorEnumCode errorEnumCode) {
        super(errorEnumCode);
    }
}
