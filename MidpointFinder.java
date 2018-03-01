import stanford.karel.*;

public class MidpointFinder extends SuperKarel {
	
	public void run() {
		int count = 0;
		while(frontIsClear()){
			move();
			count++;
		}
		
		int mid;
		if (count%2==0) {
			mid = count/2;
		}else{
			mid = count/2 + 1;
		}
		
		turnAround();
		for(int i = 0; i < mid; i++){
			move();
		}
		putBeeper();
	}

}
