package com.sejongbucket.lockerservice.domain.reservation.entity;


import com.sejongbucket.lockerservice.domain.common.entity.BaseTimeEntity;
import com.sejongbucket.lockerservice.domain.locker.entity.LockerDetail;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "RESERVATION_TABLE")
public class Reservation extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "locker_detail_id")
    private LockerDetail lockerDetail;
}
