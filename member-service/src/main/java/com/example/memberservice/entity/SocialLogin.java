package com.example.memberservice.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
@Table(name = "SOCIALLOGIN")
public class SocialLogin extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SocialLoginNo")
    private int no;

    @OneToOne
    @JoinColumn(name = "UserNo", referencedColumnName = "UserNo")
    private User user;

    @Column(nullable = false, length = 64)
    private String ExternalId;

    @Column(nullable = false, length = 256)
    private String AccessToken;
}
