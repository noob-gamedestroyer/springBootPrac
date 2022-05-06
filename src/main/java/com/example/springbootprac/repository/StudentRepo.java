package com.example.springbootprac.repository;

import com.example.springbootprac.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
