package tuan8;
import java.io.*;

public class Student implements Serializable {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor
    public Student() {
        
    }

    // Getter method for the name field
    public String getName() {
        return name;
    }

    // Setter method for the name field
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the age field
    public int getAge() {
        return age;
    }

    // Setter method for the age field
    public void setAge(int age) {
        this.age = age;
    }
}
