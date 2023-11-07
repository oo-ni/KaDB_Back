package com.example.memberservice.repository;

import com.example.memberservice.model.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<SiteUser, Integer> {
    Optional<SiteUser> findById(String userId);
}
