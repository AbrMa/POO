import java.math.*;
public class Tank {
	private final int CAPACITY;
	private int level;

	public Tank(int CAPACITY, int level) {
        	this.CAPACITY = Math.max(CAPACITY, level);
        	this.level = Math.min(CAPACITY, level);
   	}

	public void downLevel(int km) {
		int decremento = km/12;
		level -= decremento;
	}

	public void upLevel(int units) {
		level += units;
	}

	public void display() {
		System.out.println("Capacity : " + CAPACITY);	
		System.out.println("Level : " + level);	
	}
}
