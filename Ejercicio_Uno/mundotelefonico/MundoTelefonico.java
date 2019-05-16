import java.util.Scanner;

public class MundoTelefonico
{
	public static void main(String[] args)
	{
		Celular miCelular = new Celular();
		miCelular.mostrar();
		System.out.println();
		miCelular.abonar(100);
		miCelular.mostrar();
		System.out.println();
		miCelular.abonar(30);
		miCelular.mostrar();
		System.out.println();
		miCelular.abonar(200);
		miCelular.mostrar();
		System.out.println();
		miCelular.abonar(500);
		miCelular.mostrar();
		System.out.println("\nEstablecemos el saldo en 3000");
		miCelular.setSaldo(3000f);
		miCelular.mostrar();
		System.out.println();
		miCelular.abonar(1);
		miCelular.mostrar();
		System.out.println("\nHacemos una llamada de 20 min");
		miCelular.llamar(20);
		miCelular.mostrar();
		System.out.println("\nPonemos el sueldo en 10 varitos e intentamos hacer la misma llamada");
		miCelular.setSaldo(10f);
		miCelular.llamar(20);
		miCelular.mostrar();
		System.out.println("\nHacemos unos mensajes e.e");
		miCelular.enviarMensaje("Rola pack");
		System.out.println();
		miCelular.mostrar();
		System.out.println();
		System.out.println("Ponemos el saldo en 2 varitos e intentamos hacer dos mensajes");
		miCelular.setSaldo(2f);
		miCelular.mostrar();
		miCelular.enviarMensaje("tengo que decirte algo");
		System.out.println();
		miCelular.mostrar();
		miCelular.enviarMensaje("me gustas mucho");
	}
}
