package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        MovetoBeepers();
        GetBeepers();
        RearrangeBeepers();
        
        
    }
   
    public void MovetoBeepers() {
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
    }
    
    public void GetBeepers() {
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
    
    public void RearrangeBeepers() {
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
    }
    
}