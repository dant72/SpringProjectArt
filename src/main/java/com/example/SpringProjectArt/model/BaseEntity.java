package com.example.SpringProjectArt.model;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

import javax.persistence.*;

@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    @Column(name="created")
    private Date created;

    @LastModifiedDate
    @Column(name="updated")
    private  Date update;
    @Enumerated(EnumType.STRING)
    @Column(name="status")
    private Status status;
}
