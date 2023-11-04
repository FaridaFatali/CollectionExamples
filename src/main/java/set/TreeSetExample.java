package set;

import java.util.*;
import domain.Employee;

public class TreeSetExample {
    public static void main(String[] args) {
        Set set = new TreeSet();
//        Set set1 = new TreeSet(new EmployeeComparator());

        Employee e1 = new Employee(888, "Jon", "Jon", 4);
        System.out.println(set.add(e1));
        Employee e2 = new Employee(222, "Rachel", "Rachel", 7);
        System.out.println(set.add(e2));
        Employee e3 = new Employee(111, "Jessica", "Jessica", 1);
        System.out.println(set.add(e3));
        Employee e4 = new Employee(223, "Michael", "Michael", 10);
        System.out.println(set.add(e4));
        Employee e5 = new Employee(222, "Rachel", "Rachel", 7);
        System.out.println(set.add(e5));  // Won't add this duplicated element

        System.out.println();

        for (Object o : set) {
            Employee e = (Employee) o;
            System.out.println(e.getNo() + " " + e.getFirstName() + " " + e.getLastName());
        }
    }
}
