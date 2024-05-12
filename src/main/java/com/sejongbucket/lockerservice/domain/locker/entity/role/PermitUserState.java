package com.sejongbucket.lockerservice.domain.locker.entity.role;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PermitUserState {
    @Id
    private Long id;
    private String state;

}
