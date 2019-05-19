import java.util.*;
public class Triangulos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Triangle t1 = new Triangle();	
		Triangle t2 = new Triangle(1);	
		t1.printTriangle(t1);
		t2.printTriangle(t2);
		if (t1.compareTriangles(t1, t2))
		       	System.out.println("Iguales");
		else
			System.out.println("Distintos");
		System.out.println("Ingrese nuevo lado 1 para el triángulo 1");
		t1.changeSide1(entrada.nextDouble());
		System.out.println("Ingrese nuevo lado 1 para el triángulo 2");
		t1.changeSide2(entrada.nextDouble());
		System.out.println("Ingrese nuevo lado 1 para el triángulo 3");
		t1.changeSide3(entrada.nextDouble());
		System.out.println("Ingrese nuevo lado 2 para el triángulo 1");
		t2.changeSide1(entrada.nextDouble());
		System.out.println("Ingrese nuevo lado 2 para el triángulo 2");
		t2.changeSide2(entrada.nextDouble());
		System.out.println("Ingrese nuevo lado 2 para el triángulo 3");
		t2.changeSide3(entrada.nextDouble());
		t1.printTriangle(t1);
		t2.printTriangle(t2);
		if (t1.compareTriangles(t1, t2) == true)
		       	System.out.println("Iguales");
		else
			System.out.println("Distintos");
		System.exit(0);
	}
}
