package view.Payment;
import view.Profile.ReceptionistProfile;
import view.login.ReceptionistLogin;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClientTransactions extends  JFrame{
    JTable table=new JTable();
    JLabel label,Payer,Paymentfor,Paymentdate,PaymentMethod,Operator,Amount;
    JButton Add,Delete,Update,back;
    JComboBox box;
    JRadioButton Cash,Online;


    public ClientTransactions() {
        setTitle("Client Transactions");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0,0,1550,900);
        setLayout(null);
        Color c=new Color(255, 221, 176);
        getContentPane().setBackground(c);

        label=new JLabel("Payments");
        label.setBounds(980,135,900,25);
        label.setFont(new Font("Times New Roman",Font.BOLD,25));
        label.setForeground(Color.black);
        label.setBackground(Color.black);
        add(label);

        label=new JLabel("Name");
        label.setBounds(870,215,900,25);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setForeground(Color.black);
        label.setBackground(Color.black);
        add(label);

        JTextField Name=new JTextField();
        Name.setBounds(1000,215,200,25);
        Name.setForeground(Color.black);
        add(Name);

        label=new JLabel("Payment");
        label.setBounds(870,250,900,25);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setForeground(Color.black);
        label.setBackground(Color.black);
        add(label);

        DefaultListModel items = new DefaultListModel<>();
        String[] payment = {"Select","Rooms","Foods","Parking","Others"};


        box = new JComboBox<>(payment);
        box.setFont(new Font("Times New Roman",Font.BOLD,15));
        box.setBounds(1000, 250, 200, 25);
        box.setForeground(Color.black);
        add(box);


//
        label=new JLabel("Date");
        label.setBounds(870,285,900,25);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setForeground(Color.black);
        label.setBackground(Color.black);
        add(label);

        JTextField Date=new JTextField();
        Date.setBounds(1000,285,200,25);
        Date.setForeground(Color.black);
        add(Date);

        label=new JLabel("Methods");
        label.setBounds(870,320,900,25);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setForeground(Color.black);
        label.setBackground(Color.black);
        add(label);


       JRadioButton jRadioButton=new JRadioButton("Cash");
       JRadioButton jRadioButton1=new JRadioButton("Online");
       jRadioButton.setBounds(1000,320,90,20);
       jRadioButton1.setBounds(1100,320,90,20);


       add(jRadioButton);
       add(jRadioButton1);


        label=new JLabel("Operator");
        label.setBounds(870,355,900,25);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setForeground(Color.black);
        label.setBackground(Color.black);
        add(label);


        JTextField Operator=new JTextField();
        Operator.setBounds(1000,355,200,25);
        Operator.setForeground(Color.black);
        add(Operator);

        label=new JLabel("Amount");
        label.setBounds(870,390,900,25);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setForeground(Color.black);
        label.setBackground(Color.black);
        add(label);


        JTextField Amount=new JTextField();
        Amount.setBounds(1000,390,200,25);
        Amount.setForeground(Color.black);
        add(Amount);




        Add=new JButton("Add");
        Add.setForeground(Color.black);
        Add.setBounds(850,590,100,25);
        Add.setBackground(new Color(253, 243, 213));
        add(Add);

        Update=new JButton("Update");
        Update.setForeground(Color.black);
        Update.setBackground(new Color(253, 243, 213));
        Update.setBounds(1000,590,100,25);
        add(Update);

        Delete=new JButton("Delete");
        Delete.setForeground(Color.black);
        Delete.setBounds(1150,590,100,25);
        Delete.setBackground(new Color(253, 243, 213));
        add(Delete);






//
        Object[] columns = {"Payer","Payment for","Payment date","Payment method","Operator","Amount"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);


        table.setModel(model);
        table.setBackground(new Color(181, 234, 179));
        table.setForeground(Color.black);
        Font font = new Font("Times New Roman", 1, 15);
        table.setFont(font);
        table.setBounds(10, 20, 100, 100);
        table.setRowHeight(30);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 800, 690);
        setLayout(null);
        add(pane);

        Object[] row=new Object[6];
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Payer.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Payer Name");
                }
                else if(Paymentfor.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Valid Info");
                }
                else if(Paymentdate.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Date");
                }
                else if(PaymentMethod.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Methods");
                }
                else if(Operator.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Operator Name");
                }
                else if(Amount.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Total Amount");
                }
                else{
                    row[0]=Payer.getText();
                    row[1]=Paymentfor.getText();
                    row[2]=Paymentdate.getText();
                    row[3]=PaymentMethod.getText();
                    row[4]=Operator.getText();
                    row[5]=Amount.getText();
                    model.addRow(row);
                }
            }
        });

        Delete.addActionListener(new ActionListener() {

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

                Payer.setText(model.getValueAt(i, 0).toString());
                Paymentfor.setText(model.getValueAt(i, 1).toString());
                Paymentdate.setText(model.getValueAt(i, 2).toString());
                PaymentMethod.setText(model.getValueAt(i, 4).toString());
                Operator.setText(model.getValueAt(i, 5).toString());
                Amount.setText(model.getValueAt(i, 7).toString());


            }
        });
        Update.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // i = the index of the selected row
                int i = table.getSelectedRow();

                if (i >= 0) {
                    model.setValueAt(Payer.getText(), i, 0);
                    model.setValueAt(Paymentfor.getText(), i, 1);
                    model.setValueAt(Paymentdate.getText(), i, 2);
                    model.setValueAt(PaymentMethod.getText(), i, 4);
                    model.setValueAt(Operator.getText(), i, 5);
                    model.setValueAt(Amount.getText(), i, 7);


                } else {
                    System.out.println("Update Error");
                }
            }
        });



















        back = new JButton("Back");
        back.setBounds(15, -30, 98, 25);
        back.setFont(new Font("Times New Roman", Font.BOLD, 12));
        add(back);


        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReceptionistProfile receptionistProfile=new ReceptionistProfile();
                receptionistProfile.show();
                dispose();
            }
        });



