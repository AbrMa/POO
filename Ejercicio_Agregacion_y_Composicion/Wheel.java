public class Wheel {
	private boolean rolling;
	private short speed;

	public Wheel() {
		rolling = false;
		speed = 0;	
	}

	public void roll(short speed) {
		if(speed > 0)
			rolling = true;
		this.speed = speed;
	}

	public void breaK() {
		rolling = false;
		speed = 0;
	}

	public void display() {
		System.out.println("Rolling : " + rolling);
		System.out.println("Speed : " + speed);
	}
}
