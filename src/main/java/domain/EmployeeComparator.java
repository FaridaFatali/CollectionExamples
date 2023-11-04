package domain;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getNo() < e2.getNo()) {
            return -1;
        } else if (e1.getNo() == e2.getNo()) {
            return 0;
        } else {
            return 1;
        }
    }
}
