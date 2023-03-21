package expt3;
import java.util.Scanner;

interface Teacher {
    void teach();
}

interface Student {
    void learn();
}

interface Administrator {
    void manage();
}

class CollegeStudent implements Teacher, Student, Administrator {
    @Override
    public void teach() {
        System.out.println("Teaching");
    }

    @Override
    public void learn() {
        System.out.println("Learning");
    }

    @Override
    public void manage() {
        System.out.println("Managing");
    }
}

public class Expt3 {
    public static void main(String[] args) {
        CollegeStudent cs1 = new CollegeStudent();
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("1. Teach");
            System.out.println("2. Learn");
            System.out.println("3. Manage");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    cs1.teach();
                    break;
                case 2:
                    cs1.learn();
                    break;
                case 3:
                    cs1.manage();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 4);

        sc.close();
    }
}