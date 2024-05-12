package com.sejongbucket.lockerservice.global.format.exception.locker;


import com.sejongbucket.lockerservice.global.format.exception.ApplicationRunException;
import com.sejongbucket.lockerservice.global.format.exception.ErrorEnumCode;

import static com.sejongbucket.lockerservice.global.format.exception.locker.errorCode.LockerErrorCode.INVALID_CANCEL_LOCKER;

public class InvalidCancelLockerException extends ApplicationRunException {
    private static final ErrorEnumCode CODE = INVALID_CANCEL_LOCKER;
    public InvalidCancelLockerException(){
        this(CODE);
    }
    private InvalidCancelLockerException(ErrorEnumCode code){
        super(code);
    }

}
