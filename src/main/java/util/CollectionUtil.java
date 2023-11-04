package util;

import domain.Employee;
import java.util.*;

public class CollectionUtil {
    private static Set<String> set;

    static {
        set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
    }

    public static Collection<String> getCollection() {
        return set;
    }

    public static Set getEmptySet() {
        return new HashSet();
    }

    public static void listElements(Collection coll) {
        System.out.println("\n*****   Elements in the Collection   *****");
        Iterator i = coll.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("********************************************\n");
    }

    public static void listElements(List list) {
        System.out.println("\n*****   Elements in the List   *****");
        ListIterator i = list.listIterator();
        while (i.hasNext()) {
            System.out.println(i.nextIndex() + ": " + i.next());
        }
        System.out.println("*********************************************\n");
    }

    public static void listElements(Map<Object, Object> map) {
        System.out.println("\n*****   Elements in the Map   *****");
        Set<Object> keys = map.keySet();
        Iterator<Object> i = keys.iterator();
        while (i.hasNext()) {
            Object key = i.next();
            Object value = map.get(key);
            System.out.println(key + " - " + value);
        }
        System.out.println("*********************************************\n");
    }

    public static Set<String> getSet() {
        return (Set<String>) getCollection();
    }

    public static List<String> getStringList() {
        return new ArrayList<String>(getSet());
    }

    public static Map<String, Integer> getMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("five", 5);
        map.put("eleven", 11);
        map.put("nineteen", 19);
        return map;
    }

    public static List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(111, "Joseph", "Joseph", 5));
        employees.add(new Employee(222, "Lauren", "Lauren", 3));
        employees.add(new Employee(333, "Angelina", "Angelina", 11));
        employees.add(new Employee(444, "Jon", "Jon", 12));
        employees.add(new Employee(555, "David", "David", 1));
        employees.add(new Employee(666, "Dan", "Dan", 2));
        employees.add(new Employee(777, "Maria", "Maria", 20));
        employees.add(new Employee(888, "Elton", "Elton", 12));
        employees.add(new Employee(999, "Brandon", "Brandon", 3));
        return employees;
    }

    public static Collection getCollectionWithDuplicates() {
        List list = new ArrayList<>();
        list.add(3);
        list.add("Jennifer");
        list.add(3);
        list.add("Jennifer");
        list.add("Office");
        list.add(new Date());
        return list;
    }

    public static Collection getAnotherCollection() {
        Set<String> set = new HashSet<>();
        set.add("hundred");
        set.add("thousand");
        set.add("ten thousand");
        set.add("hundred thousand");
        set.add("million");
        return set;
    }

    public static List getList() {
        List list = new ArrayList<>();
        list.add(3);
        list.add("Jennifer");
        list.add(3);
        list.add("Office");
        list.add(new Date());
        list.add(3);
        return list;
    }

    // Changed it to see if there is any effect
    public static List getLinkedList() {
        List list = new LinkedList();
        list.add(3);
        list.add("Jennifer");
        list.add(3);
        list.add("Jennifer");
        list.add("Office");
        list.add(new Date());
        list.add(3);
        return list;
    }
}
