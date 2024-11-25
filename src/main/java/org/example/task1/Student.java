package org.example.task1;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

import java.util.List;
@Builder
@ToString
public class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;
    @Singular private List<String> courses;

}

