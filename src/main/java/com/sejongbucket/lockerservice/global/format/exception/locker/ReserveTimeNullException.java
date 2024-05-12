package com.sejongbucket.lockerservice.global.format.exception.locker;


import com.sejongbucket.lockerservice.global.format.exception.ApplicationRunException;
import com.sejongbucket.lockerservice.global.format.exception.ErrorEnumCode;

import static com.sejongbucket.lockerservice.global.format.exception.locker.errorCode.LockerErrorCode.RESESRVE_TIME_NULL;

public class ReserveTimeNullException extends ApplicationRunException {
    private static ErrorEnumCode CODE = RESESRVE_TIME_NULL;
    private ReserveTimeNullException(ErrorEnumCode errorEnumCode) {
        super(errorEnumCode);
    }
    public ReserveTimeNullException(){
        this(CODE);
    }
}
