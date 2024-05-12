package com.sejongbucket.lockerservice.global.format.exception.locker;


import com.sejongbucket.lockerservice.global.format.exception.ApplicationRunException;
import com.sejongbucket.lockerservice.global.format.exception.ErrorEnumCode;
import com.sejongbucket.lockerservice.global.format.exception.locker.errorCode.LockerErrorCode;

public class NotFoundLockerException extends ApplicationRunException {
    private static final ErrorEnumCode CODE = LockerErrorCode.NOT_FOUND_LOCKER;
    private NotFoundLockerException(ErrorEnumCode errorEnumCode){
        super(errorEnumCode);
    }
    public NotFoundLockerException(){
        this(CODE);
    }
}