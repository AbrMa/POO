import java.util.Scanner;
import java.util.ArrayList;

public class Programa1 {
	public static void main(String[] args) {
		int n, k;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un número n:");
		n = entrada.nextInt();
		k = (n - 1); 	
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < k; j++)
				System.out.print(" ");	
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");	
			k--;
			System.out.print("\n");
		}
		for (int i = n; i >= 0; i--) {
			for (int j = 0; j < k; j++)
				System.out.print(" ");	
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");	
			k++;
			System.out.print("\n");
		}

	}
}
