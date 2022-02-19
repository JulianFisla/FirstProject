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

    public Controls(){
        setPreferredSize(new Dimension(640,480));
        setBackground(new Color(250,250,250));
        this.setFocusable(true);
        addKeyListener(this);
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
