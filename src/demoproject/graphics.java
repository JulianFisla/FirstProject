package demoproject;
import java.awt.*;
import javax.swing.*;

public class graphics extends JPanel {

    // Creating the JPanel
    public graphics() {
        // JPanel Default Settings
        setPreferredSize(new Dimension(600, 480));
        setBackground(new Color(0, 0, 0));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}