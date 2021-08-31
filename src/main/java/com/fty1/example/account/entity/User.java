package com.fty1.example.account.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity(name = "t_user")
public class User extends JPAEntity {


    @Column(length = 32, unique = true, nullable = false)
    private String bizCode;

    @Column(length = 200)
    private String headerImg;

    @Column(length = 300)
    private String text;

    @Lob
    private String longText;
}
