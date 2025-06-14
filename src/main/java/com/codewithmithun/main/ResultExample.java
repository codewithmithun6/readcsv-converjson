package com.codewithmithun.main;

import com.codewithmithun.dto.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static com.codewithmithun.process.DataConvertJson.convertToJson;
import static com.codewithmithun.process.ReadCSVExample.readCsv;

@Component
public class ResultExample {

    @Value("${csv.file.path.input}")
    private String csvFilePath;
    @Value("${json.file.path.output}")
     private String jsonFilePath;

    public String getJsonFilePath() {
        return jsonFilePath;
    }

    public String getCsvFilePath() {
        return csvFilePath;
    }
    public void execute() {
        List<Employee> employees = readCsv(csvFilePath);
        String jsonOutput = convertToJson(employees);
        writeJsonToFile(jsonOutput, jsonFilePath);
        System.out.println("JSON written to " + jsonFilePath);
    }

    // Existing methods: readCsv and convertToJson

    public static void writeJsonToFile(String json, String filePath) {
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
