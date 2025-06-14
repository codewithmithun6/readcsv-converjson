package com.codewithmithun.process;

import com.codewithmithun.dto.Employee;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class ReadCSVExample {

    public static List<Employee> readCsv(String filePath) {
        try (Reader reader = new FileReader(filePath)) {
            CsvToBean<Employee> csvToBean = new CsvToBeanBuilder<Employee>(reader)
                    .withType(Employee.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            return csvToBean.parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
