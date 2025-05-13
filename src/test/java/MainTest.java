import CSV.CSVImporter;
import data.Employee;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Юнит-тест для проверки импорта сотрудников.
 */
public class MainTest {

    /**
     * Проверяет успешную загрузку сотрудников из CSV.
     */
    @Test
    public void verifyEmployeeParsing() throws Exception {
        List<Employee> result = CSVImporter.loadEmployees("foreign_names.csv", ';');

        assertNotNull(result, "Список сотрудников должен быть создан");
        assertFalse(result.isEmpty(), "Список не должен быть пуст");

        Employee emp = result.get(0);
        assertNotNull(emp.getFullName());
        assertNotNull(emp.getSex());
        assertTrue(emp.getIncome() > 0);
        assertNotNull(emp.getDob());
        assertNotNull(emp.getDept());
    }
}
