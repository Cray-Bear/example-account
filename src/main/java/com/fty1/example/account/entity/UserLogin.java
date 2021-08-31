package com.fty1.example.account.entity;


import com.fty1.example.account.constant.LoginTypeEnum;

import javax.persistence.*;

@Entity(name = "t_user_login")
public class UserLogin extends JPAEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 32)
    private String userCode;

    @Column(length = 11)
    private String phoneNumber;

    @Column(length = 5)
    private String phoneArea;

    @Column(length = 40)
    private String emailAddress;

    @Column(length = 20)
    private String emailPassword;

    @Enumerated(value = EnumType.STRING)
    @Column(length = 10)
    private LoginTypeEnum loginType;

}
