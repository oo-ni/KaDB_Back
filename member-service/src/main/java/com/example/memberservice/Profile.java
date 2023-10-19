package com.example.memberservice;

import jakarta.persistence.*;

@Entity
public class Profile extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int profile_no;

    @OneToOne(mappedBy = "profile")
    private User user;


}
