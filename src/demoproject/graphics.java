package demoproject;
import java.awt.*;
import javax.swing.*;

public class graphics extends JPanel {

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
    }
    public static void main(String[] args){
        JFrame newFrame = new JFrame("Snake :)");
        newFrame.pack();
        newFrame.setVisible(true);
    }
}