package com.codegym.cms.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;

    @ManyToOne
    private AppUserRole userRole;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AppUserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(AppUserRole userRole) {
        this.userRole = userRole;
    }


}
