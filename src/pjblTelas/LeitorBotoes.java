package pjblTelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class LeitorBotoes implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton origem = (JButton) e.getSource();
		JOptionPane.showMessageDialog(origem, origem.getText() + " foi apertado");
		
		if(origem.getText() == "Participante") {
			TelaInicial.userLogin();
			TelaInicial.userPage();
		}
		
		if(origem.getText() == "Organizador") {
			TelaInicial.adminLogin();
			TelaInicial.adminPage();
		}
		
		if(origem.getText() == "Cadastro") {
			TelaInicial.cadastro();
		}

		if (origem.getText() == "Usuário") {
			TelaInicial.cadastroUser();
		}

		if (origem.getText() == "Admin") {
			TelaInicial.cadastroAdmin();
		}
	}
	
}