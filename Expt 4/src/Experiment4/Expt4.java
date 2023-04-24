package Experiment4;

import java.awt.*;
import java.awt.event.*;

class SuccessDialog {
    SuccessDialog(TextField tf1, TextField tf2, TextField tf3, TextField tf4, Choice c1) {
        Frame registrationsuccess = new Frame();
        Dialog d = new Dialog(registrationsuccess, "Success", true);

        Label l1 = new Label("Student \"" + tf1.getText() + "\" registered successfully.");
        l1.setFont(new Font("Cantarell", Font.PLAIN, 12));
        l1.setBounds(20, 40, 400, 30);

        Label l2 = new Label("Details entered:");
        l2.setFont(new Font("Cantarell", Font.PLAIN, 12));
        l2.setBounds(20, 60, 200, 30);

        Label l3 = new Label("Student Email ID: " + tf2.getText());
        l3.setFont(new Font("Cantarell", Font.PLAIN, 12));
        l3.setBounds(20, 80, 300, 30);

        Label l4 = new Label("Student Contact No: " + tf3.getText());
        l4.setFont(new Font("Cantarell", Font.PLAIN, 12));
        l4.setBounds(20, 100, 200, 30);

        Label l5 = new Label("Student Address: " + tf4.getText());
        l5.setFont(new Font("Cantarell", Font.PLAIN, 12));
        l5.setBounds(20, 120, 300, 30);

        Label l6 = new Label("Student Department: " + c1.getSelectedItem());
        l6.setFont(new Font("Cantarell", Font.PLAIN, 12));
        l6.setBounds(20, 140, 200, 30);

        Button b = new Button ("OK");
        b.setBounds(150, 170, 100, 40);
        b.setFont(new Font("Cantarell", Font.PLAIN, 12));

        b.addActionListener ( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                registrationsuccess.dispose();
            }
        });

        d.add(l1);
        d.add(l2);
        d.add(l3);
        d.add(l4);
        d.add(l5);
        d.add(l6);
        d.add(b);
        d.setSize(400, 250);
        d.setResizable(false);
        d.setLayout(null);
        d.setVisible(true);
    }
}

class RegistrationFrame {
    RegistrationFrame() {
        Frame frame;
        frame = new Frame("Student Registration Form");

        Label studentregtitle = new Label("Enter the details of the student");
        studentregtitle.setFont(new Font("Cantarell", Font.BOLD, 15));
        studentregtitle.setBounds(140, 40, 300, 40);

        Label studentnamelabel = new Label("Student Name:");
        studentnamelabel.setFont(new Font("Cantarell", Font.PLAIN, 12));
        studentnamelabel.setBounds(20, 80, 100, 30);
        TextField studentnametextfield = new TextField();
        studentnametextfield.setBounds(150, 80, 300, 30);

        Label studentemaillabel = new Label("Student Email ID:");
        studentemaillabel.setFont(new Font("Cantarell", Font.PLAIN, 12));
        studentemaillabel.setBounds(20, 120, 100, 30);
        TextField studentemailtextfield = new TextField();
        studentemailtextfield.setBounds(150, 120, 300, 30);

        Label studentcontactlabel = new Label("Student Contact No:");
        studentcontactlabel.setFont(new Font("Cantarell", Font.PLAIN, 12));
        studentcontactlabel.setBounds(20, 160, 110, 30);
        TextField studentcontactextfield = new TextField();
        studentcontactextfield.setBounds(150, 160, 300, 30);

        Label studentaddresslabel = new Label("Student Address:");
        studentaddresslabel.setFont(new Font("Cantarell", Font.PLAIN, 12));
        studentaddresslabel.setBounds(20, 200, 100, 30);
        TextField studentaddresstextfield = new TextField();
        studentaddresstextfield.setBounds(150, 200, 300, 30);

        Label studentdepartmentlabel = new Label("Student Department:");
        studentdepartmentlabel.setFont(new Font("Cantarell", Font.PLAIN, 12));
        studentdepartmentlabel.setBounds(20, 240, 110, 30);
        Choice studentdepartmentchoice = new Choice();
        studentdepartmentchoice.setBounds(150, 240, 100, 30);
        studentdepartmentchoice.add("Mechanical");
        studentdepartmentchoice.add("EComp");
        studentdepartmentchoice.add("Computer");
        studentdepartmentchoice.add("IT");

        Button button = new Button("Register");
        button.setFont(new Font("Cantarell", Font.PLAIN, 15));
        button.setBounds(100, 300, 100, 25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SuccessDialog(
                        studentnametextfield,
                        studentemailtextfield,
                        studentcontactextfield,
                        studentaddresstextfield,
                        studentdepartmentchoice
                );
            }
        });

        Button closebutton = new Button("Exit");
        closebutton.setFont(new Font("Cantarell", Font.PLAIN, 15));
        closebutton.setBounds(300, 300, 100, 25);
        closebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(studentregtitle);
        frame.add(studentnamelabel);
        frame.add(studentnametextfield);
        frame.add(studentemaillabel);
        frame.add(studentemailtextfield);
        frame.add(studentcontactlabel);
        frame.add(studentcontactextfield);
        frame.add(studentaddresslabel);
        frame.add(studentaddresstextfield);
        frame.add(studentdepartmentlabel);
        frame.add(studentdepartmentchoice);
        frame.add(button);
        frame.add(closebutton);


        frame.setBounds(500, 500, 500, 500);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}

public class Expt4 {
    public static void main(String[] args) {
        new RegistrationFrame();
    }
}
