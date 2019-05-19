import java.util.*;
public class Programa2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n, k;
		System.out.println("Ingrese un número n:");
		n = entrada.nextInt();
		k = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < k; j++)
				System.out.print("\t");	
			for (int j = 1; j <= i; j++)
				System.out.print(j + "\t");
			for (int j = i - 1; j > 0; j--)
				System.out.print(j + "\t");
			k--;
			System.out.print("\n");
		}
	}
}
