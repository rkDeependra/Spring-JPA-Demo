package com.jpa.demo.controller;

import com.jpa.demo.dao.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public interface StudentDatabaseJPAController {
    @PostMapping(value = "add/student")
    Student addNewStudent(@RequestBody Student student);

    @PostMapping("addall/students")
    List<Student> addNewStudents(@RequestBody Iterable<Student> students);

    @GetMapping("get/student/{studentRollNumber}")
    Student getStudent(@PathVariable Integer studentRollNumber);

    @GetMapping("getall/students")
    List<Student> getAllStudents();
}
