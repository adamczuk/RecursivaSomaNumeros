package view;

import javax.swing.JOptionPane;

import controller.MetodosController;

public class Main {
	public static void main(String[] args) {
		
		MetodosController metodos = new MetodosController();

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Inserir um numero"));

		JOptionPane.showMessageDialog(null, metodos.somaNumeros(valor));
		
	}
}
