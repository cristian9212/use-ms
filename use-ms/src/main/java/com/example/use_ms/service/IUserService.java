package com.example.use_ms.service;

import com.example.use_ms.dto.UserDTO;
import com.example.use_ms.model.UserEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IUserService {

    ResponseEntity<UserEntity> create(UserDTO user);

    ResponseEntity<List<UserDTO>> getAllPorNombre(String nombre);

    ResponseEntity<List<UserDTO>> getNameConsidents(String name);
}