package com.example.apicreate.controller;

import com.example.apicreate.dto.createuser;
import com.example.apicreate.dto.userdata;
import com.example.apicreate.services.userservices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class usercontroller {

    private final userservices userService;

    public usercontroller(userservices userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<userdata> getUsers() {
        return userService.findall();
    }

    @GetMapping("/users/{id}")
    public userdata getUserById(@PathVariable Long id) {
        return userService.getusersbyid(id);
    }
    @PostMapping("/users/new")
    public ResponseEntity<userdata> createUser(@RequestBody createuser user) {
        return new ResponseEntity<>(
                userService.createuserdata(user),
                HttpStatus.CREATED
        );
    }
    @DeleteMapping("/users/{id}")
    public ResponseEntity<Object> deleteuser(@PathVariable Long id){
        return new ResponseEntity<>(userService.deletedata(id),HttpStatus.OK);
    }
    @PutMapping("/users/news/{id}")
    public ResponseEntity<userdata> updateuser(@PathVariable Long id,@RequestBody userdata us){
      return new ResponseEntity<>(userService.updatedata(id,us),HttpStatus.OK);
    }
}