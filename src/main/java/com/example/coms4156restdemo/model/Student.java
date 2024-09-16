package com.example.coms4156restdemo.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;

@JsonDeserialize
@Data
@AllArgsConstructor
public class Student {
  private int id;
  private String name;
}
