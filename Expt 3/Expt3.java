package experiment3;
import java.util.Scanner;

class EnrollmentThread extends Thread {
    private String studentName;
    private String courseName;
    private int studentAge;
    private String studentAddress;

    public EnrollmentThread(String sName, String cName, int sAge, String sAdd) {
        this.studentName = sName;
        this.courseName = cName;
        this.studentAge = sAge;
        this.studentAddress = sAdd;
    }

    @Override
    public void run() {
        System.out.println("Enrolling " + studentName + " in " + courseName + "....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("ERROR: Student enrollment failed with exception: " + e.getMessage());
        }
        System.out.println("Student " + studentName + " successfully enrolled to " + courseName);
    }
}

public class Expt3 {
    public static void main(String[] args) {
        EnrollmentThread[] et = new EnrollmentThread[5];
        Scanner sc = new Scanner(System.in);
        String sName, cName, sAddress;
        int sAge;

        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter Student age: ");
            sAge = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Student name: ");
            sName = sc.nextLine();
            System.out.print("Enter Student address: ");
            sAddress = sc.nextLine();
            System.out.print("Enter Course name: ");
            cName = sc.nextLine();
            et[i] = new EnrollmentThread(sName, cName, sAge, sAddress);
        }
        System.out.println();

        for (int i = 0; i < 5; i++)
            et[i].start();

        sc.close();
    }
}