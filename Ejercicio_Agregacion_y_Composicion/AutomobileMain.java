import java.util.*;
public class AutomobileMain {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Automobile automobile = new Automobile(10, 5);
		short velocidad;
		int km,
		    units;
		automobile.display();
		System.out.println("----------------------------");	
		System.out.println("Ingrese la velocidad");	
		velocidad = entrada.nextShort();
		System.out.println("Ingrese los km");	
		km = entrada.nextInt();
		automobile.start(velocidad, km);
		automobile.display();
		System.out.println("Ingrese las units");	
		units = entrada.nextInt();
		System.out.println("----------------------------");	
		automobile.display();
	}
}
