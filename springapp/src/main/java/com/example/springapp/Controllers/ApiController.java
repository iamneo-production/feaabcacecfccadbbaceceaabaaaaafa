package com.example.springapp.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    
    @GetMapping("/getName")
    public String getName(@RequestParam String studentName) {
        return "Welcome " + studentName + "!";
    }
}
