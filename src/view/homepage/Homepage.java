package view.homepage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import view.registration.EmployeeRegistration;
import view.registration.ManagerRegistration;
import view.registration.ReceptionistRegistration;

public class Homepage extends JFrame {

    JButton enter;
    JComboBox box;
    JLabel label, label1, label2;
    JButton manage, recep, employ;
    JMenuBar bar;

    public Homepage() {

        setTitle("Emerald Bay Inn");

        setBounds(0, 0, 1550, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        try {
            setContentPane((new JLabel(new ImageIcon(ImageIO.read(new File("public/h.jpg"))))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //
        // DefaultListModel items = new DefaultListModel<>();
        // String[] staffs = {"Select","Manager","Receptionist","Employee"};

        // box = new JComboBox<>(staffs);
        // box.setFont(new Font("Times New Roman",Font.BOLD,20));
        // box.setBounds(300,200,900,40);
        // add(box);

        manage = new JButton("Manager");
        manage.setBounds(330, 300, 300, 40);
        add(manage);
        recep = new JButton("Receptionist");
        recep.setBounds(630, 300, 300, 40);
        add(recep);
        employ = new JButton("Employee");
        employ.setBounds(930, 300, 300, 40);
        add(employ);

        // enter = new JButton("Enter");
        // enter.setBounds(1000,300,200,30);
        // add(enter);

        label = new JLabel("EMERALD BAY INN");
        label.setFont(new Font("Georgia", Font.BOLD, 60));
        label.setBounds(80, 700, 700, 50);
        label.setForeground(Color.black);
        add(label);

        label1 = new JLabel("WELCOME");
        label1.setFont(new Font("Georgia", Font.BOLD, 30));
        label1.setBounds(80, 500, 700, 50);
        label1.setForeground(Color.black);
        add(label1);

        label2 = new JLabel("TO");
        label2.setFont(new Font("Georgia", Font.BOLD, 30));
        label2.setBounds(80, 600, 700, 50);
        label2.setForeground(Color.black);
        add(label2);

        manage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManagerRegistration managerregistration = new ManagerRegistration();
                managerregistration.show();
                dispose();
            }
        });

        recep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReceptionistRegistration receptionistregistration = new ReceptionistRegistration();
                receptionistregistration.show();
                dispose();

            }
        });

        employ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmployeeRegistration employeeregistration = new EmployeeRegistration();
                employeeregistration.show();
                dispose();

            }
        });

    }

    public static void main(String[] args) {
        new Homepage().setVisible(true);

    }

}
