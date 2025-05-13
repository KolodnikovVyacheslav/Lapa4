package data;

import java.time.LocalDate;

/**
 * Сотрудник компании.
 */
public class Employee {
    private int code;
    private String fullName;
    private String sex;
    private Department dept;
    private double income;
    private LocalDate dob;

    /**
     * Конструктор сотрудника.
     *
     * @param code      Уникальный идентификатор сотрудника
     * @param fullName  Полное имя сотрудника
     * @param sex       Пол сотрудника
     * @param dept      Департамент, к которому относится сотрудник
     * @param income    Уровень дохода сотрудника
     * @param dob       Дата рождения сотрудника
     */
    public Employee(int code, String fullName, String sex, Department dept, double income, LocalDate dob) {
        this.code = code;
        this.fullName = fullName;
        this.sex = sex;
        this.dept = dept;
        this.income = income;
        this.dob = dob;
    }

    /**
     * Получает уникальный код сотрудника.
     *
     * @return числовой идентификатор
     */
    public int getCode() {
        return code;
    }

    /**
     * Получает полное имя сотрудника.
     *
     * @return строка с именем
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Получает пол сотрудника.
     *
     * @return "Male", "Female" или другое значение
     */
    public String getSex() {
        return sex;
    }

    /**
     * Получает департамент, в котором работает сотрудник.
     *
     * @return объект {@link Department}
     */
    public Department getDept() {
        return dept;
    }

    /**
     * Получает доход сотрудника.
     *
     * @return значение дохода в виде числа
     */
    public double getIncome() {
        return income;
    }

    /**
     * Получает дату рождения сотрудника.
     *
     * @return объект {@link LocalDate} с датой рождения
     */
    public LocalDate getDob() {
        return dob;
    }

    /**
     * Строковое представление сотрудника.
     *
     * @return форматированная строка с данными
     */
    @Override
    public String toString() {
        return fullName + " [" + sex + "] → " + income + "₽, род. " + dob + " | отдел: " + dept.getTitle();
    }
}
