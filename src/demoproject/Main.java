package demoproject;
import java.awt.*;
import javax.swing.*;

import java.util.Scanner;
import java.util. Timer;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.event.*;

import java.util.*;

//Main
public class Main {
    public static int points = 0;
    public static int posx = 0;
    public static int posy = 0;
    public static enum State{
        Menu,
        Game,
        Death,
    };
    public static enum Direction{
        Up,
        Down,
        Left,
        Right,
    };
    public static  State state = State.Menu;
    public static Direction direction = Direction.Right;

    public void move(){
        if (direction == Direction.Up){
            posy+=10;
        }
        if (direction == Direction.Down){
            posy-=10;
        }
        if (direction == Direction.Left){
            posx-=10;
        }
        if (direction == Direction.Right){
            posx+=10;
        }
    }
    public static void main(String[] args) {

        System.out.print("skull");

        System.out.println("WeEE");

        System.out.println("WeEE");

    }
}
