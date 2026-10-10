package com.example.jpa.Controller;

import com.example.jpa.Dto.CreateUserDto;
import com.example.jpa.Dto.UserDto;
import com.example.jpa.Services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
public class UserController {
    private final UserServices userServices;
    @PostMapping("/user")
    public ResponseEntity<UserDto> usercreate(@RequestBody CreateUserDto createUserDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(userServices.usercreate(createUserDto));
    }
    @PatchMapping("/{id}")
    public ResponseEntity<UserDto> Patchupdate(@PathVariable Long id ,@RequestBody CreateUserDto createUserdto){
        return ResponseEntity.status(HttpStatus.OK).body(userServices.userpatch(id , createUserdto));

    }
}
