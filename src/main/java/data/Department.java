package data;

import java.util.concurrent.atomic.AtomicInteger;

public class Department {
    private static final AtomicInteger deptCounter = new AtomicInteger(100);
    private int deptId;
    private String title;

    public Department(String title) {
        this.title = title;
        this.deptId = deptCounter.getAndIncrement();
    }

    public int getDeptId() {
        return deptId;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " (ID: " + deptId + ")";
    }
}
