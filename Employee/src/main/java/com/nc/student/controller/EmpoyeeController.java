package com.nc.student.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpoyeeController {
    @GetMapping("/test")
    public ResponseEntity<?> test()
    {
        return ResponseEntity.ok("Employee Testing..");
    }
}
