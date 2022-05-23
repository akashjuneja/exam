package com.exam.examserver.Repos;

import com.exam.examserver.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Roles,Long> {
}
