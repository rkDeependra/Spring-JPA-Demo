package com.jpa.demo.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rollNumber;

    private String firstName;

    private String middleName;

    private String lastName;

    private String studentsClass;

    private String section;

    private String address;

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentsClass='" + studentsClass + '\'' +
                ", section='" + section + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
