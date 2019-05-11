package com.lei.springboot.transaction;

import javax.persistence.*;

//Set table name to be user, and set it to be entity
@Table(name = "user")
@Entity
public class User {
    //Set how to generate main key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public int id;

    @Column
    private String username;

    @Column
    private String password;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username +'\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
