package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        firsthalf();
        secondhalf();
    }
   
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void firsthalf() {
        turnRight();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnRight();
         move();
         move();
         turnRight();
         move();
    }
     public void secondhalf() {
         move();
         turnRight();
         move();
         move();
         turnRight();
         move();
         move();
         turnLeft();
         move();
         move();
        }
}