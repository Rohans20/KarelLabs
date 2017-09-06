package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
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
