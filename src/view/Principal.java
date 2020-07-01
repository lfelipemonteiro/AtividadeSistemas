package view;

import javax.swing.JOptionPane;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		IArquivosController ac = new ArquivosController();
		String arquivo = "Registro.csv";
		
		try {
			int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite O Código"));
			ac.imprimeCadastro(arquivo, codigo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
