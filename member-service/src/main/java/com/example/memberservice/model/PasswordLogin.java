package com.example.memberservice.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
@Table(name = "PASSWORDLOGIN")
public class PasswordLogin extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PasswordNo")
    private int no;

    @OneToOne
    @JoinColumn(name = "UserNo", referencedColumnName = "UserNo")
    private Member user;

    @Column(nullable = false, length = 128)
    private String Salt;

    @Column(nullable = false, length = 128)
    private String Password;

    @CreationTimestamp
    @Column(nullable = false)
    private Timestamp UpdateDate; // Password 갱신시마다 찍히도록 api 구현
}
