package com.sejongbucket.lockerservice.global.format.exception.reservation;


import com.sejongbucket.lockerservice.global.format.exception.ApplicationRunException;
import com.sejongbucket.lockerservice.global.format.exception.ErrorEnumCode;

import static com.sejongbucket.lockerservice.global.format.exception.reservation.errorCode.ReservationErrorCode.NOT_FOUND_RESERVATION;

public class NotFoundReservationException extends ApplicationRunException {
    private final static ErrorEnumCode CODE=NOT_FOUND_RESERVATION;

    private NotFoundReservationException(ErrorEnumCode errorEnumCode) {
        super(errorEnumCode);
    }
    public NotFoundReservationException(){
        this(CODE);
    }
}
