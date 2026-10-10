package com.example.apicreate.repository;
import com.example.apicreate.dto.createuser;
import com.example.apicreate.dto.userdata;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class userrepo {
    public userrepo() {
        ur.add(new userdata((long) 1, "shubham", "shubham.com"));
        ur.add(new userdata((long) 2, "shub", "shub.com"));
    }

    public userdata getUserById(Long id) {
        for (userdata user : ur) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public List<userdata> getUr() {
        return ur;
    }

    public void setUr(List<userdata> ur) {
        this.ur = ur;
    }

    List<userdata> ur = new ArrayList<>();
    public userdata createnewuser(createuser user) {

        long id = ur.size() + 1;

        userdata newUser = new userdata(
                id,
                user.getName(),
                user.getEmail()
        );

        ur.add(newUser);

        return newUser;
    }

    public userdata deletedatauser(Long id) {
        for(userdata user:ur){
            if(user.getId().equals(id)){
                ur.remove(user);
                return (user);
            }
        }
        return null;
    }

    public userdata updatedata(Long id,userdata us) {
        for(userdata user:ur){
            if(user.getId().equals(id)){
                user.setEmail(us.getEmail());
                user.setName(us.getName());
                return user;
            }
        }
        return null;
    }
}

