package view;

import javax.swing.JOptionPane;

import controller.RepeticaoController;

public class Main {

	public static void main(String[] args) {
		RepeticaoController rep = new RepeticaoController();
		
		String n1 = JOptionPane.showInputDialog("Digite o primeiro valor inteiro de 10 a 999999");
		int num1 = Integer.parseInt(n1);
		
		if(num1 < 10 || num1 > 999999) {
			System.out.println("Entrada inválida");
			System.exit(0);
		}
		
		String n2 = JOptionPane.showInputDialog("Digite o segundo valor inteiro de 0 a 9");
		int num2 = Integer.parseInt(n2);
		
		if(num2 < 0 || num2 > 9) {
			System.out.println("Entrada inválida");
			System.exit(0);
		}
		
		int repetir = rep.repeticao(num1, num2);
		
		System.out.println("O número " + num2 + " aparece " + repetir + " vez(es) no número " + num1 + ".");
			
		}
		
}


