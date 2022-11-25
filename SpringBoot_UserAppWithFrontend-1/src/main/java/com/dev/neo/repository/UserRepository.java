package com.dev.neo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.neo.model.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {



}
