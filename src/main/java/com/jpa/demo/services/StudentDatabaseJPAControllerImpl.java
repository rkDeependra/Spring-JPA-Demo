package com.jpa.demo.services;

import com.jpa.demo.controller.StudentDatabaseJPAController;
import com.jpa.demo.dao.entity.Student;
import com.jpa.demo.dao.repository.StudentJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDatabaseJPAControllerImpl implements StudentDatabaseJPAController {

    @Autowired
    private StudentJPARepository studentJPARepository;

    @Override
    public Student addNewStudent(Student student) {
        return studentJPARepository.save(student);
    }

    @Override
    public List<Student> addNewStudents(Iterable<Student> students) {
        return studentJPARepository.saveAll(students);
    }

    @Override
    public Student getStudent(Integer studentRollNumber) {
        return studentJPARepository.findById(studentRollNumber).orElse(new Student());
    }

    @Override
    public List<Student> getAllStudents() {
        return studentJPARepository.findAll();
    }
}
