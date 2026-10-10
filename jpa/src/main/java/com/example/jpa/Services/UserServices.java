package com.example.jpa.Services;

import com.example.jpa.Dto.CreateUserDto;
import com.example.jpa.Dto.UserDto;
import com.example.jpa.Repository.UserRepository;
import com.example.jpa.entities.user;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServices {
   private final UserRepository userRepository;
    public UserDto usercreate(CreateUserDto createUserDto) {


        user user=new user();
        user.setName(createUserDto.getName());
        user.setEmail(createUserDto.getEmail());


        user saved=userRepository.save(user);
        return new UserDto(saved.getId(),saved.getName(),saved.getEmail());
    }
   @Transactional
    public UserDto userpatch(Long id,CreateUserDto createUserDto) {
     user jpsaved=userRepository.findById(id).orElseThrow();
     jpsaved.setName(createUserDto.getName());
     jpsaved.setEmail(createUserDto.getEmail());
        return new UserDto(
                jpsaved.getId(),
                jpsaved.getName(),
                jpsaved.getEmail()
        );
    }
}
