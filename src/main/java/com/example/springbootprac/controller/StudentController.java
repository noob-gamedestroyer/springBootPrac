package com.example.springbootprac.controller;

import com.example.springbootprac.model.Student;
import com.example.springbootprac.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentRepo repo;

    private long id;
    private String name;
    private String usn;
    private Student sDetail = new Student(id, name, usn);

    @GetMapping ("/getStudentDetails")
    public String getStudentDetails() {
        sDetail.setId(1L);
        sDetail.setName("rajat");
        sDetail.setUsn("1mj18cs109");
        repo.save(sDetail);
        return sDetail.toString();
    }

    @PostMapping("/addStudentDetails")
    public void addStudentDetails(@RequestParam("id") long id,
                                    @RequestParam("name") String name,
                                    @RequestParam("usn") String usn) {
        sDetail.setId(id);
        sDetail.setName(name);
        sDetail.setUsn(usn);
        repo.save(sDetail);
    }
}