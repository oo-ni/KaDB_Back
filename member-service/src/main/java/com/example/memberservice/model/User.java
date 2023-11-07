package com.example.memberservice.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE")
@Table(name = "USER")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserNo")
    private int no;

    @Column(name = "UserId", nullable = false, unique = true, length = 20)
    private String id;

    @Column(nullable = false)
    private Boolean LoginType;
}
