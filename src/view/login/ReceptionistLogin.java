package view.login;

import view.homepage.Homepage;
import view.registration.ReceptionistRegistration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReceptionistLogin extends JFrame {
    public static int Receptionist_ID=0;
    JLabel label;
    JTextField userid;
    JPasswordField password;
    JButton button, back;
    JButton button1;
    JLabel background;
    JCheckBox checkBox;
    JTextField setEchoChar;

    public ReceptionistLogin() {
        setTitle("Login Page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, 1550, 900);
        setLayout(null);

        ImageIcon img = new ImageIcon("public/reception.jpg");
        background = new JLabel("",img,JLabel.CENTER);
        background.setBounds(15,30,870,680);
        add(background);

        Color c=new Color(215, 245, 215);
        getContentPane().setBackground(c);
        label=new JLabel("RECEPTIONIST LOGIN");
        label.setForeground(Color.black);
        label.setFont(new Font("Times New Roman",Font.BOLD,25));
        label.setBounds(900,60,500,300);
        add(label);

        label=new JLabel("Receptionist Id");
        label.setBounds(900,130,500,300);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setForeground(Color.black);
        add(label);

        userid=new JTextField();
        userid.setForeground(Color.black);
        userid.setBounds(1060,270,170,20);
        add(userid);

        label=new JLabel("Password");
        label.setBounds(900,165,500,300);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setForeground(Color.black);
        add(label);

        password=new JPasswordField();
        password.setForeground(Color.black);
        password.setBounds(1060,305,170,20);
        add(password);



        button=new JButton("Log In");
        button.setForeground(Color.BLACK);
        button.setBackground(new Color(252, 209, 171));
        button.setBounds(1010,380,100,25);
        add(button);

        label=new JLabel("Don't have an account?");
        label.setBounds(910,280,500,300);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setForeground(Color.black);
        add(label);

        button1=new JButton("Sign up");
        button1.setForeground(Color.BLACK);
        button1.setBackground(new Color(252, 209, 171));
        button1.setBounds(1100,418,100,25);
        add(button1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReceptionistRegistration receptionistRegistration = new ReceptionistRegistration();
                receptionistRegistration.show();
                dispose();
            }
        });


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(userid.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Employee Id");

                }
                else if(password.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Password");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Log in successfully");
                }


            }
        });

        checkBox=new JCheckBox("Show password");
        checkBox.setForeground(Color.BLACK);
        checkBox.setBackground(new Color(215, 163, 248));
        checkBox.setFont(new Font("Times New Roman",Font.BOLD,17));
        checkBox.setBounds(990,340,150,25);
        add(checkBox);

        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox.isSelected()){
                    password.setEchoChar((char)0);

                }
                else{
                    password.setEchoChar('*');
                }
            }
        });
        back = new JButton("Back");
        back.setBounds(10,10,98,30);
        add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Homepage homepage=new Homepage();
                homepage.show();
                dispose();
            }
        });

    }

    public static void main(String[] args) {
        new ReceptionistLogin().setVisible(true);


    }
}