//        Object[] row = new Object[6];
//        Add.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (Payer.getText().trim().isEmpty()) {
//                    JOptionPane.showMessageDialog(null,"Please Enter Payer name");
//                }
//                else if(Paymentfor.getText().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null,"Please Enter Valid");
//                }
//                else if(Paymentdate.getText().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null,"Please Enter Date");
//                }
//                else if(PaymentMethod.getText().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null,"Please Enter Payment method");
//                }
//                else if(Operator.getText().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null,"Please Enter Operator name");
//                }
//                else if(Amount.getText().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null,"Please Enter Amount");
//
//                }
//                else{
//                    row[0]=Payer.getText();
//                    row[1]=Paymentfor.getText();
//                    row[2]=Paymentdate.getText();
//                    row[3]=PaymentMethod.getText();
//                    row[4]=Operator.getText();
//                    row[5]=Amount.getText();
//                    model.addRow(row);
//                }
//
//
//            }
//        });
//        Delete.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int a = table.getSelectedRow();
//                if (a >= 0) {
//                    model.removeRow(a);
//                } else {
//                    System.out.println("Delete Error");
//                }
//            }
//        });
//
//        table.addMouseListener(new MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                int a = table.getSelectedRow();
//
//                Payer.setText(model.getValueAt(a, 0).toString());
//                Paymentfor.setText(model.getValueAt(a, 1).toString());
//                Paymentdate.setText(model.getValueAt(a, 2).toString());
//                PaymentMethod.setText(model.getValueAt(a, 3).toString());
//                Operator.setText(model.getValueAt(a, 4).toString());
//                Amount.setText(model.getValueAt(a, 5).toString());
//            }
//        });
//
//
//
//
//
//
//
//     Update.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent e) {
//             int a = table.getSelectedRow();
//
//             if (a >= 0) {
//                 model.setValueAt(Payer.getText(), a, 0);
//                 model.setValueAt(Paymentfor.getText(), a, 1);
//                 model.setValueAt(Paymentdate.getText(), a, 2);
//                 model.setValueAt(PaymentMethod.getText(), a, 3);
//                 model.setValueAt(Operator.getText(), a, 4);
//                 model.setValueAt(Amount.getText(), a, 5);
//             } else {
//                 System.out.println("Update Error");
//             }
//
//         }
//     });

        back = new JButton("Back");
        back.setBounds(1170, 5, 98, 25);
        back.setFont(new Font("Times New Roman", Font.BOLD, 12));
        add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReceptionistLogin receptionistLogin=new ReceptionistLogin();
                receptionistLogin.show();
                dispose();
            }
        });


    }





    public static void main(String[] args) {
        new ClientTransactions().setVisible(true);
    }
}
