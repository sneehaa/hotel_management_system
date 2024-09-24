//package view.Profile;
//
//import controller.ManagerController;
//import model.Manager;
//import view.CheckStatus.StatusRoom;
//import view.Update.CustomerDetails;
//import view.Update.EmployeeInfo;
//import view.controlstaffs.ControlStaffs;
//import view.login.ManagerLogin;
//
//import javax.swing.*;
//import javax.swing.border.Border;
//import javax.swing.border.TitledBorder;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class ManagerProfile extends JFrame {
//    Manager manager;
//    JLabel label, background,man, welcome,welcome1,welcome2,welcome3,welcome4,welcome5, name, username, email,address,gender, designation, contact, designation1;
//    JButton emp, guest,stat,stat1, room, edit;
//    JPanel panel;
//    JTextField wel,wel1,wel2,wel3,wel4,wel5,welm;
//
//    ManagerController managerController;
//    public ManagerProfile(){
//        setTitle("Profile");
//        setSize(1550,900);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setLayout(null);
//
//        Color c=new Color(196, 221, 254);
//        getContentPane().setBackground(c);
//
//        this.managerController = new ManagerController();
//        this.manager=managerController.fetchLoggedInManager();
//
//        label = new JLabel("PROFILE");
//        label.setBounds(700,50,200,30);
//        label.setFont(new Font("Times New Roman",Font.BOLD,30));
//        add(label);
//
//        panel = new JPanel(new BorderLayout());
//        panel.setBounds(800,150,600,600);
//        Border blackline = BorderFactory.createLineBorder(Color.black);
//        panel.setBorder(blackline);
//        panel.setBackground(null);
//
//        edit = new JButton("Edit Profile");
//        edit.setBounds(1250,690,100,30);
//        add(edit);
//
//        name = new JLabel("Name :");
//        name.setBounds(850,350,100,20);
//        name.setFont(new Font("Times New Roman", Font.BOLD,20));
//        add(name);
//
//        username = new JLabel("Username :");
//        username.setBounds(850,400,100,20);
//        username.setFont(new Font("Times New Roman", Font.BOLD,20));
//        add(username);
//
//        email = new JLabel("Email :");
//        email.setBounds(850,450,100,20);
//        email.setFont(new Font("Times New Roman", Font.BOLD,20));
//        add(email);
//
//        gender = new JLabel("Gender :");
//        gender.setBounds(850,500,100,20);
//        gender.setFont(new Font("Times New Roman", Font.BOLD,20));
//        add(gender);
//
//        address = new JLabel("Address :");
//        address.setBounds(850,550,100,20);
//        address.setFont(new Font("Times New Roman", Font.BOLD,20));
//        add(address);
//
//        contact = new JLabel("Contact :");
//        contact.setBounds(850,600,100,20);
//        contact.setFont(new Font("Times New Roman", Font.BOLD,20));
//        add(contact);
//
//        designation = new JLabel("Designation :");
//        designation.setBounds(850,650,150,20);
//        designation.setFont(new Font("Times New Roman", Font.BOLD,20));
//        add(designation);
//        designation1 = new JLabel("Manager");
//        designation1.setBounds(980,650,150,20);
//        designation1.setForeground(Color.BLUE);
//        designation1.setFont(new Font("Times New Roman", Font.BOLD,20));
//        add(designation1);
//
//        welm = new JTextField();
//        welm.setBounds(980,650,200,25);
//        welm.setEditable(false);
//        welm.setBackground(null);
//        Border b4 = BorderFactory.createLineBorder(Color.black,1);
//        welm.setBorder(b4);
//
//
//        wel = new JTextField();
//        wel.setBounds(980,350,200,25);
//        wel.setEditable(false);
//        wel.setBackground(null);
//        Border b1 = BorderFactory.createLineBorder(Color.black,1);
//        wel.setBorder(b1);
//        wel1 = new JTextField();
//        wel1.setBounds(980,400,200,25);
//        wel1.setEditable(false);
//        Border b2 = BorderFactory.createLineBorder(Color.black,1);
//        wel1.setBorder(b2);
//        wel1.setBackground(null);
//        wel2 = new JTextField();
//        wel2.setBounds(980,450,200,25);
//        wel2.setEditable(false);
//        Border b3 = BorderFactory.createLineBorder(Color.black,1);
//        wel2.setBorder(b3);
//        wel2.setBackground(null);
//        wel3 = new JTextField();
//        wel3.setBounds(980,500,200,25);
//        wel3.setEditable(false);
//        Border b5 = BorderFactory.createLineBorder(Color.black,1);
//        wel3.setBorder(b5);
//        wel3.setBackground(null);
//        wel4 = new JTextField();
//        wel4.setBounds(980,550,200,25);
//        wel4.setEditable(false);
//        Border b6 = BorderFactory.createLineBorder(Color.black,1);
//        wel4.setBorder(b6);
//        wel4.setBackground(null);
//        wel5 = new JTextField();
//        wel5.setBounds(980,600,200,25);
//        wel5.setEditable(false);
//        Border b7 = BorderFactory.createLineBorder(Color.black,1);
//        wel5.setBorder(b7);
//        wel5.setBackground(null);
//
//
////                welcome = new JLabel((manager.getName()));
////        welcome.setBounds(870,350,300,25);
////        welcome.setFont(new Font("Times New Roman", Font.BOLD, 18));
////        welcome.setForeground(Color.BLUE);
////        welcome.setHorizontalAlignment(JLabel.CENTER);
////        add(welcome);
////        add(wel);
////
////        welcome1 = new JLabel((manager.getUsername()));
////        welcome1.setBounds(870,400,300,25);
////        welcome1.setFont(new Font("Times New Roman", Font.BOLD, 18));
////        welcome1.setForeground(Color.BLUE);
////        welcome1.setHorizontalAlignment(JLabel.CENTER);
////        add(welcome1);
////
////        welcome2 = new JLabel((manager.getEmail()));
////        welcome2.setBounds(870,450,300,25);
////        welcome2.setFont(new Font("Times New Roman", Font.BOLD, 18));
////        welcome2.setForeground(Color.BLUE);
////        welcome2.setHorizontalAlignment(JLabel.CENTER);
////        add(welcome2);
//
//
//
//
//        add(wel1);
//        add(wel2);
//        add(wel3);
//        add(wel4);
//        add(wel5);
//        add(welm);
//
//                    edit.addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    EditManager editManagerProfile = new EditManager();
//                    editManagerProfile.show();
//                    dispose();
//                }
//            });
//
//
//
////        welcome = new JLabel((manager.getName()));
////        welcome.setBounds(850,250,300,25);
////        welcome.setFont(new Font("Arial", Font.BOLD, 20));
////        welcome.setHorizontalAlignment(JLabel.CENTER);
////        add(welcome);
////
////        man = new JLabel("MANAGER");
////        man.setBounds(50,40,200,30);
////        man.setFont(new Font("Times New Roman", Font.BOLD,30));
////        add(man);
//
//        emp = new JButton("Employees Info");
//        emp.setBounds(50,280,200,30);
//        emp.setFont(new Font("Times New Roman", Font.BOLD,20));
//        add(emp);
//        guest = new JButton("Guest Info");
//        guest.setBounds(50,360,200,30);
//        guest.setFont(new Font("Times New Roman", Font.BOLD,20));
//        add(guest);
//
//        stat = new JButton("Control Staffs");
//        stat.setBounds(50,440,200,30);
//        stat.setFont(new Font("Times New Roman", Font.BOLD,20));
//        add(stat);
//
//        room = new JButton("Room Status");
//        room.setBounds(50,520,200,30);
//        room.setFont(new Font("Times New Roman", Font.BOLD,20));
//        add(room);
//
//        stat.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ControlStaffs controlStaffs = new ControlStaffs();
//                controlStaffs.show();
//                dispose();
//            }
//        });
//
//
//        emp.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                EmployeeInfo employeeInfo = new EmployeeInfo();
//                employeeInfo.show();
//                dispose();
//            }
//        });
//
//        room.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                StatusRoom statusRoom = new StatusRoom();
//               statusRoom.show();
//                dispose();
//            }
//        });
//
//        emp.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                EmployeeInfo employeeInfo = new EmployeeInfo();
//                employeeInfo.show();
//                dispose();
//            }
//        });
//
//        ImageIcon img = new ImageIcon("public/manpro.png");
//        background = new JLabel("", img, JLabel.CENTER);
//        background.setBounds(1050, 180, 100, 100);
//        add(background);
//
//
////            welcome = new JLabel(("Welcome " + manager.getName() +
////                    "\n " + manager.getUsername() +"\n"+manager.getEmail()));
////            welcome.setBounds(850,300,300,25);
////            welcome.setFont(new Font("Arial", Font.BOLD, 20));
////            welcome.setHorizontalAlignment(JLabel.CENTER);
////            add(welcome);
//
//
//
//        add(panel);
//
//    }
//
//    public static void main(String[] args) {
//        new ManagerProfile().setVisible(true);
//    }
//}
package view.Profile;


