package view.login;

import java.awt.Color;

import javax.swing.JFrame;
import view.homepage.Homepage;

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

import controller.ManagerController;
import model.Manager;
import view.Profile.ManagerProfile;
import view.homepage.Homepage;
import view.registration.ManagerRegistration;

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

public class ManagerLogin extends JFrame {
    JLabel label;
    JTextField userid;
    JPasswordField password;
    JButton button;
    JButton back;

    JButton button1;
    JLabel background;
    JCheckBox checkBox;
    JTextField setEchoChar;

    public static int MANAGER_ID = 0;


    public ManagerLogin() {
        setTitle("Login Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, 1550, 900);
        setLayout(null);

        ImageIcon img = new ImageIcon("public/managerr.jpg");
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(15,30,870,680);
        add(background);


        Color c = new Color(197, 183, 156);
        getContentPane().setBackground(c);
        label = new JLabel("Manager LOGIN");
        label.setForeground(Color.black);
        label.setFont(new Font("Times New Roman", Font.BOLD, 25));
        label.setBounds(950, 60, 500, 300);
        add(label);

        label = new JLabel("Manager Id");
        label.setBounds(930, 130, 500, 300);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        label.setForeground(Color.black);
        add(label);

        userid = new JTextField();
        userid.setForeground(Color.black);
        userid.setBounds(1060, 270, 170, 20);
        add(userid);

        label = new JLabel("Password");
        label.setBounds(930, 165, 500, 300);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        label.setForeground(Color.black);
        add(label);

        password = new JPasswordField();
        password.setForeground(Color.black);
        password.setBounds(1060, 305, 170, 20);
        add(password);

        button = new JButton("LOG IN");
        button.setForeground(Color.BLACK);
        button.setBackground(new Color(191, 255, 202));
        button.setBounds(1030, 380, 100, 25);
        add(button);

        label = new JLabel("Don't have an account?");
        label.setBounds(950, 280, 500, 300);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        label.setForeground(Color.black);
        add(label);

        button1 = new JButton("Sign up");
        button1.setForeground(Color.BLACK);
        button1.setBackground(new Color(191, 255, 202));
        button1.setBounds(1140, 418, 100, 25);
        add(button1);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userid.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Employee Id");

                } else if (password.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Password");
                } else {
                    JOptionPane.showMessageDialog(null, "Log in successfully");
                }

            }
        });

        checkBox = new JCheckBox("Show password");
        checkBox.setForeground(Color.BLACK);
        checkBox.setBackground(new Color(101, 141, 152));
        checkBox.setFont(new Font("Times New Roman", Font.BOLD, 15));
        checkBox.setBounds(1000, 340, 150, 25);
        add(checkBox);

        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    password.setEchoChar((char) 0);

                } else {
                    password.setEchoChar('*');
                }
            }
        });

    }

    public static void main(String[] args) {
        new ManagerLogin().setVisible(true);

    }
}