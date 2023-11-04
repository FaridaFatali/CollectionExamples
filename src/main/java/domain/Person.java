package domain;

public class Person {
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person: First Name - " + firstName + ", Last Name - " + lastName;
    }
}
