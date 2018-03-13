package jnlp.test;

import javax.swing.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        JFrame f = new JFrame("main");
        f.setSize(200, 100);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World");
        f.add(label);
        f.setVisible(true);
    }
}
