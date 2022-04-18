package com.example.springbootprac.repository;

import com.example.springbootprac.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Long> {


}
