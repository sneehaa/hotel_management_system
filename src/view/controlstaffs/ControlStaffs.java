package view.controlstaffs;

import view.Profile.ManagerProfile;
import view.homepage.Homepage;
import view.registration.ManagerRegistration;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


public class ControlStaffs extends JFrame{
    ImageIcon img;
    JLabel mylbl;
    JTable table = new JTable();
    JLabel labelid = new JLabel();
    JLabel labelfn = new JLabel();
    JLabel labelwd = new JLabel();
    JLabel labeldes = new JLabel();
    JLabel control, head;
    JButton back;




    public ControlStaffs() {


        // create JFrame and JTable
        setBounds(0, 0, 1550, 900);
        Color c = new Color(184, 234, 255);
        getContentPane().setBackground(c);







        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);






        // create a table model and set a Column Identifiers to this model
        Object[] columns = {"ID", "Full Name", "Working Days", "Designation"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        // set the model to the table
        table.setModel(model);

        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("Times New Roman", 1, 15);
        table.setFont(font);
        table.setBounds(10, 20, 100, 100);
        table.setRowHeight(30);


        //create JLabels
        head = new JLabel("EMERALD");
        head.setBounds(130, 250, 500, 70);
        head.setFont(new Font("Georgia", Font.BOLD, 60));
        head.setForeground(Color.black);
        add(head);

        control = new JLabel("CONTROL STAFFS");
        control.setBounds(900, 40, 280, 30);
        control.setFont(new Font("Times New Roman", Font.BOLD, 30));
        control.setForeground(Color.black);
        control.setBackground(Color.black);
//         control.setOpaque(true);
        add(control);

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

        JRadioButton r1=new JRadioButton("A. Receptionist");
        JRadioButton r2=new JRadioButton("B. Employee");
        r1.setBounds(200,640,200,30);
        r2.setBounds(200,670,200,30);
        ButtonGroup bg=new ButtonGroup();
        r1.setBackground(null);
        r2.setBackground(null);
        bg.add(r1);
        bg.add(r2);
        add(r1);
        add(r2);



        labelid = new JLabel("ID Number");
        labelid.setFont(new Font("Times New Roman", Font.BOLD, 15));
        labelid.setBounds(25, 550, 100, 25);
        labelid.setForeground(Color.black);
        labelid.setBackground(Color.black);
//        labelid.setOpaque(true);
        add(labelid);

        labelfn = new JLabel("Full Name");
        labelfn.setFont(new Font("Times New Roman", Font.BOLD, 15));
        labelfn.setBounds(25, 580, 100, 25);
        labelfn.setForeground(Color.black);
        labelfn.setBackground(Color.black);
//        labelfn.setOpaque(true);
        add(labelfn);

        labelwd = new JLabel("Working Days");
        labelwd.setFont(new Font("Times New Roman", Font.BOLD, 15));
        labelwd.setBounds(25, 610, 100, 25);
        labelwd.setForeground(Color.black);
        labelwd.setBackground(Color.black);
//        labelwd.setOpaque(true);

        add(labelwd);


        labeldes = new JLabel("Designation");
        labeldes.setFont(new Font("Times New Roman", Font.BOLD, 15));
        labeldes.setBounds(25, 640, 100, 25);
        labeldes.setForeground(Color.black);
//        labeldes.setOpaque(true);
        labeldes.setBackground(Color.black);
        add(labeldes);

        // create JTextFields
        JTextField textId = new JTextField();
        JTextField textFname = new JTextField();
        JTextField textWorkD = new JTextField();
//        JTextField textDesig = new JTextField();

        // create JButtons
        JButton btnAdd = new JButton("Add");
        JButton btnDelete = new JButton("Delete");
        JButton btnUpdate = new JButton("Update");

        textId.setBounds(150, 550, 300, 25);
        textFname.setBounds(150, 580, 300, 25);
        textWorkD.setBounds(150, 610, 300, 25);
//        textDesig.setBounds(150, 640, 300, 25);

        btnAdd.setBounds(510, 550, 100, 25);
        btnUpdate.setBounds(510, 595, 100, 25);
        btnDelete.setBounds(510, 640, 100, 25);

        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(650, 120, 800, 600);
//        pane.setForeground(Color.black);
//        table.setBackground(Color.black);


        setLayout(null);

        add(pane);

        // add JTextFields to the jframe
        add(textId);
        add(textFname);
        add(textWorkD);
//        add(textDesig);

        // add JButtons to the jframe
        add(btnAdd);
        add(btnDelete);
        add(btnDelete);
        add(btnUpdate);

        // create an array of objects to set the row data
        Object[] row = new Object[4];

        // button add row
        btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //Validation
                if (textId.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Id.");
                } else if (textFname.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Full Name.");
                } else if (textWorkD.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Working days.");
                } else if (!r1.isSelected() && !r2.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Please Select Designation.");
                } else {

                    row[0] = textId.getText();
                    row[1] = textFname.getText();
                    row[2] = textWorkD.getText();
                    if(r1.isSelected()){
                    row[3] = r1.getText();}
                    else{
                    row[3] = r2.getText();}

                    // add row to the model
                    model.addRow(row);
                }
            }
        });

        // button remove row
        btnDelete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // i = the index of the selected row
                int i = table.getSelectedRow();
                if (i >= 0) {
                    // remove a row from jtable
                    model.removeRow(i);
                } else {
                    System.out.println("Delete Error");
                }
            }
        });

        // get selected row data From table to textfields
        table.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                // i = the index of the selected row
                int i = table.getSelectedRow();

                textId.setText(model.getValueAt(i, 0).toString());
                textFname.setText(model.getValueAt(i, 1).toString());
                textWorkD.setText(model.getValueAt(i, 2).toString());
                if(r1.isSelected()){
                r1.setText(model.getValueAt(i, 3).toString());}
                else{
                r2.setText(model.getValueAt(i, 3).toString());
            }}
        });

        // button update row
        btnUpdate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // i = the index of the selected row
                int i = table.getSelectedRow();

                if (i >= 0) {
                    model.setValueAt(textId.getText(), i, 0);
                    model.setValueAt(textFname.getText(), i, 1);
                    model.setValueAt(textWorkD.getText(), i, 2);
                    if(r1.isSelected()){
                    model.setValueAt(r1.getText(), i, 3);}
                    else if(r2.isSelected()){
                        model.setValueAt(r1.getText(), i, 3);
                    }
                } else {
                    System.out.println("Update Error");
                }
            }
        });




    }

    public static void main(String[] args) {
        new ControlStaffs().setVisible(true);
    }


}








