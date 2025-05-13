package org.example;

import CSV.CSVImporter;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVParserBuilder;
import data.Department;
import data.Employee;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Стартовая точка программы, отвечающая за инициализацию импорта сотрудников.
 */
public class Main {

    /**
     * Запуск основной логики обработки данных сотрудников.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        try {
            List<Employee> staff = CSVImporter.loadEmployees("foreign_names.csv", ';');
            for (Employee emp : staff) {
                System.out.println(emp);
            }
        } catch (Exception ex) {
            System.err.println("Ошибка при обработке: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
