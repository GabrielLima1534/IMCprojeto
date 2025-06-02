package IMCproject;

import java.util.Scanner;

public class IMCproject {

    public static void main(String[] args) {
        
        // Cria um objeto Scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita e lê a altura do usuário
        System.out.print("Qual sua altura? ");
        Double altura = scanner.nextDouble();
        
        // Solicita e lê o peso do usuário
        System.out.println("Qual seu peso? ");
        Double peso = scanner.nextDouble();
        
        // Calcula o IMC usando a fórmula peso / (altura * altura)
        Double IMC = peso / (altura * altura);
        
        // Exibe o resultado do IMC calculado
        System.out.println("Seu IMC é: " + IMC);
        
        // Classifica o IMC e exibe o diagnóstico correspondente
        if (IMC < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (IMC >= 18.5 && IMC < 24.9) {
            System.out.println("Você está com peso normal.");
        } else if (IMC >= 25 && IMC < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade.");
        }
        
        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}

