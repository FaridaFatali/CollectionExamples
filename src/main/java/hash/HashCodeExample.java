package hash;

import java.util.*;
import domain.Employee;

public class HashCodeExample {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println("hashCode for an object: " + o.hashCode());

        Integer i1 = 2023;
        System.out.println("\nhashCode for an integer: " + i1.hashCode());

        Integer i2 = 2023;
        System.out.println("hashCode for an integer: " + i2.hashCode());

        if (i1.equals(i2)) {
            System.out.println(i1 + " and " + i2 + " are equal.");
        }

        Long l1 = 2023L;
        System.out.println("\nhashCode for a long: " + l1.hashCode());

        Long l2 = 2023L;
        System.out.println("hashCode for a long: " + l2.hashCode());

        if (l1.equals(l2)) {
            System.out.println(l1 + " and " + l2 + " are equals.");
        }

        String s1 = new String("2023");
        System.out.println("\nhashCode for a string: " + s1.hashCode());

        String s2 = "2023";
        System.out.println("hashCode for a string: " + s2.hashCode());

        if (s1.equals(s2)) {
            System.out.println(s1 + " and " + s2 + " are equals.");
        }

        StringBuffer sb = new StringBuffer("2023");
        System.out.println("\nhashCode for a string buffer: " + sb.hashCode());

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2023);
        System.out.println("\nhashCode for an arraylist: " + list.hashCode());

        Iterator it = list.iterator();
        System.out.println("\nhashCode for an iterator: " + it.hashCode());

        HashCodeExample ex = new HashCodeExample();
        System.out.println("\nhashCode for HashCodeExample: " + ex.hashCode());

        String st = new String("19999999999999999");
        System.out.println("\nhashCode can be negative: " + st.hashCode());

        System.out.println();

        Employee e1 = new Employee(111, "Jon", "Jon", 1);
        Employee e2 = new Employee(111, "Jon", "Jon", 1);
        System.out.println("hashCode for an Employee: " + e1.hashCode());
        System.out.println();
        System.out.println("hashCode for an Employee: " + e2.hashCode());

        System.out.println();

        if (e1.equals(e2)) {
            System.out.println(e1 + " and " + e2 + " are equals");
        }

        System.out.println();

        Employee e3 = new Employee(111, "Jon", "Jon", 1);
        Employee e4 = new Employee(112, "Jon", "Jon", 1);
        System.out.println("hashCode for an Employee: " + e3.hashCode());
        System.out.println();
        System.out.println("hashCode for an Employee: " + e4.hashCode());

        System.out.println();

        if (!e3.equals(e4)) {
            System.out.println(e3 + " and " + e4 + " are not equal.");
        }
    }
}
