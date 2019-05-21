public class Automobile {
	private Motor motor;
	private Wheel 
		wheel1,
		wheel2,
	       	wheel3,
		wheel4;
	private	Tank tank;
	
	public Automobile(int CAPACITY, int level) {
		motor = new Motor();			
		wheel1 = new Wheel(); 
		wheel2 = new Wheel(); 
		wheel3 = new Wheel(); 
		wheel4 = new Wheel(); 
		tank = new Tank(CAPACITY, level);
	}	
	
	public void start(short speed, int km) {
		motor.turnOn();
		wheel1.roll(speed);
		wheel2.roll(speed);
		wheel3.roll(speed);
		wheel4.roll(speed);
		tank.downLevel(km);	
	}

	public void stop(int units) {
		motor.turnOff();
		wheel1.breaK();
		wheel2.breaK();
		wheel3.breaK();
		wheel4.breaK();
		tank.upLevel(units);
	}

	public void display() {
		motor.display();
		wheel1.display();
		wheel2.display();
		wheel3.display();
		wheel4.display();
		tank.display();
	}
}
