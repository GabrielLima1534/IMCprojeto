package IMCproject;

import java.util.Scanner;

public class IMCproject {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Qual sua altura? " );
		
		Double altura = scanner.nextDouble();
		
		System.out.println("Qual seu peso? " );
		
		Double peso = scanner.nextDouble();		
		
		Double IMC = peso / (altura*altura);
		
		System.out.println("Seu IMC é: " + IMC);
		
		if (IMC < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (IMC >= 18.5 && IMC < 24.9) {
            System.out.println("Você está com peso normal.");
        } else if (IMC >= 25 && IMC < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade.");
        }
        
        scanner.close();
		
		
		// TODO Auto-generated method stub

	}

}
