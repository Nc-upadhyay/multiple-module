package com.nc.student.controller;

import com.nc.student.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentMapper studentMapper;
    @GetMapping("/test")
    public ResponseEntity<?> test(){
        return  ResponseEntity.ok(studentMapper.getPosts());
    }
}
