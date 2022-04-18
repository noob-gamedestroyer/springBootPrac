package com.example.springbootprac.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    private long id;
    private String name;
    private String usn;


    public Student() {
        super();
    }

    public Student(long id, String name, String usn) {
        this.id = id;
        this.name = name;
        this.usn = usn;
    }

    @Id
    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    @Override
    public String toString(){
        return String.format("student [id=%s, name=%s, usn=%s]", id, name, usn);
    }



}
