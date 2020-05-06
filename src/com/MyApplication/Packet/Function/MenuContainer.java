package MyApplication.Packet.Function;
import MyApplication.Packet.BossFrame;

import MyApplication.Packet.Function.Components.MyButton;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MenuContainer extends JPanel{
    private MyButton loginB, registrationB;
    private BossFrame frame = null;

    public MenuContainer(BossFrame frame){
        this.frame=frame;

        setSize(900,700);
        setLayout(null);

        loginB = new MyButton("ЛОГИН",70, 500, 250, 30);
        add(loginB);

        registrationB = new MyButton("РЕГИСТРАЦИЯ",70, 550, 250, 30);
        add(registrationB);

        File f = new File("hello.jpg");
        JLabel imgLabel = new JLabel(new ImageIcon(f.getName()));
        imgLabel.setBounds(0, 0, 900, 700);
        add(imgLabel);



        loginB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.menuContainer.setVisible(false);
                frame.loginContainer.setVisible(true);
            }
        });

        registrationB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.menuContainer.setVisible(false);
                frame.registrationContainer.setVisible(true);
            }
        });


    }

    private class LoginContainer {
    }
}





//import MyApplication.Packet.BossFrame;
//
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//
//public class MenuContainer extends JPanel{
//    private JButton loginB, registrationB,adminB;
//    private BossFrame frame = null;
//
//    public MenuContainer(BossFrame frame){
//        this.frame=frame;
//
//        setSize(900,700);
//        setLayout(null);
//
//        File f = new File("hello.jpg");
//        JLabel imgLabel = new JLabel(new ImageIcon(f.getName()));
//        imgLabel.setBounds(0, 0, 900, 700);
//        add(imgLabel);
//
//
//        loginB = new JButton("ЛОГИН");
//        loginB.setBounds(70, 500, 250, 30);
//        Font f2 = new Font(Font.DIALOG_INPUT, Font.HANGING_BASELINE, 25);
//        loginB.setForeground(new Color(255, 99, 71));
//        loginB.setFont(f2);
//        loginB.setBackground(Color.white);
//        add(loginB);
//
//        registrationB = new JButton("РЕГИСТРАЦИЯ");
//        registrationB.setBounds(70, 550, 250, 30);
//        Font f3 = new Font(Font.DIALOG_INPUT, Font.HANGING_BASELINE, 25);
//        registrationB.setForeground(new Color(255, 99, 71));
//        registrationB.setFont(f3);
//        registrationB.setBackground(Color.white);
//        add(registrationB);
//
//        adminB=new JButton("АДМИН");
//        adminB.setBounds(700, 550, 150, 30);
//        Font f20 = new Font(Font.DIALOG_INPUT, Font.HANGING_BASELINE, 25);
//        adminB.setForeground(new Color(255, 99, 71));
//        adminB.setFont(f20);
//       adminB.setBackground(Color.white);
//        add(adminB);
//
////        adminB.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                frame.menuContainer.setVisible(false);
////                frame.admin.setVisible(true);
////
////            }
////        });
//
////        File f = new File("hello.jpg");
////        myJLabels imgLabel = new myJLabels(new ImageIcon(f.getName()));
////        imgLabel.setBounds(0, 0, 900, 700);
////        add(imgLabel);
//
//
//
//        loginB.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                frame.menuContainer.setVisible(false);
//                frame.loginContainer.setVisible(true);
//            }
//        });
//
//        registrationB.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                frame.menuContainer.setVisible(false);
//               frame.registrationContainer.setVisible(true);
//            }
//        });
//
////        adminB.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                frame.menuContainer.setVisible(false);
////                frame.admin.setVisible(true);
////
////            }
////        });
//
//
//
//    }
//}
//
