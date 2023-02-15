package projetos;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		String inf01 = JOptionPane.showInputDialog(""
				+ "---------- Calculadora ---------\n"
				+ "     Digite o 1º Número: ");
		int n1 = Integer.parseInt(inf01);
		String inf02 = JOptionPane.showInputDialog(""
				+ "---------- Calculadora ---------\n"
				+ "     Digite o 2º Número: ");
		int n2 = Integer.parseInt(inf02);
		
		String op = JOptionPane.showInputDialog(""
				+ "Informe a operação matemática \n"
				+ "com as seguintes opções abaixo:\n"
				+ "           +   -   *   /   %");
		//Lógica
		double resultado = 0;

		if		(op.equals("+")) {resultado = n1 + n2;
		}else if(op.equals("-")) {resultado = n1 - n2;
		}else if(op.equals("*")) {resultado = n1 * n2;
		}else if(op.equals("/")) {resultado = n1 / n2;
		}else if(op.equals("%")) {resultado = n1 % n2;
		}else{
			JOptionPane.showMessageDialog(null, "Você Digitou uma opção inválida", "Erro", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		JOptionPane.showMessageDialog(null, resultado);
	}
}
