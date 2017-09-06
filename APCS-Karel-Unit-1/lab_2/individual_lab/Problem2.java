package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        setHalfDiamond();
        repositionRight();
        moveTwo();
        setThreeBeeper();
        repositionLeft();
        moveTwo();
        setTwoBeeper();
        repositionRight();
        moveTwo();
        setOneBeeper();
    }
    
    public void moveTwo() {
      move();
      move();
    }
    
    public void setHalfDiamond(){
        turnRight();
        setOneBeeper();
        repositionLeft();
        setTwoBeeper();
        repositionRight();
        setThreeBeeper();
        repositionLeft();
        setFourBeeper();
    }
    
    public void setOneBeeper() {
        putBeeper();
        move();
    }
    
    public void repositionLeft() {
        turnLeft();
        move();
        turnLeft();
    }
    
     public void repositionRight() {
        turnRight();
        move();
        turnRight();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void setTwoBeeper() {
        putBeeper();
        move();
        move();
        setOneBeeper();
    }
    
    public void setThreeBeeper() {
        putBeeper();
        move();
        move();
        setTwoBeeper();
    }
    
    public void setFourBeeper() {
        putBeeper();
        move();
        move();
        setThreeBeeper();
    }
}

