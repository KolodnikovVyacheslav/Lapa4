package data;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Отдел (департамент), в котором работает сотрудник.
 */
public class Department {
    private static final AtomicInteger deptCounter = new AtomicInteger(100);
    private int deptId;
    private String title;

    /**
     * Создаёт департамент с уникальным ID.
     *
     * @param title название отдела
     */
    public Department(String title) {
        this.title = title;
        this.deptId = deptCounter.getAndIncrement();
    }

    /**
     * Получает уникальный идентификатор отдела.
     *
     * @return числовой ID департамента
     */
    public int getDeptId() {
        return deptId;
    }

    /**
     * Получает название отдела.
     *
     * @return строковое имя отдела
     */
    public String getTitle() {
        return title;
    }

    /**
     * Строковое представление департамента.
     *
     * @return строка с названием и ID
     */
    @Override
    public String toString() {
        return title + " (ID: " + deptId + ")";
    }
}
