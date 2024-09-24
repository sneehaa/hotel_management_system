package view.Update;

import view.Profile.EditManager;
import view.Profile.ManagerProfile;
import view.Profile.ReceptionistProfile;
import view.login.ReceptionistLogin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomerDetails extends JFrame{
    JTable table=new JTable();
    JLabel GuestID, Name,Age,Gender,Address,Phoneno,BillStatus,label;
    JButton Add,Delete,Update,back;
    JComboBox box;

    public CustomerDetails(){
        setTitle("Guest Details");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0,0,1550,900);
        setLayout(null);


        Color c=new Color(234, 241, 171);
        getContentPane().setBackground(c);




        label=new JLabel("GUEST INFORMATION");
        label.setBounds(480,60,900,25);
        label.setFont(new Font("Times New Roman",Font.BOLD,25));
        label.setForeground(Color.black);
        label.setBackground(Color.black);
        add(label);

        GuestID=new JLabel("Guest ID");
        GuestID.setBackground(Color.black);
        GuestID.setForeground(Color.black);
        GuestID.setBounds(25,320,100,25);
        GuestID.setFont(new Font("Times New Roman",Font.BOLD,15));
        add(GuestID);

        JTextField GuestId=new JTextField();
        GuestId.setBounds(150,320,250,25);
        GuestId.setForeground(Color.black);
        add(GuestId);



        Name=new JLabel("Name");
        Name.setBounds(25,355,100,25);
        Name.setFont(new Font("Times New Roman",Font.BOLD,15));
        Name.setForeground(Color.black);
        Name.setBackground(Color.black);
        add(Name);

        JTextField Name=new JTextField();
        Name.setBounds(150,355,250,25);
        Name.setForeground(Color.black);
        add(Name);

        Age=new JLabel("Age");
        Age.setBackground(Color.black);
        Age.setForeground(Color.black);
        Age.setFont(new Font("Times New Roman",Font.BOLD,15));
        Age.setBounds(25,388,100,25);
        add(Age);

        JTextField Age=new JTextField();
        Age.setForeground(Color.black);
        Age.setBounds(150,388,250,25);
        add(Age);

        Gender=new JLabel("Gender");
        Gender.setBounds(25,420,100,25);
        Gender.setFont(new Font("Times New Roman",Font.BOLD,15));
        Gender.setForeground(Color.black);
        Gender.setBackground(Color.black);
        add(Gender);

        JTextField Gender=new JTextField();
        Gender.setForeground(Color.black);
        Gender.setBounds(150,420,250,25);
        add(Gender);

//        DefaultListModel items = new DefaultListModel<>();
//        String[] genders = {"Select","Male","Female","Other"};
//
//        box = new JComboBox<>(genders);
//        box.setFont(new Font("Times New Roman",Font.BOLD,15));
//        box.setBounds(150, 420, 250, 25);
//        box.setForeground(Color.black);
//        add(box);


        Address=new JLabel("Address");
        Address.setBackground(Color.black);
        Address.setForeground(Color.black);
        Address.setBounds(25,455,100,25);
        Address.setFont(new Font("Times New Roman",Font.BOLD,15));
        add(Address);

        JTextField Address=new JTextField();
        Address.setForeground(Color.black);
        Address.setBounds(150,455,250,25);
        add(Address);

        Phoneno=new JLabel("Phone no");
        Phoneno.setFont(new Font("Times New Roman",Font.BOLD,15));
        Phoneno.setForeground(Color.black);
        Phoneno.setBackground(Color.black);
        Phoneno.setBounds(25,488,100,25);
        add(Phoneno);

        JTextField Phoneno=new JTextField();
        Phoneno.setForeground(Color.black);
        Phoneno.setBounds(150,488,250,25);
        add(Phoneno);

        BillStatus=new JLabel("Bill Status");
        BillStatus.setForeground(Color.black);
        BillStatus.setFont(new Font("Times New Roman",Font.BOLD,15));
        BillStatus.setBackground(Color.black);
        BillStatus.setBounds(25,520,100,25);
        add(BillStatus);




        JTextField BillStatus=new JTextField();
        BillStatus.setForeground(Color.black);
        BillStatus.setBounds(150,520,250,25);
        add(BillStatus);


        Add=new JButton("Add");
        Add.setForeground(Color.black);
        Add.setBounds(10,590,100,25);
        Add.setBackground(new Color(148, 148, 148));
        add(Add);

        Update=new JButton("Update");
        Update.setForeground(Color.black);
        Update.setBackground(new Color(148, 148, 148));
        Update.setBounds(150,590,100,25);
        add(Update);

        Delete=new JButton("Delete");
        Delete.setForeground(Color.black);
        Delete.setBounds(290,590,100,25);
        Delete.setBackground(new Color(148, 148, 148));
        add(Delete);


        Object[] columns = {"Guest ID", "Name", "Age", "Gender", "Address", "Phone no","Bill Status"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);

        table.setBackground(new Color(253, 243, 213));
        table.setForeground(Color.black);
        Font font = new Font("Times New Roman", 1, 15);
        table.setFont(font);
        table.setBounds(10, 20, 100, 100);
        table.setRowHeight(30);

        back = new JButton("Back");
        back.setBounds(15, 10, 98, 25);
        back.setFont(new Font("Times New Roman", Font.BOLD, 12));
        add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReceptionistProfile receptionistProfile =new ReceptionistProfile();
                receptionistProfile.show();
                dispose();
            }
        });



        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(470, 120, 800, 600);
        setLayout(null);
        add(pane);


      Object[] row = new Object[7];
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (GuestID.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Please Enter GuestId");
                }
                else if(Name.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Name");
                }
                else if(Age.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Age");
                }
                else if(Gender.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Gender");
                }
                else if(Address.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Address");
                }
                else if(Phoneno.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Phone no");
                }
                else if(BillStatus.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Bill Status");
                }
                else{
                    row[0]=GuestID.getText();
                    row[1]=Name.getText();
                    row[2]=Age.getText();
                    row[3]=Gender.getText();
                    row[4]=Address.getText();
                    row[5]=Phoneno.getText();
                    row[6]=BillStatus.getText();
                    model.addRow(row);
                }

            }
        });

        Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = table.getSelectedRow();
                if (a >= 0) {
                    model.removeRow(a);
                } else {
                    System.out.println("Delete Error");
                }
            }

        });

        table.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int a = table.getSelectedRow();

                GuestId.setText(model.getValueAt(a, 0).toString());
                Name.setText(model.getValueAt(a, 1).toString());
                Age.setText(model.getValueAt(a, 2).toString());
                Gender.setText(model.getValueAt(a, 3).toString());
                Address.setText(model.getValueAt(a, 4).toString());
              Phoneno.setText(model.getValueAt(a, 5).toString());
               BillStatus.setText(model.getValueAt(a, 6).toString());
            }
        });


Update.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int a = table.getSelectedRow();

        if (a >= 0) {
            model.setValueAt(GuestID.getText(), a, 0);
            model.setValueAt(Name.getText(), a, 1);
            model.setValueAt(Age.getText(), a, 2);
            model.setValueAt(Gender.getText(), a, 3);
            model.setValueAt(Address.getText(), a, 4);
            model.setValueAt(Phoneno.getText(), a, 5);
            model.setValueAt(BillStatus.getText(), a, 6);
        } else {
            System.out.println("Update Error");
        }

    }
});







    }

    public static void main(String[] args) {
        new CustomerDetails().setVisible(true);
    }







}
