package domain;

public class Student implements Comparable {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if (id < s.id) {
            return -1;
        } else if (id == s.id) {
            return 0;
        } else {
            return 1;
        }
    }
}
