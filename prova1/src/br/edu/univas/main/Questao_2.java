package br.edu.univas.main;
import java.util.Scanner;
public class Questao_2 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int quantidadeSim , quantidadeNao = 0;
		int sul = 0,sudeste = 0, centroeste = 0,norte = 0, nordeste = 0;
		int sim_1 =0;
		int nao_2 = 0;
		int pessoasCorona = 0;
		int Regiao = 0;
		
		
		for (int i = 0; i < 100; i++) {
			
			System.out.println("Voc� acredita que a vacina contra o COVID-19 fique pronta ainda em 2020?");
			pessoasCorona = leitura.nextInt();
			
			System.out.println("Qual regi�o do Brasil voc� mora?");
			Regiao = leitura.nextInt();
			
				if (pessoasCorona == 1) {
				
				sim_1++;
				
			}else if (pessoasCorona == 2) {
				
				nao_2++;
				
			}
			
			if (Regiao == 1) {
				
				sul++;
				
			}else if (Regiao == 2) {
				
				sudeste++;
				
			}else if (Regiao == 3) {
				
				centroeste++;
				
			}else if (Regiao == 4) {
				
				norte++;
				
			}else if (Regiao == 5) {
				
				nordeste++;
			}
				
			
		}
		
		System.out.println("Quantidade de pessoas que votaram sim foram: "+ sim_1);
		System.out.println("Quantidade de pessoas que votaram n�o foram: "+ nao_2);
		System.out.println("Participantes da regi�o Sul foram: "+ sul);
		System.out.println("Participantes da regi�o Sudeste foram: " + sudeste);
		System.out.println("Participantes da regi�o Centro_oeste foram: " + centroeste);
		System.out.println("Participantes da regi�o Norte foram: " + norte);
		System.out.println("Participantes da regi�o Nordeste foram: "+ nordeste);
		
		leitura.close();
	}

}

