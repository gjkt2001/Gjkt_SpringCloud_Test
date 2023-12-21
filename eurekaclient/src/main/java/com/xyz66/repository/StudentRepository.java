package com.xyz66.repository;

import com.xyz66.entity.Student;

import java.util.Collection;

public interface StudentRepository {
    Collection<Student> findAll();
    Student findById(Long id);
    Student save(Student student);
    void delete(Long id);
}
