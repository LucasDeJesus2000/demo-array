package application;

import java.util.Scanner;

public class Program {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) { //for para ler elementos do vetor baseados em "n"
			vect[i] = sc.nextDouble();
		}
		double soma = 0.0;
		for (int i=0; i<n; i++) { //for para somar elementos do vetor
			soma += vect[i];
		}
		double media = soma / n;
		
		System.out.printf("Media de altura %.2f%n", media); 
		sc.close();
		
	}
}
