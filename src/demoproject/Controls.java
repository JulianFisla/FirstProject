package demoproject;

import java.awt.*;
import javax.swing.*;

import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

import java.awt.event.*;

public class Controls extends JPanel implements KeyListener {

    public static int posx = 0;
    public static int posy = 0;
    public static snakeDirection direction = snakeDirection.East;

    public Controls(){
        setPreferredSize(new Dimension(1280, 720));
        setBackground(new Color(0, 0, 0));
        this.setFocusable(true);
        addKeyListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 250;
        int y = 250;
        g.drawRect (x,y,80, 80);
    }

    // KeyListener Methods
    public void keyPressed(KeyEvent e)
    {
        //Right Key
        if(e.getKeyCode()==39 || e.getKeyChar() == 'd')
        {
            System.out.println("Right");
            posx += 5;
            if(posx > 540)
            {
                posx = 540;
            }
            direction = snakeDirection.East;
            System.out.println(direction);

        }
        //Left Key
        else if (e.getKeyCode()==37 || e.getKeyChar() == 'a')
        {
            System.out.println("Left");
            posx -= 5;
            if(posx < 0)
            {
                posx = 0;
            }
            direction = snakeDirection.West;
            System.out.println(direction);
        }
        //Up Key
        else if (e.getKeyCode()==38 || e.getKeyChar() == 'w')
        {
            System.out.println("Up");
            posy -= 5;
            if(posy < 0)
            {
                posy = 0;
            }
            direction = snakeDirection.North;
            System.out.println(direction);
        }
        //Down Key
        else if (e.getKeyCode()==40 || e.getKeyChar() == 's')
        {
            System.out.println("Down");
            posy += 5;
            if(posy > 380)
            {
                posy = 380;
            }
            direction = snakeDirection.West;
            System.out.println(direction);
        }

    }
    public void keyReleased(KeyEvent e)
    {

    }
    public void keyTyped(KeyEvent e)
    {
    }

    public static void main(String[] args) {

        System.out.println("Hello World");
        JFrame myFrame = new JFrame("Controls");
        Controls myPanel = new Controls();
        myFrame.add(myPanel);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}
