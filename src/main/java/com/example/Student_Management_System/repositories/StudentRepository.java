package com.example.Student_Management_System.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student_Management_System.dtos.StudentDto;
import com.example.Student_Management_System.entities.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
    //public StudentDto getStudentDetails (Long studentId) throws Exception;
}
