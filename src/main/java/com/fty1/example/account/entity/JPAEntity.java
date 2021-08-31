package com.fty1.example.account.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class JPAEntity {

    @Id
    private Long id;

    @LastModifiedDate
    private Date lastModifiedDate;

    @CreatedDate
    private Date createdDate;

    @Column(length = 1,nullable = false )
    Boolean logicDelete;
}
