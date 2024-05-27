package com.yabeto.kanban.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email_addres;
    private Date signup_date;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Board> boards;

    public User(){
        this.boards = new ArrayList<>();
    }

    public User(Long id, String username, String password, String email_addres, Date signup_date) {
        this();
        this.id = id;
        this.username = username;
        this.password = password;
        this.email_addres = email_addres;
        this.signup_date = signup_date;
    }

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

    public String getEmail_addres() {
        return email_addres;
    }

    public void setEmail_addres(String email_addres) {
        this.email_addres = email_addres;
    }

    public Date getSignup_date() {
        return signup_date;
    }

    public void setSignup_date(Date signup_date) {
        this.signup_date = signup_date;
    }

    public List<Board> getBoards() {
        return boards;
    }

    public void setBoards(List<Board> boards) {
        this.boards = boards;
    }


    
}

