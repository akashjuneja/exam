package com.exam.examserver.Repos;

import com.exam.examserver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findByUserName(String Username);
}
