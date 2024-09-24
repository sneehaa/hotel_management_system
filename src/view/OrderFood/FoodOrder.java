package view.OrderFood;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class FoodOrder extends JFrame{
    JLabel head, breakfast, brkfst, dine, bev,sal, salads,dinner,bever;
    JCheckBox c1,c2,c3,c4, d1,d2,d3, s1,s2,s3,j1,j2,j3;
    JButton b1,back;
    int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12;





    public FoodOrder() {
        setTitle("Food and Beverage Order");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, 1550, 900);
        Color c = new Color(197, 183, 156);
        getContentPane().setBackground(c);

        head = new JLabel("ORDER YOUR FOOD");
        head.setBounds(600, 10, 400, 30);
        head.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(head);

        breakfast = new JLabel("BreakFast");
        breakfast.setBounds(200, 150, 200, 30);
        breakfast.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(breakfast);

        salads = new JLabel("Salads");
        salads.setBounds(200, 500, 200, 30);
        salads.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(salads);

        dinner = new JLabel("Khana Set");
        dinner.setBounds(1000, 80, 200, 30);
        dinner.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(dinner);

        bever = new JLabel("Beverages");
        bever.setBounds(1000, 450, 200, 30);
        bever.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(bever);


        ImageIcon img = new ImageIcon("public/brreak.png");
        brkfst = new JLabel("", img, JLabel.CENTER);
        brkfst.setBounds(20, 160, 150, 150);
        add(brkfst);

        ImageIcon img1 = new ImageIcon("public/salad.png");
        sal = new JLabel("", img1, JLabel.CENTER);
        sal.setBounds(20, 500, 150, 150);
        add(sal);

        ImageIcon img2 = new ImageIcon("public/dinner.png");
        dine = new JLabel("", img2, JLabel.CENTER);
        dine.setBounds(800, 100, 150, 150);
        add(dine);

        ImageIcon img3 = new ImageIcon("public/bev.png");
        bev = new JLabel("", img3, JLabel.CENTER);
        bev.setBounds(800, 500, 150, 150);
        add(bev);

        //Breakfast

        c1 = new JCheckBox("Toasted Bread(Jam/Honey)   80/-");
        c1.setBounds(200, 180, 400, 20);
        c1.setBackground(null);
        add(c1);

        c2 = new JCheckBox("Aalu Parautha Set                  100/-");
        c2.setBounds(200, 210, 400, 20);
        c2.setBackground(null);
        add(c2);

        c3 = new JCheckBox("Cornflakes with Milk              100/-");
        c3.setBounds(200, 240, 400, 20);
        c3.setBackground(null);
        add(c3);

        //Khana Set

        d1 = new JCheckBox("Khana set(Veg Curry)                   170/-");
        d1.setBounds(1000, 110, 400, 20);
        d1.setBackground(null);
        add(d1);

        d2 = new JCheckBox("Khana Set(Chicken Curry)           250/-");
        d2.setBounds(1000, 140, 400, 20);
        d2.setBackground(null);
        add(d2);

        d3 = new JCheckBox("Khana Set(Fish Curry)                  250/-");
        d3.setBounds(1000, 170, 400, 20);
        d3.setBackground(null);
        add(d3);

        //Salads
        s1 = new JCheckBox("Nepali Salad               100/-");
        s1.setBounds(200, 530, 400, 20);
        s1.setBackground(null);
        add(s1);

        s2 = new JCheckBox("Fruit Salad                  150/-");
        s2.setBounds(200, 560, 400, 20);
        s2.setBackground(null);
        add(s2);

        s3 = new JCheckBox("Russian Salad            200/-");
        s3.setBounds(200, 590, 400, 20);
        s3.setBackground(null);
        add(s3);

        //back button
        back = new JButton("Back");
        back.setBounds(10, 20, 80, 20);
        add(back);
        //Beverages

        j1 = new JCheckBox("Coffee                                   150/-");
        j1.setBounds(1000, 480, 250, 20);
        j1.setBackground(null);
        add(j1);

        j2 = new JCheckBox("Coca Cola(250ml)                  60/-");
        j2.setBounds(1000, 510, 250, 20);
        j2.setBackground(null);
        add(j2);

        j3 = new JCheckBox("RedBull(250ml)                     400/-");
        j3.setBounds(1000, 540, 250, 20);
        j3.setBackground(null);
        add(j3);


        //checkout button

        b1 = new JButton("Check Out");
        b1.setBounds(1300, 700, 150, 30);
        add(b1);
        b1.addActionListener(this::actionPerformed);

        //Action listener used

        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter the quantity");
                num1 = Integer.parseInt(str);
            }
        });
        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter the quantity");
                num2 = Integer.parseInt(str);
            }
        });
        c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter the quantity");
                num3 = Integer.parseInt(str);
            }
        });
        s1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter the quantity");
                num4 = Integer.parseInt(str);
            }
        });
        s2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter the quantity");
                num5 = Integer.parseInt(str);
            }
        });
        s3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter the quantity");
                num6 = Integer.parseInt(str);
            }
        });
        d1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter the quantity");
                num7 = Integer.parseInt(str);
            }
        });
        d2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter the quantity");
                num8 = Integer.parseInt(str);
            }
        });
        d3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter the quantity");
                num9 = Integer.parseInt(str);
            }
        });
        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter the quantity");
                num10 = Integer.parseInt(str);
            }
        });
        j2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter the quantity");
                num11 = Integer.parseInt(str);
            }
        });
        j3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter the quantity");
                num12 = Integer.parseInt(str);
            }
        });


    }
        public void actionPerformed(ActionEvent e) {
            int amt1 = 0, amt2 = 0, amt3 = 0, amt4 = 0, amt5 = 0, amt6 = 0, amt7 = 0, amt8 = 0, amt9 = 0, amt10 = 0, amt11 = 0, amt12 = 0;
            String msg1 = "", msg2 = "", msg3 = "", msg4 = "", msg5 = "", msg6 = "", msg7 = "", msg8 = "", msg9 = "", msg10 = "", msg11 = "", msg12 = "";

            if (c1.isSelected()) {
                amt1 = 80 * num1;
                msg1 = "Toasted Bread";
            }
            if (c2.isSelected()) {
                amt2 = 100 * num2;
                msg2 = "Aalu Parautha Set";
            }
            if (c3.isSelected()) {
                amt3 = 100 * num3;
                msg3 = "Aalu Parautha Set";
            }
            if (d1.isSelected()) {
                amt4 = 170 * num7;
                msg4 = "Khana set(Veg Curry)";
            }
            if (d2.isSelected()) {
                amt5 = 250 * num8;
                msg5 = "Khana set(Chicken Curry)";
            }
            if (d3.isSelected()) {
                amt6 = 250 * num9;
                msg6 = "Khana set(Fish Curry)";
            }
            if (s1.isSelected()) {
                amt7 = 100 * num4;
                msg7 = "Nepali Salad";
            }
            if (s2.isSelected()) {
                amt8 = 150 * num5;
                msg8 = "Fruit Salad";
            }
            if (s3.isSelected()) {
                amt9 = 200 * num6;
                msg9 = "Russian Salad";
            }
            if (j1.isSelected()) {
                amt10 = 150 * num10;
                msg10 = "Coffee";
            }
            if (j2.isSelected()) {
                amt11 = 60 * num11;
                msg11 = "CocaCola(250ml)";
            }
            if (j3.isSelected()) {
                amt12 = 400 * num12;
                msg12 = "RedBull(250ml)";
            }

            float order = amt1 + amt2 + amt3 + amt4 + amt5 + amt6 + amt7 + amt8 + amt9 + amt10 + amt11 + amt12;
            int res = JOptionPane.showOptionDialog(new JFrame(), msg1 + ":" + amt1 + "\n" + msg2 + ":" + amt2 + "\n"
                            + msg3 + ":" + amt3 + "\n" + msg4 + ":" + amt4 + "\n" + msg5 + ":" + amt5 + "\n" + msg6 + ":" + amt6 + "\n" + msg7 + ":" + amt7 + "\n"
                            + msg8 + ":" + amt8 + "\n" + msg9 + ":" + amt9 + "\n" + msg10 + ":" + amt10 + "\n" + msg11 + ":" + amt11 + "\n" + msg12 + ":" + amt12 + "\n"
                            + "Total" + ":" + order, "Order",

                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Confirm", "Cancel"}, JOptionPane.YES_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Order Confirmed");

                FoodOrder foodOrder = new FoodOrder();
                foodOrder.show();
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Order Canceled");
                FoodOrder foodOrder = new FoodOrder();
                foodOrder.show();
                dispose();
            }

        }
//        JOptionPane.showMessageDialog(null,msg1+":"+amt1);


    public static void main(String[] args) {
        new FoodOrder().setVisible(true);
    }

}
