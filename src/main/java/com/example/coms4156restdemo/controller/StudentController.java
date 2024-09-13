package com.example.coms4156restdemo.controller;

import com.example.coms4156restdemo.model.Student;
import com.example.coms4156restdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class StudentController {

  @Autowired
  private StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/")
  public ResponseEntity getIndex() {
    return ResponseEntity.ok("Hello World");
  }

  @GetMapping("/students/{id}")
  public ResponseEntity getStudent(@PathVariable String id) {
    return ResponseEntity.ok("get student with id " + id);
  }

  @PostMapping("/students/")
  public ResponseEntity addStudent(@RequestBody Student student) {
    return ResponseEntity.ok("add student with id xxx");
  }
  @PutMapping("/students/{id}")
  public ResponseEntity updateStudent(@PathVariable String id, @RequestBody Student student) {
    return ResponseEntity.ok("update student with id " + id);
  }
  @DeleteMapping("/students/{id}")
  public ResponseEntity deleteStudent(@PathVariable String id) {
    return ResponseEntity.ok("delete student with id " + id);
  }
}
