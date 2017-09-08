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
        carpetIndividualRoom();
        carpetIndividualRoom();
        carpetIndividualRoom();
        carpetIndividualRoom();
        carpetIndividualRoom();
        carpetIndividualRoom();
        carpetIndividualRoom();
        carpetIndividualRoom();
        carpetIndividualRoom();
    }
    
    public void carpetIndividualRoom(){
        goToRoom();
        checkRoomEntry();
        checkingRooms();
    }
    
    public void checkingRooms(){
        checkSides();
        checkFront();
    }
    
    public void goToRoom(){
        move();
        turnLeft();
    }
  
    public void checkSides() {
        turnEast();
        if (!frontIsClear()){
            turnWest();
            if(!frontIsClear()) {
                turnNorth();
            }
            else {
                goBack();
            }
        }
        else {
            goBack();
        }
    }
        
    public void checkFront() {
        if (frontIsClear()){
            move();
            checkingRooms();
        }
        else{
            putBeeper();
            goBack();
        }
    }
    
    public void checkWallsGoingBack() {
        if (frontIsClear() && facingSouth()){
            move();
        }
        else{
            turnEast();
        }
    }
    
    public void goBack() {
        turnSouth();
        checkWallsGoingBack();
        checkWallsGoingBack();
        checkWallsGoingBack();
        checkWallsGoingBack();
        checkWallsGoingBack();
    }
    
    public void checkRoomEntry() {
        if (frontIsClear()){
            move();
        }
        else{
            turnEast();
            goToRoom();
        }
    }
    
    public void turnEast() {
        if (facingWest()) {
            turnLeft();
            turnLeft();
        }
        if (facingNorth()) {
            turnLeft();
            turnLeft();
            turnLeft();
        }
        if (facingSouth()) {
            turnLeft();
        }
    }
            
    public void turnWest() {
        if (facingEast()) {
            turnLeft();
            turnLeft();
        }
        if (facingSouth()) {
            turnLeft();
            turnLeft();
            turnLeft();
        }
        if (facingNorth()) {
            turnLeft();
        }
    }    
    
    public void turnNorth() {
        if (facingSouth()) {
            turnLeft();
            turnLeft();
        }
        if (facingWest()) {
            turnLeft();
            turnLeft();
            turnLeft();
        }
        if (facingEast()) {
            turnLeft();
        }
    }
        
    public void turnSouth() {
        if (facingNorth()) {
            turnLeft();
            turnLeft();
        }
        if (facingEast()) {
            turnLeft();
            turnLeft();
            turnLeft();
        }
        if (facingWest()) {
            turnLeft();
        }
    }
}

  