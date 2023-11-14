package com.example.memberservice.repository;

import com.example.memberservice.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Member, Integer> {
    Optional<Member> findById(String userId);
}
