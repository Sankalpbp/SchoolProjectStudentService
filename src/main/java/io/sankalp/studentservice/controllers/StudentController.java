package io.sankalp.studentservice.controllers;

import io.sankalp.studentservice.dtos.StudentDTO;
import io.sankalp.studentservice.services.FetchStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private FetchStudentService studentService;

    @GetMapping("/")
    public String welcome () {
        return "Hey, we are going to provide all the data related to the students...";
    }

    @GetMapping("/get")
    public List<StudentDTO> getStudents () throws IOException {
        return studentService.getStudents();
    }
}
