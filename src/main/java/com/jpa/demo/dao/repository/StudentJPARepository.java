package com.jpa.demo.dao.repository;

import com.jpa.demo.dao.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJPARepository extends JpaRepository<Student, Integer> {
}
