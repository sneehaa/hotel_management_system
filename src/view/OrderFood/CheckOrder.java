package view.OrderFood;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class CheckOrder extends JFrame {
    JTextArea area;
    JButton checkout, back;
    FoodOrder foodOrder;
    JLabel label;


    public CheckOrder(){
        setTitle("Check Order");
        setLayout(null);
        setBounds(0,0,1550,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Color c=new Color(236, 239, 181);
        getContentPane().setBackground(c);
        JButton print = new JButton("Print Receipt");
        print.setBounds(1150,740,150,30);
        add(print);

        back = new JButton("Back");
        back.setBounds(10, 20, 80, 20);
        add(back);

        label = new JLabel("Check Order and Print Receipt");
        label.setBounds(200,200,600,30);
        label.setFont(new Font("Times New Roman", Font.BOLD,30));
        add(label);
        area = new JTextArea();
        area.setBounds(900,100,400,600);
        area.setEditable(false);
        add(area);

        checkout = new JButton("Check Order");
        checkout.setBounds(300,400,200,30);
        add(checkout);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FoodOrder foodOrder= new FoodOrder();
                foodOrder.show();
                dispose();
            }
        });



        print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setText("***********************************************************************************\n");
                area.setText(area.getText()+"*                                                     Bill Receipt                                                  *\n");
                area.setText(area.getText()+"****************************************************************************************\n");
                Date obj = new Date();

                String date = obj.toString();
                area.setText(area.getText()+"\n"+date);







            }
        });


    }

    public static void main(String[] args) {
        new CheckOrder().setVisible(true);
    }

}
