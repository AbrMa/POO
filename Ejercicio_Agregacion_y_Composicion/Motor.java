public class Motor {
	private boolean encendido;

	public Motor() {
		encendido = false;
	}

	public void turnOn() {
		encendido = true;
	}

	public void turnOff() {
		encendido = false;
	}

	public void display() {
		System.out.print("Motor ");
		if (encendido)
			System.out.print("Encendido\n");
		else
			System.out.print("Apagado\n");
	}
}
