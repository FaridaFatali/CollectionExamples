package set;

import java.util.*;
import domain.Employee;
import util.CollectionUtil;

public class SetWithDuplicatedObjects {
    public static void main(String[] args) {

        // If we use hashCode() and equals() methods in Employee class, it will not accept the same element twice
        // If we don't use one or both of them it'll accept duplicated elements

//        EmployeeComparator ec = new EmployeeComparator();
        Set set = new HashSet();

        Employee e1 = new Employee(888, "Joseph", "Joseph");
        System.out.println(set.add(e1));

        Employee e2 = new Employee(222, "Charles", "Charles");
        System.out.println(set.add(e2));

        Employee e3 = new Employee(111, "Josephina", "Josephina");
        System.out.println(set.add(e3));

        Employee e4 = new Employee(333, "David", "David");
        System.out.println(set.add(e4));

        Employee e5 = new Employee(222, "Charles", "Charles");
        System.out.println(set.add(e5));

        CollectionUtil.listElements(set);
    }
}
