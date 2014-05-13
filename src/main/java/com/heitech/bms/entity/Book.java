package com.heitech.bms.entity;

import javax.persistence.*;

@Entity
@Table(name = "BOOK")
public class Book {

    private Long id;
    private String name;

    @Id
    @GeneratedValue
    @Column(name = "BOOK_ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "BOOK_NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
