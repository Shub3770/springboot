package com.example.jpa.Repository;

import com.example.jpa.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user,Long> {
}
