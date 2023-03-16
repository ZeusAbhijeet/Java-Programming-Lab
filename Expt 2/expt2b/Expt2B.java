package expt2b;
import java.util.Scanner;
/**
 *
 * @author student
 */

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    private int rollNumber;
    private int totalMarks;

    Student(String name1, int age, int rollNumber, int totalMarks) {
        super(name1, age);
        this.rollNumber = rollNumber;
        this.totalMarks = totalMarks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll number: " + rollNumber + ", Total Marks: " + totalMarks);
    }
}

public class Expt2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and age: ");
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        Person p1 = new Person(name, age);
        System.out.println("\nPerson details:");
        p1.display();

        System.out.println("\nEnter name, age, roll no. and total marks: ");
        name = sc.nextLine();
        int age1 = sc.nextInt();
        int rollNumber = sc.nextInt();
        int totalMarks = sc.nextInt();
        Student s1 = new Student(name, age1, rollNumber, totalMarks);
        System.out.println("\nStudent Details: ");
        s1.display();

        sc.close();

    }

}
