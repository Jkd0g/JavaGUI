package main;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame{
    String prefix ="[テスト]";
    public static void main(String args[]) {

        main frame = new main("タイトル");
        frame.setVisible(true);

    }

    main(String title) {
        setTitle(title);
        setBounds(100, 100, 400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("./img/icon.png");
        setIconImage(icon.getImage());

        JPanel p = new JPanel();

        JTextField text1 = new JTextField("aAあ123456");
        text1.setFont(new Font("AR悠々ゴシック体E", Font.PLAIN, 30));

        p.add(text1);

        Container contentPane =getContentPane();
        contentPane.add(p, BorderLayout.CENTER);


    }
}




