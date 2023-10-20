package com.example.memberservice.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
@Table(name = "AUTHENTICATION")
public class Authentication extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AuthenticationNo")
    private long no;

    @OneToOne
    @JoinColumn(name = "UserNo", referencedColumnName = "UserNo")
    private User user;

    @Column(nullable = false, unique = true, length = 128)
    private String PhoneNumber;

    @Column(nullable = false, length = 128)
    private String Birthday;
}
