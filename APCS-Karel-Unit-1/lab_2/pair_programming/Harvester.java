package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        move();
        harvestTwoRows();
        repositionLeft();
        harvestTwoRows();
        repositionLeft();
        harvestTwoRows();//Complete this method, using the methods you create below so that all rows are harvested
    }
    
    /**
     * Precondition: Robot facing east one block away from a row of beepers
     * Precondition: Robot facing east, two streets above where 
     */
    public void harvestTwoRows() {
        harvestOneRow();
        repositionRight();
        harvestOneRow();//your methods go below
    }
    
    public void harvestOneRow() {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    
    public void repositionRight() {
        turnLeft();
        move();
        turnLeft();
    }
    
    public void repositionLeft() {
        turnRight();
        move();
        turnRight();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void plant() {
        plantTwoRows();
        plantTwoRows();
        plantTwoRows();
    }
    
    public void plantTwoRows() {
        
}