import controller.ManagerController;
import model.Employee;
import model.Manager;
import view.CheckStatus.StatusRoom;
import view.Update.CustomerDetails;
import view.Update.EmployeeInfo;
import view.controlstaffs.ControlStaffs;


import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerProfile extends JFrame {
    private final Manager manager;
    JLabel label, background,man, welcome,welcome1,welcome2,welcome3,welcome4,welcome5, name, name1, username, username1 ,email,email1,address,address1, gender,gender1, designation,designation1, contact,contact1;
    JButton emp, guest,stat,room, edit;
    JPanel panel;
    JTextField wel,wel1,wel2,wel3,wel4,wel5,welm;


    ManagerController managerController;
    public ManagerProfile(){
        setTitle("Profile");
        setSize(1550,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        Color c = new Color(219, 207, 239, 226);
        getContentPane().setBackground(c);

        this.managerController = new ManagerController();
        this.manager=managerController.fetchLoggedInManager();

        label = new JLabel("MANAGER PROFILE");
        label.setBounds(250,50,600,30);
        label.setFont(new Font("Times New Roman",Font.BOLD,30));
        add(label);

        panel = new JPanel(new BorderLayout());
        panel.setBounds(700,150,500,500);
        Border blackline = BorderFactory.createLineBorder(Color.black);
        panel.setBorder(blackline);
        panel.setBackground(null);

        edit = new JButton("Edit Profile");
        edit.setBounds(1250,690,100,30);
        add(edit);

        name = new JLabel("Name :");
        name.setBounds(720,300,100,20);
        name.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(name);

        name1 = new JLabel("Anupam Pandey");
        name1.setBounds(800,300,300,20);
        name1.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(name1);

        username = new JLabel("Username :");
        username.setBounds(720,350,100,20);
        username.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(username);

        username1 = new JLabel("anupam");
        username1.setBounds(830,350,300,20);
        username1.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(username1);

        email = new JLabel("Email :");
        email.setBounds(720,400,100,20);
        email.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(email);

        email1= new JLabel("anupam@123");
        email1.setBounds(800,400,300,20);
        email1.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(email1);

        gender = new JLabel("Gender :");
        gender.setBounds(720,450,100,20);
        gender.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(gender);

        gender1 = new JLabel("Male");
        gender1.setBounds(800,450,300,20);
        gender1.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(gender1);

        address = new JLabel("Address :");
        address.setBounds(720,500,100,20);
        address.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(address);

        address1 = new JLabel("Nepal");
        address1.setBounds(820, 500,300,20);
        address1.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(address1);

        contact = new JLabel("Contact :");
        contact.setBounds(720,550,100,20);
        contact.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(contact);

        contact1 = new JLabel("9876542220");
        contact1.setBounds(800,550,300,20);
        contact1.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(contact1);

        designation = new JLabel("Designation :");
        designation.setBounds(720,600,150,20);
        designation.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(designation);

        designation1 = new JLabel("MANAGER");
        designation1.setBounds(840,600,150,20);
        designation1.setForeground(Color.BLACK);
        designation1.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(designation1);

        emp = new JButton("Employees Info");
        emp.setBounds(50,280,200,30);
        emp.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(emp);

        guest = new JButton("Guest Info");
        guest.setBounds(50,360,200,30);
        guest.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(guest);

        stat = new JButton("Control Staffs");
        stat.setBounds(50,440,200,30);
        stat.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(stat);

        room = new JButton("Room Status");
        room.setBounds(50,520,200,30);
        room.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(room);

        stat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmployeeInfo employeeInfo = new EmployeeInfo();
                employeeInfo.show();
                dispose();
            }
        });

        emp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CustomerDetails customerDetails = new CustomerDetails();
                customerDetails.show();
                dispose();
            }
        });


        room.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ControlStaffs controlStaffs = new ControlStaffs();
                controlStaffs.show();
                dispose();
            }
        });

        guest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StatusRoom statusRoom = new StatusRoom();
                statusRoom.show();
                dispose();
            }
        });





