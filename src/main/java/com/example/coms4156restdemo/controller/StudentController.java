package com.example.coms4156restdemo.controller;

import com.example.coms4156restdemo.model.Student;
import com.example.coms4156restdemo.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

  private StudentService studentService;

  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/")
  public ResponseEntity<?> getIndex() {
    return ResponseEntity.ok("Hello World");
  }

  @GetMapping("/students/{id}")
  public ResponseEntity<?> getStudent(@PathVariable int id) {
    Student student = studentService.getStudentById(id);
    return ResponseEntity.ok(student);
  }

  @GetMapping("/students/")
  public ResponseEntity<?> getStudents() {
    List<Student> students = studentService.getAllStudents();
    return ResponseEntity.ok(students);
  }

  @PostMapping("/students/")
  public ResponseEntity<?> addStudent(@RequestBody Student student) {
    studentService.addStudent(student);
    return ResponseEntity.ok(student);
  }
  @PutMapping("/students/{id}")
  public ResponseEntity<?> updateStudent(@PathVariable int id, @RequestBody Student student) {
    studentService.updateStudent(id, student);
    return ResponseEntity.ok(student);
  }
  @DeleteMapping("/students/{id}")
  public ResponseEntity<?> deleteStudent(@PathVariable int id) {
    studentService.deleteStudent(id);
    return ResponseEntity.ok().build();
  }
}
