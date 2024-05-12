package com.sejongbucket.lockerservice.domain.locker.repository;

import com.sejongbucket.lockerservice.domain.locker.entity.LockerDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LockerDetailJpaRepository extends JpaRepository<LockerDetail,Long> {
}
