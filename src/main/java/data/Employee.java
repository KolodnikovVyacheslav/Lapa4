package data;

import java.time.LocalDate;

public class Employee {
    private int code;
    private String fullName;
    private String sex;
    private Department dept;
    private double income;
    private LocalDate dob;

    public Employee(int code, String fullName, String sex, Department dept, double income, LocalDate dob) {
        this.code = code;
        this.fullName = fullName;
        this.sex = sex;
        this.dept = dept;
        this.income = income;
        this.dob = dob;
    }

    public int getCode() { return code; }

    public String getFullName() { return fullName; }

    public String getSex() { return sex; }

    public Department getDept() { return dept; }

    public double getIncome() { return income; }

    public LocalDate getDob() { return dob; }

    @Override
    public String toString() {
        return fullName + " [" + sex + "] → " + income + "₽, род. " + dob + " | отдел: " + dept.getTitle();
    }
}