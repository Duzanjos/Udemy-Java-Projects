package projetos;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		
		String inf01 = JOptionPane.showInputDialog(""
				+ "---------- Calculadora ---------\n"
				+ "     Digite o 1� N�mero: ");
		int n1 = Integer.parseInt(inf01);
		String inf02 = JOptionPane.showInputDialog(""
				+ "---------- Calculadora ---------\n"
				+ "     Digite o 2� N�mero: ");
		int n2 = Integer.parseInt(inf02);
		
		String op = JOptionPane.showInputDialog(""
				+ "Informe a opera��o matem�tica \n"
				+ "com as seguintes op��es abaixo:\n"
				+ "           +   -   *   /   %");
		//L�gica
		double resultado = 0;

		if		(op.equals("+")) {resultado = n1 + n2;
		}else if(op.equals("-")) {resultado = n1 - n2;
		}else if(op.equals("*")) {resultado = n1 * n2;
		}else if(op.equals("/")) {resultado = n1 / n2;
		}else if(op.equals("%")) {resultado = n1 % n2;
		}else{
			JOptionPane.showMessageDialog(null, "Voc� Digitou uma op��o inv�lida", "Erro", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		JOptionPane.showMessageDialog(null, resultado);
	}
}
