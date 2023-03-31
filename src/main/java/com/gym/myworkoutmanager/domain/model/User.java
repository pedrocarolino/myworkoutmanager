package com.gym.myworkoutmanager.domain.model;


import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String fullName;

    @NonNull
    private String password;

    @NonNull
    private String email;

    public User(Long id, @NonNull String fullName, @NonNull String password, @NonNull String email) {
        this.id = id;
        this.fullName = fullName;
        this.password = password;
        this.email = email;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getFullName() {
        return fullName;
    }

    public void setFullName(@NonNull String fullName) {
        this.fullName = fullName;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }
}