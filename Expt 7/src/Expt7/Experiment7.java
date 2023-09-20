package Expt7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Experiment7 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/goggle?zeroDateTimeBehavior=convertToNull";
            String username = "abhijeet";
            String password = "Testing123@";
            Connection conn = DriverManager.getConnection(url, username, password);
            String sql = "SELECT firstname, lastname, birthdate FROM user_info";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            System.out.println("First Name\tLast Name\tBirthdate");
            while(rs.next()) {
                System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t" + rs.getString(3));
            }
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter username: ");
            String uname = sc.nextLine();
            System.out.print("Enter password: ");
            String upass = sc.nextLine();
            sql = "SELECT * FROM user_info WHERE username = ? AND password = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, uname);
            pst.setString(2, upass);
            rs = pst.executeQuery();
            if (rs.next()) {
                System.out.println("Logged in! Welcome " + rs.getString("firstname") + "!");
            } else {
                System.out.println("Incorrect username or password");
            }
            conn.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
