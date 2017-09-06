package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  Rohan Saha
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        turn180();
        move2();
        pickBeeper();
        move3();
        turnRightPick();
        move3();
        turnRightPick();
        move3();
        turnRightPick();
        move3();
        turnLeft();
        move2();
    }
   
   public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
    }
    
   public void move3() {
       move();
       move();
       move();
    }
    
    public void move2() {
        move();
        move();
    }
    
    public void turn180() {
        turnLeft();
        turnLeft();
    }
    
    public void turnRightPick() {
        turnLeft();
        turnLeft();
        turnLeft();
        pickBeeper();
    }
}

