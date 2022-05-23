package com.exam.examserver.Services;

import com.exam.examserver.models.User;
import com.exam.examserver.models.UserRole;

import java.util.Set;

public interface UserService {

    public User createUser(User user , Set<UserRole> userRoles) throws Exception;
}
