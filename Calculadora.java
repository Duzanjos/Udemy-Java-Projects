package projetos;

import java.util.Scanner;

/**
* Desafio da Calculadora, 
* usando somente o que foi 
* aprendido até agora no
* curso.
* 
* @author Duzanjos
* @since 1.0
* @see https://github.com/Duzanjos
*/

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("#------- 1º Calculadora --------#");
		System.out.print("     Digite o 1º Número: ");
		double n1 = scan.nextDouble();
		System.out.print("     Digite o 2º Número: ");
		double n2 = scan.nextDouble();
		
		System.out.println("#-------------------------------#");
		System.out.println(" Informe a operação matemática, ");
		System.out.println(" com as seguintes opções abaixo:");
		System.out.println("           + - * / %");
		String op = scan.next();
		
		//Lógica
		double resultado = "+".equals(op) ? n1 + n2 : 0;
		resultado = "-".equals(op) ? n1 - n2 : resultado;
		resultado = "*".equals(op) ? n1 * n2 : resultado;
		resultado = "/".equals(op) ? n1 / n2 : resultado;
		resultado = "%".equals(op) ? n1 % n2 : resultado;
		
		System.out.println("#--------- :Resposta: ----------#");
		System.out.printf("     %.2f %s %.2f = %.2f", n1, op, n2, resultado);
		scan.close();
	}
}
