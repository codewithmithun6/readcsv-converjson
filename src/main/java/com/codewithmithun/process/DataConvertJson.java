package com.codewithmithun.process;

import com.codewithmithun.dto.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class DataConvertJson {

    public static String convertToJson(List<Employee> employees) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(employees);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
