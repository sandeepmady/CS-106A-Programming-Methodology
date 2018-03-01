/*
 * TODO: comment this program
 */

import stanford.karel.*;

public class Checkerboard extends SuperKarel {
	
	
	// Puts a beeper after every two moves till the  end of the world 
	public void run() {
		
		while(facingEast() || facingWest()){
			putBeeper();
			nextPos();
			if(notFacingEast() & notFacingWest()) {
				break;
			}
			nextPos();
			}
			
		}
	
	// Moves Karel to the next position
	private void nextPos() {
		if(frontIsClear()){	
			move();
		}else{
			moveToNextRow();
			
		}
	}

	// Orients Karel in the next row
	private void moveToNextRow() {
		
		if(facingEast()){
			turnLeft();
			if(frontIsClear()){	
				move();
				turnLeft();
			}
			
			
		}else{
			turnRight();
			if(frontIsClear()){	
				move();
				turnRight();
			}
			
		}
		
	}
	
	

	

}
