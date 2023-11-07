package com.example.memberservice.model;

import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserCreateForm {
    @Size(min = 3, max = 20)
    private String userid;

    private String password;

    private String email;

    private String phone;

    private Date birthday;
}