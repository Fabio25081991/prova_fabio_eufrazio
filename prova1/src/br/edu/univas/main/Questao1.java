package br.edu.univas.main;
import java.util.Scanner;
public class Questao1 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int contNegativo = 0;
	
	do { 
        System.out.println("Digite um numero: ");
        int numero = leitura.nextInt();

        if (numero < 0) {
            contNegativo++;
        }
            else if ( numero == 0) {
                break;
        }

       } while (true);

    System.out.println("A quantidade número nagativo digitados são: " + contNegativo+".");
		
	}

}
