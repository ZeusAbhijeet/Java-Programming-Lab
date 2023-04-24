package experiment5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StudentRegistration {
    private JFrame registrationFrame;
    private JDialog registrationSuccessDialog;
    private final String[] registrationFormStrings = {
            "Student Name:", "Student Email ID:", "Student Contact No.:",
            "Student DOB:", "Student Address:", "Gender:", "Student Department:"
    };
    private JLabel[] registrationFormLabels;
    private JTextField[] registrationFormTextFields;
    private JComboBox<String> registrationDeptChoices;
    private JButton registrationSubmitButton;
    private JButton registrationExitButton;
    private ButtonGroup genderGroup;

    StudentRegistration() {
        setupRegistrationFormGUI();
    }

    private void setupRegistrationFormGUI() {
        ImageIcon img = new ImageIcon("src/images/neko arc.jpg");
        registrationFrame = new JFrame("Student Registration Form");
        registrationFrame.setIconImage(img.getImage());

        JLabel registrationTitleLabel = new JLabel("Enter the details of the student", JLabel.CENTER);
        registrationTitleLabel.setFont(new Font("Cantarell", Font.BOLD, 15));
        registrationTitleLabel.setBounds(140, 10, 220, 40);

        registrationFormLabels = new JLabel[registrationFormStrings.length];
        registrationFormTextFields = new JTextField[registrationFormStrings.length - 2];
        genderGroup = new ButtonGroup();

        int x = 20, y = 60;

        for (int i = 0; i < registrationFormStrings.length; i++) {
            registrationFormLabels[i] = new JLabel(registrationFormStrings[i]);
            registrationFormLabels[i].setFont(new Font("Cantarell", Font.PLAIN, 12));
            registrationFormLabels[i].setBounds(x, y, 150, 30);
            y += 40;
            registrationFrame.add(registrationFormLabels[i]);
        }
        y = 60;
        for (int i = 0; i < registrationFormStrings.length - 2; i++) {
            registrationFormTextFields[i] = new JTextField();
            registrationFormTextFields[i].setBounds(x+160, y, 300, 30);
            y += 40;
            registrationFrame.add(registrationFormTextFields[i]);
        }


        JRadioButton genderMale = new JRadioButton("Male");
        genderMale.setActionCommand("Male");
        JRadioButton genderFemale = new JRadioButton("Female");
        genderFemale.setActionCommand("Female");
        genderGroup.add(genderMale);
        genderGroup.add(genderFemale);

        genderMale.setBounds(x+160, y, 100, 30);
        genderFemale.setBounds(x+260, y, 100, 30);
        y += 40;

        registrationDeptChoices = new JComboBox<>(new String[]{"Comp", "IT", "EComp", "Mech"});
        registrationDeptChoices.setFont(new Font("Cantarell", Font.PLAIN, 12));
        registrationDeptChoices.setBounds(x+160, y, 150, 30);

        registrationSubmitButton = new JButton("Register");
        registrationSubmitButton.setFont(new Font("Cantarell", Font.BOLD, 15));
        registrationSubmitButton.setBounds(100, y+60, 120, 25);
        registrationSubmitButton.setIcon(new ImageIcon("src/images/Check Mark 2.png"));
        registrationSubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                popupSuccessDialogBox();
            }
        });

        registrationExitButton = new JButton("Exit");
        registrationExitButton.setFont(new Font("Cantarell", Font.BOLD, 15));
        registrationExitButton.setBounds(280, y+60, 120, 25);
        registrationExitButton.setIcon(new ImageIcon("src/images/Cancel 2.png"));
        registrationExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        registrationFrame.add(registrationDeptChoices);
        registrationFrame.add(registrationTitleLabel);
        registrationFrame.add(registrationSubmitButton);
        registrationFrame.add(registrationExitButton);
        registrationFrame.add(genderMale);
        registrationFrame.add(genderFemale);

        registrationFrame.setBounds(710, 240, 500, 500);
        registrationFrame.setLayout(null);
        registrationFrame.setResizable(false);
        registrationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registrationFrame.setVisible(true);
    }

    private void popupSuccessDialogBox() {
        for (int i = 0; i < registrationFormTextFields.length; i++) {
            if (registrationFormTextFields[i].getText().isBlank()) {
                popupMissingInputDialog();
                return;
            }
        }

        registrationSuccessDialog = new JDialog(registrationFrame, "Registration Successful!");

        JLabel[] successDialogLabels;
        successDialogLabels = new JLabel[9];

        successDialogLabels[0] = new JLabel("Student \"" + registrationFormTextFields[0].getText() + "\" registered successfully.");
        successDialogLabels[0].setFont(new Font("Cantarell", Font.PLAIN, 12));
        successDialogLabels[0].setBounds(150, 10, 400, 20);

        successDialogLabels[1] = new JLabel("Details entered:");
        successDialogLabels[1].setFont(new Font("Cantarell", Font.PLAIN, 12));
        successDialogLabels[1].setBounds(150, 30, 200, 20);

        successDialogLabels[2] = new JLabel("Student Email ID: " + registrationFormTextFields[1].getText());
        successDialogLabels[2].setFont(new Font("Cantarell", Font.PLAIN, 12));
        successDialogLabels[2].setBounds(150, 50, 300, 20);

        successDialogLabels[3] = new JLabel("Student Contact No: " + registrationFormTextFields[2].getText());
        successDialogLabels[3].setFont(new Font("Cantarell", Font.PLAIN, 12));
        successDialogLabels[3].setBounds(150, 70, 200, 20);

        successDialogLabels[4] = new JLabel("Student DOB: " + registrationFormTextFields[3].getText());
        successDialogLabels[4].setFont(new Font("Cantarell", Font.PLAIN, 12));
        successDialogLabels[4].setBounds(150, 90, 200, 20);

        successDialogLabels[5] = new JLabel("Student Address: " + registrationFormTextFields[4].getText());
        successDialogLabels[5].setFont(new Font("Cantarell", Font.PLAIN, 12));
        successDialogLabels[5].setBounds(150, 110, 300, 20);

        successDialogLabels[6] = new JLabel("Gender: " + genderGroup.getSelection().getActionCommand());
        successDialogLabels[6].setFont(new Font("Cantarell", Font.PLAIN, 12));
        successDialogLabels[6].setBounds(150, 130, 300, 20);

        successDialogLabels[7] = new JLabel("Student Department: " + registrationDeptChoices.getSelectedItem());
        successDialogLabels[7].setFont(new Font("Cantarell", Font.PLAIN, 12));
        successDialogLabels[7].setBounds(150, 150, 200, 20);

        successDialogLabels[8] = new JLabel();
        successDialogLabels[8].setIcon(new ImageIcon("src/images/Check Mark 3.png"));
        successDialogLabels[8].setBounds(20, 50, 100, 100);

        JButton b = new JButton ("OK");
        b.setBounds(150, 200, 100, 40);
        b.setFont(new Font("Cantarell", Font.PLAIN, 12));
        b.setIcon(new ImageIcon("src/images/Check Mark 2.png"));
        b.addActionListener ( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                registrationSuccessDialog.dispose();
            }
        });

        for (int i = 0; i < successDialogLabels.length; i++) {
            registrationSuccessDialog.add(successDialogLabels[i]);
        }
        registrationSuccessDialog.add(b);
        registrationSuccessDialog.setBounds(760, 540-150, 400, 300);
        registrationSuccessDialog.setResizable(false);
        registrationSuccessDialog.setLayout(null);
        registrationSuccessDialog.setVisible(true);
    }

    private void popupMissingInputDialog() {
        JDialog missingInputDialog = new JDialog(registrationFrame, "Missing Fields");
        JLabel missingLabel = new JLabel("Please enter details in all fields.");
        missingLabel.setFont(new Font("Cantarell", Font.BOLD, 15));
        missingLabel.setBounds(120, 10, 300, 30);

        JLabel cautionImage = new JLabel();
        cautionImage.setIcon(new ImageIcon("src/images/Caution 2.png"));
        cautionImage.setBounds(10, 10, 100, 100);

        JButton okButton = new JButton ("OK");
        okButton.setBounds(150, 50, 100, 40);
        okButton.setFont(new Font("Cantarell", Font.BOLD, 15));
        okButton.addActionListener ( new ActionListener()
        {
            @Override
            public void actionPerformed( ActionEvent e )
            {
                missingInputDialog.dispose();
            }
        });

        missingInputDialog.add(missingLabel);
        missingInputDialog.add(cautionImage);
        missingInputDialog.add(okButton);
        missingInputDialog.setBounds(785, 465, 350, 150);
        missingInputDialog.setResizable(false);
        missingInputDialog.setLayout(null);
        missingInputDialog.setVisible(true);
    }
}

public class Expt5 {
    public static void main(String[] args) {
        new StudentRegistration();
    }
}