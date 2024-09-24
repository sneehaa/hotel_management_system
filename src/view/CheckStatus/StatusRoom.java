package view.CheckStatus;

import view.Profile.ManagerProfile;
import view.login.ManagerLogin;
import view.registration.ManagerRegistration;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class StatusRoom extends JFrame {
    JTable table = new JTable();
    JLabel booking = new JLabel();
    JLabel available = new JLabel();
    JLabel maintenance = new JLabel();
    JLabel control;
    JButton back;


    public StatusRoom() {
        setBounds(0, 0, 1550, 900);
        Color c = new Color(204, 158, 115, 165);
        getContentPane().setBackground(c);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Object[] columns = {"Booking", "Available", "Maintenance"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);


        table.setBackground(Color.PINK);
        table.setForeground(Color.black);
        Font font = new Font("Times New Roman", 1, 15);
        table.setFont(font);
        table.setBounds(10, 20, 100, 100);
        table.setRowHeight(30);


        control = new JLabel("ROOM STATUS");
        control.setBounds(900, 40, 280, 30);
        control.setFont(new Font("Times New Roman", Font.BOLD, 30));
        control.setForeground(Color.black);
        control.setBackground(Color.black);
//         control.setOpaque(true);
        add(control);


        booking = new JLabel("Booking");
        booking.setFont(new Font("Times New Roman", Font.BOLD, 15));
        booking.setBounds(25, 250, 100, 25);
        booking.setForeground(Color.black);
        booking.setBackground(Color.black);
        add(booking);


        available = new JLabel("Available");
        available.setFont(new Font("Times New Roman", Font.BOLD, 15));
        available.setBounds(25, 280, 100, 25);
        available.setForeground(Color.black);
        available.setBackground(Color.black);
        add(available);


        maintenance = new JLabel("Maintenance");
        maintenance.setFont(new Font("Times New Roman", Font.BOLD, 15));
        maintenance.setBounds(25, 310, 100, 25);
        maintenance.setForeground(Color.black);
        maintenance.setBackground(Color.black);
        add(maintenance);


        back = new JButton("Back");
        back.setBounds(0, 10, 70, 20);
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


        JTextField booking = new JTextField();
        JTextField available = new JTextField();
        JTextField maintenance = new JTextField();

        booking.setBounds(150, 250, 300, 25);
        available.setBounds(150, 280, 300, 25);
        maintenance.setBounds(150, 310, 300, 25);


        JButton btnAdd = new JButton("Add Room");
        JButton btnUpdate = new JButton("Update Room");

        btnAdd.setBounds(10, 700, 300, 25);
        btnUpdate.setBounds(5, 700, 100, 25);


        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(500, 120, 750, 500);


        setLayout(null);

        add(pane);


        add(booking);
        add(available);
        add(maintenance);

        add(btnAdd);
        add(btnUpdate);


        Object[] row = new Object[3];


        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (booking.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Booking ID ");
                } else if (available.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Available Rooms");
                } else if (maintenance.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Room for Maintenance.");
                }

                row[0] = booking.getText();
                row[1] = available.getText();
                row[2] = maintenance.getText();
                // add row to the model
                model.addRow(row);

            }
        });


    }

    public static void main(String[] args) {
        new StatusRoom().setVisible(true);
    }
    }
