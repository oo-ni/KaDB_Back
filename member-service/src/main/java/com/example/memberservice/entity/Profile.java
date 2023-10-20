package com.example.memberservice.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
@Table(name = "PROFILE")
public class Profile extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProfileNo")
    private int no;

    @OneToOne
    @JoinColumn(name = "vhUserNo", referencedColumnName = "UserNo")
    private User user;

    @Column(name = "UserName", nullable = false, length = 12)
    private String name;

    @Column(nullable = false, length = 100, columnDefinition = "DEFAULT 'https://t1.daumcdn.net/cfile/tistory/2513B53E55DB206927'")
    private String PhotoUrl;

    @Column(length = 300, columnDefinition = "DEFAULT NULL")
    private String Introduction;

    @Column(length = 300, columnDefinition = "DEFAULT NULL")
    private String Tags;

    @Column(nullable = false, columnDefinition = "DEFAULT 0")
    private int FollowerNumber;

    @Column(nullable = false, columnDefinition = "DEFAULT 0")
    private int FollowingNumber;

    @Column(length = 300, columnDefinition = "DEFAULT NULL")
    private String Badge;

    @Column(nullable = false) // 0 -> 관리자, 1 -> 일반사용자
    private boolean Role;
}
