package com.example.StudentSystem.controller;

import com.example.StudentSystem.model.Student;
import com.example.StudentSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public Student add(@RequestBody Student student) {
        return studentService.saveStudent(student);

    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
       return studentService.getAllStudents();
    }

}
