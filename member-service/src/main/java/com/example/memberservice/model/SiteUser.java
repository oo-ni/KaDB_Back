package com.example.memberservice.model;

import com.example.memberservice.model.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
@Table(name = "USER")
public class SiteUser extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserNo")
    private Integer no;

    @Column(name = "UserId", nullable = false, unique = true, length = 20)
    private String id;

    @Column(name = "UserPassword", nullable = false, length = 200)
    private String password;

    @Column(name = "UserEmail", nullable = false, unique = true, length = 20)
    private String email;

    @Column(name = "UserPhone", nullable = false, unique = true, length = 128)
    private String phone;

    @Column(name = "UserBirthday", nullable = false, length = 128)
    private Date birthday;
}
