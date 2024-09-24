package view.CheckStatus;


import view.Profile.ReceptionistProfile;
import view.login.EmployeeLogin;
import view.login.ReceptionistLogin;
import view.registration.ReceptionistRegistration;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;

public class CheckStatus extends JFrame{
    ImageIcon img;
    JLabel mylbl;
    JTable table = new JTable();
    JTable table1 = new JTable();
    JTextField a,b,c,d,e,f;
    JLabel control, head, head1;
    JButton back;

    public CheckStatus() {

        // create JFrame and JTable
        setBounds(0, 0, 1550, 900);
        Color c = new Color(250, 199, 199, 255);
        getContentPane().setBackground(c);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        // create a table model and set a Column Identifiers to this model
        Object[] columns = {"Guest ID","Name", "Age", "Gender", "Bill" };
        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columns);

        // set the model to the table
        table.setModel(model);

        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);
        Font font = new Font("Times New Roman", 1, 15);
        table.setFont(font);
        table.setBounds(10, 20, 300, 80);
        table.setRowHeight(30);



        Object[] columns1 = {"Guest ID","Name", "Age", "Gender", "Advance" };
        DefaultTableModel model1 = new DefaultTableModel();
        model1.setColumnIdentifiers(columns1);

        // set the model to the table
        table1.setModel(model1);

        // Change A JTable Background Color, Font Size, Font Color, Row Height
        table1.setBackground(Color.LIGHT_GRAY);
        table1.setForeground(Color.black);
        Font fonts = new Font("Times New Roman", 1, 15);
        table1.setFont(fonts);
        table1.setBounds(0, 100, 300, 80);
        table1.setRowHeight(30);



        head = new JLabel("Check-In");
        head.setBounds(0, 80, 280, 30);
        head.setFont(new Font("Georgia", Font.PLAIN, 30));
        head.setForeground(Color.black);
        add(head);


        head1 = new JLabel("Check-Out");
        head1.setBounds(750, 80, 280, 30);
        head1.setFont(new Font("Georgia", Font.PLAIN, 30));
        head1.setForeground(Color.black);
        add(head1);


        control = new JLabel("CHECK STATUS");
        control.setBounds(700, 40, 280, 30);
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
                ReceptionistProfile receptionistProfile = new ReceptionistProfile();
                receptionistProfile.show();
                dispose();

            }
        });


        // create JButtons
        JButton btnadd = new JButton("ADD");
        JButton button = new JButton("ADD");

        btnadd.setBounds(120, 600, 150, 25);
        button.setBounds(800,600,150,25);

        // create JScrollPane
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(700, 120, 500, 450);

        JScrollPane pane1 = new JScrollPane(table1);
        pane1.setBounds(50, 120, 500, 450);





        setLayout(null);

        add(pane);
        add(pane1);


        add(btnadd);
        add(button);

        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addRow(new Object[]{a.getText(),b.getText()});
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model1.addRow(new Object[]{d.getText()});
            }
        });

        Object[] row = new Object[5];
        Object[] rows = new Object[5];


        JPanel textpanel = new JPanel(new BorderLayout());
        a = new JTextField();
        b = new JTextField();
        textpanel.add(a);
        textpanel.add(b);

        add(textpanel);


        JPanel textpanel1 = new JPanel(new BorderLayout());
        d = new JTextField();
        e = new JTextField();
        textpanel1.add(d);
        textpanel1.add(e);

        add(textpanel1);



    }

    public static void main(String[] args) {
        new view.CheckStatus.CheckStatus().setVisible(true);
    }


}






