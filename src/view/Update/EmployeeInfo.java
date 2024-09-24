package view.Update;

import view.Profile.ManagerProfile;
import view.controlstaffs.ControlStaffs;
import view.login.ManagerLogin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class EmployeeInfo extends JFrame {
    JTable table = new JTable();
    JLabel employeeID;
    JLabel name;
    JLabel age;
    JLabel gender;
    JLabel address;
    JLabel department;
    JLabel contact;
    JLabel info;
    JButton buttonadd;
    JButton buttonupdate;
    JButton buttondelete;
    JButton back;
    JComboBox box, box1;



    public EmployeeInfo() {

        setBounds(0, 0, 1550, 900);
        Color c = new Color(192, 241, 213, 226);
        getContentPane().setBackground(c);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        DefaultListModel items = new DefaultListModel<>();
        String[] genders = {"Select","Male","Female","Other"};

        box = new JComboBox<>(genders);
        box.setFont(new Font("Times New Roman",Font.BOLD,15));
         box.setBounds(150, 440, 300, 25);
         add(box);



        DefaultListModel item1= new DefaultListModel<>();
        String[] departments = {"Select","Manager","Employee","Receptionists"};

        box = new JComboBox<>(departments);
        box.setFont(new Font("Times New Roman",Font.BOLD,15));
        box.setBounds(150, 500, 300, 25);
        add(box);






        Object[] columns = {"Employee ID", "Name", "Age", "Gender", "Address", "Department", "Contact"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);

        table.setBackground(Color.pink);
        table.setForeground(Color.black);
        Font font = new Font("Times New Roman", 1, 15);
        table.setFont(font);
        table.setBounds(10, 20, 100, 100);
        table.setRowHeight(30);


        info = new JLabel("EMPLOYEE INFORMATION");
        info.setBounds(400, 40, 900, 20);
        info.setFont(new Font("Times New Roman", Font.BOLD, 30));
        info.setForeground(Color.black);
        info.setBackground(Color.black);
//         info.setOpaque(true);
        add(info);

        employeeID = new JLabel("Employee ID");
        employeeID.setFont(new Font("Times New Roman", Font.BOLD, 15));
        employeeID.setBounds(25, 350, 100, 25);
        employeeID.setForeground(Color.black);
        employeeID.setBackground(Color.black);
//        employeeID.setOpaque(true);
        add(employeeID);

        name = new JLabel("Name");
        name.setFont(new Font("Times New Roman", Font.BOLD, 15));
        name.setBounds(25, 380, 100, 25);
        name.setForeground(Color.black);
        name.setBackground(Color.black);
//        name.setOpaque(true);
        add(name);

        age = new JLabel("Age");
        age.setFont(new Font("Times New Roman", Font.BOLD, 15));
        age.setBounds(25, 410, 100, 25);
        age.setForeground(Color.black);
        age.setBackground(Color.black);
//        age.setOpaque(true);
        add(age);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Times New Roman", Font.BOLD, 15));
        gender.setBounds(25, 440, 100, 25);
        gender.setForeground(Color.black);
        gender.setBackground(Color.black);
//        gender.setOpaque(true);
        add(gender);


        address = new JLabel("Address");
        address.setFont(new Font("Times New Roman", Font.BOLD, 15));
        address.setBounds(25, 470, 100, 25);
        address.setForeground(Color.black);
        address.setBackground(Color.black);
//        address.setOpaque(true);
        add(address);


        department = new JLabel("Department");
        department.setFont(new Font("Times New Roman", Font.BOLD, 15));
        department.setBounds(25, 500, 100, 25);
        department.setForeground(Color.black);
        department.setBackground(Color.black);
//        department.setOpaque(true);
        add(department);


        contact = new JLabel("Contact");
        contact.setFont(new Font("Times New Roman", Font.BOLD, 15));
        contact.setBounds(25, 530, 100, 25);
        contact.setForeground(Color.black);
        contact.setBackground(Color.black);
        add(contact);


        back = new JButton("Back");
        back.setBounds(10, 70, 98, 30);
        back.setFont(new Font("Times New Roman", Font.BOLD, 10));
        add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManagerProfile managerProfile = new ManagerProfile();
               managerProfile.show();
                dispose();

            }
        });

        JTextField employeeID = new JTextField();
        JTextField name = new JTextField();
        JTextField age = new JTextField();
        JTextField address = new JTextField();
        JTextField contact = new JTextField();

        JButton buttonadd = new JButton("Add");
        JButton buttondelete = new JButton("Delete");
        JButton buttonupdate = new JButton("Update");

        employeeID.setBounds(150, 350, 300, 25);
        name.setBounds(150, 380, 300, 25);
        age.setBounds(150, 410, 300, 25);
        address.setBounds(150, 470, 300, 25);
        contact.setBounds(150, 530, 300, 25);

        buttonadd.setBounds(10, 600, 100, 25);
        buttondelete.setBounds(180, 600, 100, 25);
        buttonupdate.setBounds(350, 600, 100, 25);



        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(650, 120, 800, 600);


        setLayout(null);

        add(pane);


        add(employeeID);
        add(name);
        add(age);
        add(address);
        add(contact);

        add(buttonadd);
        add(buttondelete);
        add(buttonupdate);

        Object[] row = new Object[8];

        buttonadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (employeeID.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Id.");
                } else if (name.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Full Name.");
                } else if (age.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Age.");
                } else if (address.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Address");
                } else if (contact.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Contact");
                } else {

                    row[0] = employeeID.getText();
                    row[1] = name.getText();
                    row[2] = age.getText();
                    row[4] = address.getText();
                    row[6] = contact.getText();


                    // add row to the model
                    model.addRow(row);
                }
            }
        });

        buttondelete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int i = table.getSelectedRow();
                if (i >= 0) {
                    model.removeRow(i);
                } else {
                    System.out.println("Delete Error");
                }
            }
        });


        table.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // i = the index of the selected row
                int i = table.getSelectedRow();

                employeeID.setText(model.getValueAt(i, 0).toString());
                name.setText(model.getValueAt(i, 1).toString());
                age.setText(model.getValueAt(i, 2).toString());
                address.setText(model.getValueAt(i, 4).toString());
                contact.setText(model.getValueAt(i, 6).toString());

            }
        });

        // button update row
        buttonupdate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // i = the index of the selected row
                int i = table.getSelectedRow();

                if (i >= 0) {
                    model.setValueAt(employeeID.getText(), i, 0);
                    model.setValueAt(name.getText(), i, 1);
                    model.setValueAt(age.getText(), i, 2);
                    model.setValueAt(address.getText(), i, 4);
                    model.setValueAt(contact.getText(), i, 6);

                } else {
                    System.out.println("Update Error");
                }
            }
        });

    }

    public static void main(String[] args) {
        new EmployeeInfo().setVisible(true);
    }
}
