package com.example.apicreate.services;

import com.example.apicreate.dto.createuser;
import com.example.apicreate.dto.userdata;
import com.example.apicreate.repository.userrepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userservices {

    private final userrepo userRepo;

    public userservices(userrepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<userdata> findall() {
        return userRepo.getUr();
    }

    public userdata getusersbyid(Long id) {
        return userRepo.getUserById(id);
    }
    public userdata createuserdata(createuser user){
        return userRepo.createnewuser(user);
    }


    public userdata deletedata(Long id) {
        return userRepo.deletedatauser(id);
    }

    public userdata updatedata(Long id,userdata us) {
        return userRepo.updatedata( id, us);
    }
}