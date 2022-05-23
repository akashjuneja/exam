package com.exam.examserver.models;

//import javax.management.relation.Role;
import javax.persistence.*;

@Entity
@Table(name="userRoles")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userRoleId;
    @ManyToOne(fetch=FetchType.EAGER)
    private User user;
    @ManyToOne()
    private Roles role;

    public UserRole(){

    }

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
