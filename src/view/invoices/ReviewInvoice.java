package view.invoices;

import view.OrderFood.FoodOrder;
import view.Profile.ReceptionistProfile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReviewInvoice extends JFrame {
    JLabel qr, scan;
    JButton back;
    public ReviewInvoice() {
        setTitle("Review Invoices");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500, 100, 600, 600);
        setResizable(false);
        setLayout(null);
        Color c = new Color(255, 221, 176);
        getContentPane().setBackground(c);

        scan = new JLabel("Scan and Pay");
        scan.setBounds(230,30,300,30);
        scan.setFont(new Font("Times New Roman", Font.BOLD,30));
        add(scan);

        ImageIcon img = new ImageIcon("public/scan.jpg");
        qr = new JLabel(img);
        qr.setBounds(80, 70, 450, 450);
        add(qr);

        back = new JButton("Back");
        back.setBounds(10, 20, 80, 20);
        add(back);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReceptionistProfile receptionistProfile = new ReceptionistProfile();
                receptionistProfile.show();
                dispose();
            }
        });

    }

    public static void main(String[] args) {
        new ReviewInvoice().setVisible(true);
    }
}
