package com.example.demo.service.impl;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.AutoWired;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
    @AutoWired
    StudentRepository stdrepo;
    @Override
    public Student poststudent (Student st){
        return st;
    }
}
