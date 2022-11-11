package io.sankalp.studentservice.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.sankalp.studentservice.dtos.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Service
public class FetchStudentService {

    @Autowired
    private ObjectMapper objectMapper;

    public List<StudentDTO> getStudents () throws IOException {
        final String jsonString = "[\n  {\n    \"name\": \"KK\",\n    \"rollNumber\": 1,\n    \"classNumber\": 2,\n    \"address\": {\n      \"houseNumber\": 111,\n      \"roadNumber\": 2,\n      \"colony\": \"Prashanthi Hills Colony\",\n      \"pinCode\": 500003,\n      \"landmark\": \"Gandikota Apartment Castles\"\n    },\n    \"parentsPhoneNumber\": 9811223344\n  }\n]";
        return Arrays.asList( objectMapper.readValue( jsonString, StudentDTO[].class ) );
    }
}
