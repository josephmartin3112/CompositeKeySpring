package com.ust.compositekey.compositekey.controller;

import com.ust.compositekey.compositekey.model.Student;
import com.ust.compositekey.compositekey.model.StudentKey;
import com.ust.compositekey.compositekey.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{studentId}/{enrollmentYear}")
    public Student getStudentById(@PathVariable Long studentId, @PathVariable int enrollmentYear){
        StudentKey studentKey=new StudentKey(studentId,enrollmentYear);
        return studentService.getStudentById(studentKey);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/{studentId}/{enrollmentYear}")
    public void deleteStudent(@PathVariable Long studentId,@PathVariable int enrollmentYear){
        StudentKey studentKey=new StudentKey(studentId,enrollmentYear);
        studentService.deleteStudent(studentKey);
    }
}
