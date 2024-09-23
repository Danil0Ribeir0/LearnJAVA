package exe1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 1 para criar um Polígono Regular");
		System.out.println("Digite 2 para criar um Triângulo Equilátero");
		System.out.println("Digite 3 para criar um Quadrado");
		System.out.print("Digite sua escolha: ");
		int move = sc.nextInt();
		
		if (move == 1) {
			PolReg p = new PolReg();
			
			System.out.print("Digite o número de lados: ");
			int numLados = sc.nextInt();
			System.out.print("Digite o valor do lado: ");
			int tamLado = sc.nextInt();
			
			p.setNumLados(numLados);
			p.setTamLado(tamLado);
			
			System.out.printf("Perímetro = %.2f\n", p.calcPer(numLados, tamLado));
			System.out.printf("Soma dos ângulos = %.0f°\n", p.calcAngInt(numLados));
			
		} 
		if (move == 2) {
			TrianguloEq t = new TrianguloEq();
			
			System.out.print("Digite o valor do lado: ");
			int tamLado = sc.nextInt();
			
			t.setTamLado(tamLado);
			
			System.out.printf("Perímetro = %.2f\n", t.calcPer(3, tamLado));
			System.out.printf("Area = %.2f\n", t.calcArea(3, tamLado));
			System.out.printf("Soma dos ângulos = %.0f°\n", t.calcAngInt(3));
			
		} 
		if (move == 3) {
			Quadrado q = new Quadrado();
			
			System.out.print("Digite o valor do lado: ");
			int tamLado = sc.nextInt();
			
			q.setTamLado(tamLado);
			
			System.out.printf("Perímetro = %.2f\n", q.calcPer(4, tamLado));
			System.out.printf("Area = %.2f\n", q.calcArea(tamLado));
			System.out.printf("Soma dos ângulos = %.0f°\n", q.calcAngInt(4));
		}
		
		sc.close();
	}

}
