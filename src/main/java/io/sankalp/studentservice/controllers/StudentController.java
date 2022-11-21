package io.sankalp.studentservice.controllers;

import io.sankalp.studentservice.dtos.StudentDTO;
import io.sankalp.studentservice.services.FetchStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    private FetchStudentService studentService;

    @GetMapping ( "/" )
    public String welcome () {
        return "Hey, we are going to provide all the data related to the students...";
    }

    @GetMapping ( "/get" )
    public List<StudentDTO> getStudents () throws IOException {
        return studentService.getStudents();
    }

    @GetMapping ( "/getDepartmentNameByStudent" )
    public Map<String, String> getDepartmentNameByStudent ( @RequestParam String studentName ) throws IOException {
        return studentService.getDepartmentByStudent ( studentName );
    }

    @GetMapping ( "getStudentByName" )
    public StudentDTO getStudentByName ( @RequestParam String studentName ) throws IOException {
        return studentService.getStudentByStudentName ( studentName );
    }

}
