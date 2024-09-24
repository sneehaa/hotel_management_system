package view.Parking;

import view.login.ReceptionistLogin;
import view.registration.ReceptionistRegistration;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class ParkingCheck extends JFrame {
    JLabel head;
    JPanel panel;
    JButton back,button1, button2, button3, button4, button5,button6,button7, button8,button9,button10,
            button11,button12,button13,button14,button15,button16,button17,
            button18,button19,button20;

    public ParkingCheck(){
        setTitle("Parking");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0,0,1550,900);

        try{
            setContentPane((new JLabel(new ImageIcon(ImageIO.read(new File("public/park.jpg"))))));
        }catch (IOException e){
            e.printStackTrace();
        }


        head = new JLabel("PARKING");
        head.setBounds(680,50,500,40);
        head.setFont(new Font("Times New Roman", Font.BOLD,40));
        add(head);


back = new JButton("Back");
back.setBounds(15,10,80,20);
add(back);

        panel = new JPanel();
        panel.setBounds(430,230,690,560);
        panel.setBackground(Color.orange);
        panel.setLayout(null);


        button1 = new JButton("P-1");
        button1.setBounds(450,250,130,130);
        button1.setBackground(Color.green);
        add(button1);

        button2 = new JButton("P-2");
        button2.setBounds(580,250,130,130);
        button2.setBackground(Color.green);
        add(button2);

        button3 = new JButton("P-3");
        button3.setBounds(710,250,130,130);
        button3.setBackground(Color.green);
        add(button3);

        button4 = new JButton("P-4");
        button4.setBounds(840,250,130,130);
        button4.setBackground(Color.green);
        add(button4);

        button5 = new JButton("P-5");
        button5.setBounds(970,250,130,130);
        button5.setBackground(Color.green);
        add(button5);

        button6 = new JButton("P-6");
        button6.setBounds(450,380,130,130);
        button6.setBackground(Color.green);
        add(button6);

        button7 = new JButton("P-7");
        button7.setBounds(580,380,130,130);
        button7.setBackground(Color.green);
        add(button7);

        button8 = new JButton("P-8");
        button8.setBounds(710,380,130,130);
        button8.setBackground(Color.green);
        add(button8);

        button9 = new JButton("P-9");
        button9.setBounds(840,380,130,130);
        button9.setBackground(Color.green);
        add(button9);

        button10 = new JButton("P-10");
        button10.setBounds(970,380,130,130);
        button10.setBackground(Color.green);
        add(button10);

        button11 = new JButton("P-11");
        button11.setBounds(450,510,130,130);
        button11.setBackground(Color.green);
        add(button11);

        button12 = new JButton("P-12");
        button12.setBounds(580,510,130,130);
        button12.setBackground(Color.green);
        add(button12);

        button13 = new JButton("P-13");
        button13.setBounds(710,510,130,130);
        button13.setBackground(Color.green);
        add(button13);

        button14 = new JButton("P-14");
        button14.setBounds(840,510,130,130);
        button14.setBackground(Color.green);
        add(button14);

        button15 = new JButton("P-15");
        button15.setBounds(970,510,130,130);
        button15.setBackground(Color.green);
        add(button15);

        button16 = new JButton("P-16");
        button16.setBounds(450,640,130,130);
        button16.setBackground(Color.green);
        add(button16);

        button17 = new JButton("P-17");
        button17.setBounds(580,640,130,130);
        button17.setBackground(Color.green);
        add(button17);

        button18 = new JButton("P-18");
        button18.setBounds(710,640,130,130);
        button18.setBackground(Color.green);
        add(button18);

        button19 = new JButton("P-19");
        button19.setBounds(840,640,130,130);
        button19.setBackground(Color.green);
        add(button19);

        button20 = new JButton("P-20");
        button20.setBounds(970,640,130,130);
        button20.setBackground(Color.green);
        add(button20);

        add(panel);

button1.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
        button1.setBackground(Color.red);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        button1.setBackground(Color.green);
    }
});

        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button2.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button2.setBackground(Color.green);
            }
        });

        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button3.setBackground(Color.green);
            }
        });

        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button3.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button3.setBackground(Color.green);
            }
        });

        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button4.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button4.setBackground(Color.green);
            }
        });

        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button5.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button5.setBackground(Color.green);
            }
        });

        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button6.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button6.setBackground(Color.green);
            }
        });

        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button7.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button7.setBackground(Color.green);
            }
        });

        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button8.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button8.setBackground(Color.green);
            }
        });

        button9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button9.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button9.setBackground(Color.green);
            }
        });

        button10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button10.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button10.setBackground(Color.green);
            }
        });

        button11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button11.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button11.setBackground(Color.green);
            }
        });

        button12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button12.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button12.setBackground(Color.green);
            }
        });

        button13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button13.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button13.setBackground(Color.green);
            }
        });

        button14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button14.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button14.setBackground(Color.green);
            }
        });

        button15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button15.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button15.setBackground(Color.green);
            }
        });

        button16.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button16.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button16.setBackground(Color.green);
            }
        });

        button17.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button17.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button17.setBackground(Color.green);
            }
        });

        button18.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button18.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button18.setBackground(Color.green);
            }
        });

        button19.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button19.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button19.setBackground(Color.green);
            }
        });

        button20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button20.setBackground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                button20.setBackground(Color.green);
            }
        });


        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReceptionistLogin receptionistLogin = new ReceptionistLogin();
                receptionistLogin.show();
                dispose();
            }
        });



    }




    public static void main(String[] args) {
        new ParkingCheck().setVisible(true);
    }
}
