package CSV;

import com.opencsv.*;
import data.Employee;
import data.Department;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CSVImporter {

    public static List<Employee> loadEmployees(String resourcePath, char delimiter) throws Exception {
        List<Employee> result = new ArrayList<>();
        Map<String, Department> deptMap = new HashMap<>();
        int idCounter = 1000;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        try (InputStream stream = CSVImporter.class.getClassLoader().getResourceAsStream(resourcePath);
             CSVReader csvReader = stream == null ? null :
                     new CSVReaderBuilder(new InputStreamReader(stream, StandardCharsets.UTF_8))
                             .withCSVParser(new CSVParserBuilder().withSeparator(delimiter).build())
                             .build()) {

            if (csvReader == null) throw new IllegalArgumentException("Файл не найден: " + resourcePath);

            csvReader.readNext(); // пропуск заголовка

            String[] row;
            while ((row = csvReader.readNext()) != null && row.length >= 6) {
                String fullName = row[1].trim();
                String sex = row[2].trim();
                LocalDate dob = LocalDate.parse(row[3].trim(), formatter);
                String deptName = row[4].trim();
                double income = Double.parseDouble(row[5].trim());

                Department dept = deptMap.computeIfAbsent(deptName, Department::new);
                result.add(new Employee(idCounter++, fullName, sex, dept, income, dob));
            }
        }

        return result;
    }
}
