package demoproject;
import java.awt.*;
import javax.swing.*;

public class graphics extends JPanel {

<<<<<<< HEAD
    public static void main(String[] args) {
=======
    // Creating the JPanel
    public graphics() {
        // JPanel Default Settings
        setPreferredSize(new Dimension(1280, 720));
        setBackground(new Color(0, 0, 0));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 250;
        int y = 250;
        g.drawRect (x,y,80, 80);
>>>>>>> 293e19c84392cd55a1cf630e8f26d1cc8c9389d7

    }
    public static void main(String[] args){
        JFrame newFrame = new JFrame("Snake :)");
        newFrame.pack();
        newFrame.setVisible(true);
    }
}