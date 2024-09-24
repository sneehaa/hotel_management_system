package view.registration;

import controller.EmployeeController;
import model.Employee;
import model.Manager;
import view.homepage.Homepage;
import view.login.EmployeeLogin;




import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmployeeRegistration extends JFrame  {

    JLabel label;
    JTextField textname;
    JTextField textuser;
    JTextField textemail;
    JPasswordField password;
    JPasswordField cpass;
    JCheckBox checkBox;
    JButton button;
    JButton button1, back;
    JLabel background;
    JLabel lbl_showPass;
    JCheckBox checkBox_Password;




    public EmployeeRegistration(){



        setTitle("Sign Up Page");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0,0,1550,900);

        setLayout(null);

        ImageIcon img = new ImageIcon("public/Hotelll.jpg");
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(15,50,780,620);
        add(background);

        Color c=new Color(196, 221, 254);
        getContentPane().setBackground(c);
        label=new JLabel("EMPLOYEE  SIGN UP");
        label.setForeground(Color.black);
        label.setFont(new Font("Times New Roman",Font.BOLD,25));
        label.setBounds(868,60,500,300);
        add(label);




        label=new JLabel("Name");
        label.setBounds(850,130,500,300);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setForeground(Color.black);
        add(label);

        textname=new JTextField();
        textname.setForeground(Color.black);
        textname.setBounds(1030,270,170,20);
        add(textname);


        label=new JLabel("Username");
        label.setBounds(850,165,500,300);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setForeground(Color.black);
        add(label);
        textuser=new JTextField();
        textuser.setForeground(Color.black);
        textuser.setBounds(1030,305,170,20);
        add(textuser);


        label=new JLabel("Email");
        label.setBounds(850,200,500,300);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setForeground(Color.black);
        add(label);
        textemail=new JTextField();
        textemail.setForeground(Color.black);
        textemail.setBounds(1030,340,170,20);
        add(textemail);



        label=new JLabel("Password");
        label.setBounds(850,232,500,300);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setForeground(Color.black);
        add(label);

        password=new JPasswordField();
        password.setForeground(Color.black);
        password.setBounds(1030,371,170,20);
        add(password);


        label=new JLabel("Confirm Password");
        label.setBounds(850,263,500,300);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setForeground(Color.black);
        add(label);

        cpass=new JPasswordField();
        cpass.setForeground(Color.black);
        cpass.setBounds(1030,400,170,20);
        add(cpass);


        label=new JLabel("Already have an account?");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Times New Roman",Font.BOLD,15));
        label.setBounds(890,370,500,300);
        add(label);


        button=new JButton("Sign Up");
        button.setForeground(Color.BLACK);
        button.setBackground(new Color(253, 209, 169));
        button.setBounds(982,465,150,25);
        add(button);


        button1=new JButton("Sign In");
        button1.setForeground(Color.BLACK);
        button1.setBackground(new Color(252, 209, 171));
        button1.setBounds(1065,510,77,25);
        add(button1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmployeeLogin employeeLogin = new EmployeeLogin();
                employeeLogin.show();
                dispose();
            }
        });


        back = new JButton("Back");
        back.setBounds(10,10,98,30);

        add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Homepage home = new Homepage();
                home.show();
                dispose();
            }
        });


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass1 = String.valueOf(cpass.getPassword());
                String pass2 = String.valueOf(password.getPassword());
                String name = textname.getText();
                String username = textuser.getText();
                String email = textemail.getText();
                String passwords = String.valueOf(password.getPassword());


                if (textname.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Name");

                } else if (textuser.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Username");
                } else if (textemail.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Email");
                } else if (password.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Password");
                } else if (cpass.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Confirm Password.");

                } else {
                    if (pass1.equals(pass2)) {
                        Employee employee = new Employee(name, username, email, passwords);
                        EmployeeController employeeController = new EmployeeController();
                        int insert = employeeController.registerEmployeePreparedStatement(employee);

                        if (insert > 0) {
                            JOptionPane.showMessageDialog(null, "Successfully registered");
                            dispose();
                            new EmployeeLogin();

                        } else {
                            JOptionPane.showMessageDialog(null, "Failed to register");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Password and Confirm Password does not match");
                        cpass.requestFocus();
                    }
                }
//
            }
        });


        checkBox=new JCheckBox("Show password");
        checkBox.setForeground(Color.BLACK);
        checkBox.setBackground(new Color(214, 176, 217));
        checkBox.setFont(new Font("Times New Roman",Font.BOLD,15));
        checkBox.setBounds(940,430,150,25);
        add(checkBox);

        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox.isSelected()){
                    password.setEchoChar((char)0);
                    cpass.setEchoChar((char)0);
                }
                else{
                    password.setEchoChar('*');
                    cpass.setEchoChar('*');
                }
            }
        });


    }


    public static void main(String[] args) {

        new EmployeeRegistration().setVisible(true);
    }




}



