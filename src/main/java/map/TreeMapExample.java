package map;

import domain.Student;
import java.util.*;

public class TreeMapExample {
    static Map studentsWithID = new TreeMap();
    static Map studentsWithName = new TreeMap();

    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            Student s = new Student(i, "Student" + i);
            studentsWithID.put(s.getId(), s);
        }

        System.out.println("Students with ID:");
        Set ids = studentsWithID.keySet();
        Iterator iterator = ids.iterator();

        while (iterator.hasNext()) {
//            Student s = (Student) iterator.next();
//            int i = (Integer) studentsWithID.get(s);
            int id = (Integer) iterator.next();
            Student s = (Student) studentsWithID.get(id);
            System.out.println(s);
        }

        System.out.println("\nStudents with names:");
        for (int i = 10; i > 0; i--) {
            Student s = new Student(i, "Student" + i);
            studentsWithName.put(s.getName(), s);
        }

        Set names = studentsWithName.keySet();
        Iterator iterator2 = names.iterator();

        while (iterator2.hasNext()) {
            String name = (String) iterator2.next();
            Student s = (Student) studentsWithName.get(name);
            System.out.println(s);
        }

        System.out.println("\nGiving a comparator:");
        Comparator<String> nameLengthComparator = Comparator.comparingInt(String::length);
        Map studentsWithNameByLength = new TreeMap(nameLengthComparator);

        for (int i = 10; i > 8; i--) {
            Student s = new Student(i, "Student" + i);
            studentsWithNameByLength.put(s.getName(), s);
        }

        studentsWithNameByLength.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
