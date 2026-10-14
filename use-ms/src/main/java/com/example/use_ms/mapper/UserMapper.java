package com.example.use_ms.mapper;

import com.example.use_ms.dto.UserDTO;
import com.example.use_ms.model.UserEntity;

public class UserMapper {

    public static UserEntity dtoToEntity(UserDTO userDTO) {
       return UserEntity.builder()
               .document(userDTO.getDocument())
               .email(userDTO.getEmail())
               .lastname(userDTO.getLastname())
               .name(userDTO.getName())
               .build();
    }
    public static UserDTO entityToDto(UserEntity entity){
        return UserDTO.builder()
                .document(entity.getDocument())
                .lastname(entity.getLastname())
                .name(entity.getName())
                .email(entity.getEmail())
                .build();

    }

}
