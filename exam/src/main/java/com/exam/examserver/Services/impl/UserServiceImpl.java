package com.exam.examserver.Services.impl;

import com.exam.examserver.Repos.RolesRepository;
import com.exam.examserver.Repos.UserRepository;
import com.exam.examserver.Services.UserService;
import com.exam.examserver.models.User;
import com.exam.examserver.models.UserRole;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RolesRepository rolesRepository;
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User local = this.userRepository.findByUserName(user.getUsername());
        if(local!=null){
            System.out.println("User is already Present");
            throw new Exception("User is already present");
        }else{
            
        }
        return null;
    }
}
