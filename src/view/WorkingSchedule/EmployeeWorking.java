//package view.WorkingSchedule;
//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//public class EmployeeWorking extends JFrame {
//    JLabel label,Name, Employeename,Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Day,Time;
//    JButton add, update, delete;
//    JTable table=new JTable();
//    JComboBox box;
//
//
//    public EmployeeWorking() {
//        setTitle("Guest Details");
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setBounds(0, 0, 1550, 900);
//        setLayout(null);
//        Color c = new Color(220, 201, 201, 121);
//        getContentPane().setBackground(c);
//
//
//
//        label=new JLabel("EMPLOYEE WORKING SCHEDULE");
//        label.setBounds(20,40,900,25);
//        label.setFont(new Font("Times New Roman",Font.BOLD,25));
//        label.setForeground(Color.black);
//        label.setBackground(Color.black);
//        add(label);
//
//        Name=new JLabel("Name");
//        Name.setBounds(20,270,900,25);
//        Name.setFont(new Font("Times New Roman",Font.PLAIN,25));
//        Name.setForeground(Color.black);
//        Name.setBackground(Color.black);
//        add(Name);
//
//        JTextField Name=new JTextField();
//        Name.setForeground(Color.black);
//        Name.setBounds(150,270,200,25);
//        add(Name);
//
//        Day=new JLabel("Day");
//        Day.setBounds(20,310,900,25);
//        Day.setFont(new Font("Times New Roman",Font.PLAIN,25));
//        Day.setForeground(Color.black);
//        Day.setBackground(Color.black);
//        add(Day);
//
//
//        DefaultListModel item = new DefaultListModel<>();
//        String[] Day = {"Select","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
//
//        box = new JComboBox<>(Day);
//        box.setFont(new Font("Times New Roman",Font.BOLD,15));
//        box.setBounds(150, 310, 200, 25);
//        box.setForeground(Color.black);
//        add(box);
//
//
//
//
//
//
//        Time=new JLabel("Time");
//        Time.setBounds(20,345,900,25);
//        Time.setFont(new Font("Times New Roman",Font.PLAIN,25));
//        Time.setForeground(Color.black);
//        Time.setBackground(Color.black);
//        add(Time);
//
//        DefaultListModel item1 = new DefaultListModel<>();
//        String[] Time = {"Select","9:00-5:30"};
//
//        box = new JComboBox<>(Time);
//        box.setFont(new Font("Times New Roman",Font.BOLD,15));
//        box.setBounds(150, 345, 200, 25);
//        box.setForeground(Color.black);
//        add(box);
//
//
//
//
//
//
//
//
//
//
//
//
//        add=new JButton("Add");
//        add.setForeground(Color.black);
//        add.setBounds(10,590,100,25);
//        add.setBackground(new Color(148, 148, 148));
//        add(add);
//
//        update=new JButton("Update");
//        update.setForeground(Color.black);
//        update.setBackground(new Color(148, 148, 148));
//        update.setBounds(150,590,100,25);
//        add(update);
//
//
//
//        delete=new JButton("Delete");
//        delete.setForeground(Color.black);
//        delete.setBounds(290,590,100,25);
//        delete.setBackground(new Color(148, 148, 148));
//        add(delete);
//
//
//
//
//
//        Object[] columns = {"Employee Name", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday"};
//        DefaultTableModel model = new DefaultTableModel();
//        model.setColumnIdentifiers(columns);
//        table.setModel(model);
//
//        table.setBackground(new Color(181, 234, 179));
//        table.setForeground(Color.black);
//        Font font = new Font("Times New Roman", 1, 15);
//        table.setFont(font);
//        table.setBounds(10, 20, 100, 100);
//        table.setRowHeight(30);
//
//        JScrollPane pane = new JScrollPane(table);
//        pane.setBounds(475, 0, 800, 690);
//        setLayout(null);
//        add(pane);
//        Object[] row = new Object[7];
//
//        add.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (Employeename.getText().trim().isEmpty()) {
//                    JOptionPane.showMessageDialog(null,"Please Enter Employee Name");
//                }
//                else if(Sunday.getText().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null,"Please Enter Day");
//                }
//                else if(Monday.getText().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null,"Please Enter Day");
//                }
//                else if(Tuesday.getText().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null,"Please Enter Day");
//                }
//                else if(Wednesday.getText().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null,"Please Enter Day");
//                }
//                else if(Thursday.getText().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null,"Please Enter Day");
//                }
//                else if(Friday.getText().trim().isEmpty()){
//                    JOptionPane.showMessageDialog(null,"Please Enter Day");
//                }
//                else{
//                    row[0]=Employeename.getText();
//                    row[1]=Sunday.getText();
//                    row[2]=Monday.getText();
//                    row[3]=Tuesday.getText();
//                    row[4]=Wednesday.getText();
//                    row[5]=Thursday.getText();
//                    row[6]=Friday.getText();
//                    row[7]=Saturday.getText();
//                    model.addRow(row);
//                }
//
//            }
//        });
//        delete.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int a = table.getSelectedRow();
//                if (a >= 0) {
//                    model.removeRow(a);
//                } else {
//                    System.out.println("Delete Error");
//                }
//            }
//
//        });
//
//        table.addMouseListener(new MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                int a = table.getSelectedRow();
//
//                Employeename.setText(model.getValueAt(a, 0).toString());
//                Sunday.setText(model.getValueAt(a, 1).toString());
//                Monday.setText(model.getValueAt(a, 2).toString());
//                Tuesday.setText(model.getValueAt(a, 3).toString());
//                Wednesday.setText(model.getValueAt(a, 4).toString());
//                Thursday.setText(model.getValueAt(a, 5).toString());
//                Friday.setText(model.getValueAt(a, 6).toString());
//                Saturday.setText(model.getValueAt(a,7).toString());
//            }
//        });
//        update.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int a = table.getSelectedRow();
//
//                if (a >= 0) {
//                    model.setValueAt(Employeename.getText(), a, 0);
//                    model.setValueAt(Sunday.getText(), a, 1);
//                    model.setValueAt(Monday.getText(), a, 2);
//                    model.setValueAt(Tuesday.getText(), a, 3);
//                    model.setValueAt(Wednesday.getText(), a, 4);
//                    model.setValueAt(Thursday.getText(), a, 5);
//                    model.setValueAt(Friday.getText(), a, 6);
//                    model.setValueAt(Saturday.getText(),a,7);
//                } else {
//                    System.out.println("Update Error");
//                }
//
//            }
//        });
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//
//
//
//    public static void main(String[] args) {
//        new EmployeeWorking().setVisible(true);
//
//    }
//}
