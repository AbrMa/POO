import java.util.*;

public class Programa3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n, k = 0;
		System.out.println("Ingrese un número n:");
		n = entrada.nextInt();	
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < k; j++)
				System.out.print("\t");
			for (int j = 1; j <= i; j++)
				System.out.print(j + "\t");
			for (int j = i; j > 0; j--)
				System.out.print(j + "\t");
			System.out.println();
			k++;
		}
	}
}	
