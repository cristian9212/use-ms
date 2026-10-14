package com.example.use_ms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserEntity {

    @Id
    @UuidGenerator
    private String id;

    private String document;

    private  String name;

    private String lastname;

    private String email;
/*
    @PrePersist
    public void generateId(){
        if(this.id == null){
            this.id = UUID.randomUUID().toString();
        };
    }*/

}
