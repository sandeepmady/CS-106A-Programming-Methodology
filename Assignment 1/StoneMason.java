import stanford.karel.*;

public class StoneMason extends SuperKarel {
	
	public void run() {
		while (frontIsClear()) {
			fillCol();
			getToPos();
		}
		fillCol();
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
	}
		
	// Fills the empty space in the column 
	private void fillCol() {
		turnLeft();
		
		while (frontIsClear()) {
			if (beepersPresent()) {
				move();
			}else {
				putBeeper();
			}		
		}
		
		if (noBeepersPresent()) {
			putBeeper();
		}
	}
	
	// Moves to next column
	private void getToPos() {
		turnRight();
		for (int i = 0; i < 4; i++) {
			move();
		}
		turnRight();
		while (frontIsClear()) {
			move();
		}
		turnLeft();
	}
	
}
