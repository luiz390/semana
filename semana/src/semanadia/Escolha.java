package semanadia;

import java.util.Scanner;

public class Escolha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String dia;
		
		System.out.println("DIGITE UM NUMERO PARA O DIA DA SEMANA ");
		x = sc.nextInt();
		
		switch (x) {
		case 1:
			dia = "DOMINGO";
			break;
			
		case 2:
			dia = "SEGUNDA";
			break;
			
		case 3:
			dia = "TERÇA";
			break;
			
		case 4:
			dia = "QUARTA";
			break;
			
		case 5:
			dia = "QUINTA";
			break;
			
		case 6:
			dia = "SEXTA";
			break;
			
		case 7:
			dia = "SABADO";
			break;
			
		default:
			dia = "NUMERO INVALIDO";
			break;
			
		
			
		}
		System.out.println("O DIA DA SEMANA É " + dia);

	}

}
