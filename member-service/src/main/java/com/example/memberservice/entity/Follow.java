package com.example.memberservice.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
@Table(name = "FOLLOW")
public class Follow extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FollowNo")
    private int no;

    @ManyToOne
    @JoinColumn(name = "FollowingId", referencedColumnName = "UserId")
    @JoinColumn(name = "FollowingId", referencedColumnName = "UserId")
    @Column(nullable = false, length = 12)
    private Profile profile;
}
