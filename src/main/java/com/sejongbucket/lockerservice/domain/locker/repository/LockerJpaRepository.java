package com.sejongbucket.lockerservice.domain.locker.repository;

import com.sejongbucket.lockerservice.domain.locker.entity.Locker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LockerJpaRepository extends JpaRepository<Locker,Long> {
    List<Locker> findAllByMajorId(Long majorId);
}
