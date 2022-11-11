package io.sankalp.studentservice.controllers;

import io.sankalp.studentservice.dtos.StudentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/")
    public String welcome () {
        return "Hey, we are going to provide all the data related to the students...";
    }
}
