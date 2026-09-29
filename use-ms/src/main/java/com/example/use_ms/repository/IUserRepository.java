package com.example.use_ms.repository;

import com.example.use_ms.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity,String> {
}
