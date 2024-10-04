package com.ust.compositekey.compositekey.repository;

import com.ust.compositekey.compositekey.model.Student;
import com.ust.compositekey.compositekey.model.StudentKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, StudentKey> {
}
