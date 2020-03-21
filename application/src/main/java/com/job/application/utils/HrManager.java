package com.job.application.utils;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "HrManagers")
public class HrManager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false)
    private Integer managerId;

    @Column
    @Email(message = "Email is invalid!")
    @NotEmpty
    private String email;

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

    public HrManager() {
    }

    public HrManager(@Email(message = "Email is invalid!") @NotEmpty String email,
                     @NotEmpty(message = "Password cannot be blank!") String password,
                     @NotEmpty(message = "First Name cannot be blank!") String firstname,
                     @NotEmpty(message = "Last Name cannot be blank!") String lastname,
                     Role role) {
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
