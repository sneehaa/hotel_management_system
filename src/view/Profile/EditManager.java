package view.Profile;

import controller.ManagerController;
import model.Manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditManager extends JFrame {
    private static JLabel lbluser, lblname, lblemail, lblAddress;
    private static JTextField txtFname, textname, textemail,textuser;
    private static JTextArea txtAddress;
    private static JButton btnUpdate, btnClose;
    Manager manager;


    public EditManager() {

        setTitle("Edit Profile");
        setBounds(400, 100, 600, 600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        Color c = new Color(243, 212, 196, 240);
        getContentPane().setBackground(c);


        lblname = new JLabel("Full Name");
        lbluser = new JLabel("Username");
        lbluser = new JLabel("Email");


        textname = new JTextField();
        textuser = new JTextField();
        textemail = new JTextField();

        btnUpdate = new JButton("Update");
        btnClose = new JButton("Close");


        lblname.setBounds(20, 60, 100, 30);
        add(lblname);

        textname.setBounds(200, 60, 200, 30);
//        txtLname.setText(manager.getName());
        add(textname);

        lbluser.setBounds(20, 100, 100, 30);
        add(lbluser);

        textuser.setBounds(200, 100, 200, 30);
//        txtPhone.setText(manager.getUsername());
        add(textuser);

//        lblemail.setBounds(20, 140, 100, 30);
//        add(lblemail);

        textemail.setBounds(200, 140, 200, 30);
//        txtAddress.setText(manager.getEmail());
        add(textemail);

        btnUpdate.setBounds(50, 200, 150, 30);
        add(btnUpdate);

        btnClose.setBounds(240, 200, 150, 30);
        add(btnClose);

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManagerController managerController = new ManagerController();
                Manager manager1 = new Manager(manager.getCustId(), textname.getText(), textuser.getText(), textemail.getText());
                int update = managerController.updateProfilePreparedStatement(manager1);
                System.out.println(update);
                if (update > 0) {
                    JOptionPane.showMessageDialog(null, "Successfully updated");
                    dispose();
                    new ManagerProfile();
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to update");
                }
                setVisible(true);
            }

        });
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ManagerProfile().setVisible(true);
            }
        });


    }

    public static void main(String[] args) {
        new EditManager().setVisible(true);
    }


}
