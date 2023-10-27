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
    @JoinColumn(name = "FollowingNo", referencedColumnName = "UserNo")
    private User user;

    @ManyToOne
    @JoinColumn(name = "FollowerNo", referencedColumnName = "UserNo")
    private User user2;

}