//        welm = new JTextField();
//        welm.setBounds(980,600,200,25);
//        welm.setEditable(false);
//        welm.setBackground(null);
//        Border b4 = BorderFactory.createLineBorder(Color.black,1);
//        welm.setBorder(b4);
//
//
//        wel = new JTextField();
//        wel.setBounds(980,350,200,25);
//        wel.setEditable(false);
//        wel.setBackground(null);
//        Border b1 = BorderFactory.createLineBorder(Color.black,1);
//
//        wel.setBorder(b1);
//        wel1 = new JTextField();
//        wel1.setBounds(980,400,200,25);
//        wel1.setEditable(false);
//        Border b2 = BorderFactory.createLineBorder(Color.black,1);
//        wel1.setBorder(b2);
//        wel1.setBackground(null);
//
//        wel2 = new JTextField();
//        wel2.setBounds(980,450,200,25);
//        wel2.setEditable(false);
//        Border b3 = BorderFactory.createLineBorder(Color.black,1);
//        wel2.setBorder(b3);
//        wel2.setBackground(null);
//
//        wel3 = new JTextField();
//        wel3.setBounds(980,500,200,25);
//        wel3.setEditable(false);
//        Border b5 = BorderFactory.createLineBorder(Color.black,1);
//        wel3.setBorder(b5);
//        wel3.setBackground(null);
//
//        wel4 = new JTextField();
//        wel4.setBounds(980,550,200,25);
//        wel4.setEditable(false);
//        Border b6 = BorderFactory.createLineBorder(Color.black,1);
//        wel4.setBorder(b6);
//        wel4.setBackground(null);
//
//        wel5 = new JTextField();
//        wel5.setBounds(980,600,200,25);
//        wel5.setEditable(false);
//        Border b7 = BorderFactory.createLineBorder(Color.black,1);
//        wel5.setBorder(b7);
//        wel5.setBackground(null);


