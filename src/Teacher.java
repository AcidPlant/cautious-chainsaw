import java.util.*;
public class Teacher {
    private Person person;
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        this.person = new Person(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            this.salary += (this.salary * percentage / 100);
        }
    }

    @Override
    public String toString() {
        return person.toString() + " I teach " + subject + ".";
    }
}
