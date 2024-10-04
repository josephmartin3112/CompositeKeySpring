package com.ust.compositekey.compositekey.service;


import com.ust.compositekey.compositekey.model.Student;
import com.ust.compositekey.compositekey.model.StudentKey;
import com.ust.compositekey.compositekey.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudentById(StudentKey id){
        return studentRepository.findById(id).orElse(null);
    }

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteStudent(StudentKey id){
        studentRepository.deleteById(id);
    }
}