//        welcome = new JLabel((receptionist.getName()));
//        welcome.setBounds(870,350,300,25);
//        welcome.setFont(new Font("Times New Roman", Font.BOLD, 18));
//        welcome.setForeground(Color.BLUE);
//        welcome.setHorizontalAlignment(JLabel.CENTER);
//        add(welcome);
//        add(wel);
//
//        welcome1 = new JLabel((receptionist.getUsername()));
//        welcome1.setBounds(870,400,300,25);
//        welcome1.setFont(new Font("Times New Roman", Font.BOLD, 18));
//        welcome1.setForeground(Color.BLUE);
//        welcome1.setHorizontalAlignment(JLabel.CENTER);
//        add(welcome1);
//
//        welcome2 = new JLabel((receptionist.getEmail()));
//        welcome2.setBounds(870,450,300,25);
//        welcome2.setFont(new Font("Times New Roman", Font.BOLD, 18));
//        welcome2.setForeground(Color.BLUE);
//        welcome2.setHorizontalAlignment(JLabel.CENTER);
//        add(welcome2);



//
//        add(wel1);
//        add(wel2);
//        add(wel3);
//        add(wel4);
//        add(wel5);
//        add(welm);

        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditManager editManagerProfile = new EditManager();
                editManagerProfile.show();
                dispose();
            }
        });









        ImageIcon img = new ImageIcon("public/manpro.png");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(1050, 180, 100, 100);
        add(background);

//        ImageIcon img = new ImageIcon("public/manpro.png");
//        background = new JLabel("", img, JLabel.CENTER);
//        background.setBounds(1050, 180, 100, 100);
//        add(background);

        add(panel);

    }


    public static void main(String[] args) {
        new ManagerProfile().setVisible(true);
    }
}