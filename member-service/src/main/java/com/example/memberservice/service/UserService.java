package com.example.memberservice.service;

import com.example.memberservice.model.Member;
import com.example.memberservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.Date;

@RequiredArgsConstructor
@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final PasswordEncoder passwordEncoder;

    public Member create(String userid, String email, String password, String phone, Date birthday) {
        Member user = new Member();
        user.setId(userid);
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        user.setPhone(phone);
        user.setBirthday(birthday);
        this.userRepository.save(user);
        return user;
    }
}
