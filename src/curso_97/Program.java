package curso_97;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da matriz quadrada: ");
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; i++) {
				System.out.println("Digite o valor na linha "+i+" e coluna "+j);
				matriz[i][j]= sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Diagonal principal: ");
		for(int i=0; i<n; i++) {
			System.out.println(matriz [i][i]+ ", ");
		}
		
		System.out.println();

		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; i++) {
				if (matriz[i][j]<0) {
					count++;
				}
			}
		}
		
		System.out.println("Quantidade de numeros negativos e: "+ count);
		sc.close();
	}

}
