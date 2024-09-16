package com.example.coms4156restdemo.service;

import com.example.coms4156restdemo.model.Student;
import com.example.coms4156restdemo.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class StudentService {
  private StudentRepository studentRepository;

  public StudentService(StudentRepository studentRepository) {}

  public Student getStudentById(int id) {

    // just a mock-up, you should query your database here
    if (id == 123) {
      return new Student(123, "Robin");
    }
    else throw new ResponseStatusException(
        HttpStatus.NOT_FOUND, "student not found"
    );
  }

  public List<Student> getAllStudents() {
    return List.of(new Student(123, "Robin"));
  }
  public void addStudent(Student student) {
    return;
  }
  public void updateStudent(int id, Student student) {
    return;
  }
  public void deleteStudent(int id) {
    return;
  }
}
