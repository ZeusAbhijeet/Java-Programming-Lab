package expt2a;
import java.util.Scanner;

class College {
    private String name;
    private String city;
    private int numStudents;
    private boolean isPublic;

    // Default constructor
    College() {
        this.name = "Default College";
        this.city = "Default City";
        this.numStudents = 0;
        this.isPublic = true;
    }

    // Parameterised Constructor
    College(String name, String city, int num, boolean isPublic) {
        this.name = name;
        this.city = city;
        this.numStudents = num;
        this.isPublic = isPublic;
    }

    // Copy Constructor
    College(College copy) {
        this.name = copy.name;
        this.city = copy.city;
        this.numStudents = copy.numStudents;
        this.isPublic = copy.isPublic;
    }

    // Display all details
    void display() {
        System.out.println("College Name: " + name);
        System.out.println("College City: " + city);
        System.out.println("Number of students: " + numStudents);
        System.out.println("College type: " + (isPublic ? "Public" : "Private"));
    }
}

public class Expt2A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        College c1 = new College();
        System.out.println("Default college details: ");
        c1.display();

        System.out.println();
        System.out.println("Enter college name, city, number of students:");
        String name = sc.nextLine();
        String city = sc.nextLine();
        int num = sc.nextInt();
        System.out.print("Is the college a public college? true/false: ");
        boolean b = sc.nextBoolean();
        System.out.println();

        College c2 = new College(name, city, num, b);
        c2.display();

        College c3 = new College(c2);
        System.out.println("\nCopied details:");
        c3.display();

        sc.close();
    }

}
