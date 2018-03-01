/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class CollectNewspaper extends SuperKarel {
	
	
	public void run() {
		moveToNews();
		pickBeeper();
		comeBack();
	}
	
	//Moves to the newspaper
	public void moveToNews() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
	}
	
	// Comes back to the initial position 
	public void comeBack() {
		turnAround();
		move();
		move();
		move();
		turnRight();
		move();
		turnRight();
	}
	
}
