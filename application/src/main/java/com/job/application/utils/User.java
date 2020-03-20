package com.job.application.utils;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false)
    private Integer userId;

    @Column(name = "USERNAME", nullable = false, length = 100)
    @NotEmpty(message = "Username cannot be blank!")
    private String username;

    @Column(name = "PASSWORD")
    @NotEmpty(message = "Password cannot be blank!")
    private String password;

    @Column(name = "FIRST_NAME", length = 100)
    @NotEmpty(message = "First Name cannot be blank!")
    private String firstname;

    @Column(name = "LAST_NAME", length = 100)
    @NotEmpty(message = "Last Name cannot be blank!")
    private String lastname;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Role role;

    public User() {
    }

    public User(@NotEmpty(message = "Username cannot be blank!") String username,
                @NotEmpty(message = "Password cannot be blank!") String password,
                @NotEmpty(message = "First Name cannot be blank!") String firstname,
                @NotEmpty(message = "Last Name cannot be blank!") String lastname,
                Role role) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
