package com.example;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by brian on 6/7/16.
 */
@Entity
public class Account {

    @OneToMany(mappedBy = "account")
    private Set<Bookmark> bookmarks = new HashSet<>();

    @Id
    @GeneratedValue
    private Long id;

    public Set<Bookmark> getBookmarks(){
        return bookmarks;
    }

    public Long getId(){
        return id;
    }

    @JsonIgnore
    public String password;
    public String username;

    public Account(String name, String password){
        this.username = name;
        this.password = password;
    }

    Account(){ //jpa only
    }
}
