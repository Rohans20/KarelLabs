package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void makeHello() {
        drawH();
        drawE();
        drawL();
        move5();
        repositionRight();
        drawL();
    }
    
    public void moveTwo() {
      move();
      move();
    }
    
    public void drawH() {
        drop5Vertical();
        turn180();
        moveTwo();
        turnLeft();
        move();
        drop3Across();
        turnRight();
        moveTwo();
        turn180();
        drop5Vertical();
        repositionRight();
    }
    
    public void turn180() {
        turnLeft();
        turnLeft();
    }
    
    public void drop3Across() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    
    public void drop5Vertical() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    
    public void repositionLeft() {
        turnLeft();
        moveTwo();
    }
    
     public void repositionRight() {
        turnRight();
        moveTwo();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void drawE() {
        drawL();
        repositionLeft();
        turnLeft();
        drop3Across();
        repositionRight();
        turnRight();
        drop3Across();
        moveTwo();
    }
    
    public void drawL() {
        turnRight();
        drop5Vertical();
        turnLeft();
        drop3Across();
    }
    
    public void move5() {
        move();
        move();
        move();
        move();
        move();
    }
}


