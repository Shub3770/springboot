package com.example.jpa.Dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDto {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;

}
