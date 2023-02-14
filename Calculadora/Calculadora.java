package projetos;

import java.util.Scanner;

/**
* Desafio da Calculadora, 
* usando somente o que foi 
* aprendido at� agora no
* curso.
* 
* @author Duzanjos
* @since 1.0
* @see https://github.com/Duzanjos
*/

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("#------- 1� Calculadora --------#");
		System.out.print("     Digite o 1� N�mero: ");
		double n1 = scan.nextDouble();
		System.out.print("     Digite o 2� N�mero: ");
		double n2 = scan.nextDouble();
		
		System.out.println("#-------------------------------#");
		System.out.println(" Informe a opera��o matem�tica, ");
		System.out.println(" com as seguintes op��es abaixo:");
		System.out.println("           + - * / %");
		String op = scan.next();
		
		//L�gica
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
