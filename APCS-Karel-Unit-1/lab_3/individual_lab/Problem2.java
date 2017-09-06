package lab_3.individual_lab;

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

    public void carpetRooms(){
        goToRoom();
        checkRoomEntry();
        checkSides();
        checkFront();
    }

    public void goToRoom(){
        move();
        turnLeft();
    }
  
    public void checkSides() {
        turnLeft();
        if (!frontIsClear()){
            turnLeft();
            turnLeft();
            if(!frontIsClear()) {
                turnLeft();
            }
            else {
                move();
            }
        }
        else {
            move();
        }
    }
    
    public void checkFront() {
        if (frontIsClear()){
            move();
        }
        else{
            putBeeper();
        }
    }
    
    public void checkRoomEntry() {
        if (frontIsClear()){
            move();
        }
        else{
            turnLeft();
            goToRoom();
        }
    }
}
  