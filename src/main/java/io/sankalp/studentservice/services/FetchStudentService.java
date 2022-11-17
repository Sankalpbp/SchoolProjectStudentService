package io.sankalp.studentservice.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.sankalp.studentservice.dtos.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class FetchStudentService {

    @Autowired
    private ObjectMapper objectMapper;

    public List<StudentDTO> getStudents () throws IOException {
        Resource resource = new ClassPathResource("students.json");
        FileInputStream file = new FileInputStream(resource.getFile());
        return Arrays.asList( objectMapper.readValue( file, StudentDTO[].class ) );
    }

    public Map<String, String> getDepartmentByStudent(String name ) throws IOException {
        Set<StudentDTO> students = getStudents().stream ()
                                                     .filter ( student -> student.getName ()
                                                                                 .equals ( name ) )
                                                     .collect(Collectors.toSet());
        String departmentName = students.stream()
                                        .iterator()
                                        .next()
                                        .getDepartmentName();

        return Collections.singletonMap( "departmentName", departmentName );
    }
}
