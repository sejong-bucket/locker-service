package com.sejongbucket.lockerservice.global.format.exception.locker;


import com.sejongbucket.lockerservice.global.format.exception.ApplicationRunException;
import com.sejongbucket.lockerservice.global.format.exception.ErrorEnumCode;
import com.sejongbucket.lockerservice.global.format.exception.locker.errorCode.LockerErrorCode;

public class IsNotReserveTimeException extends ApplicationRunException {
    private static ErrorEnumCode CODE = LockerErrorCode.IS_NOT_RESERVED_TIME;

    public IsNotReserveTimeException() {
        this(CODE);
    }

    private IsNotReserveTimeException(ErrorEnumCode errorEnumCode) {
        super(errorEnumCode);
    }
}
