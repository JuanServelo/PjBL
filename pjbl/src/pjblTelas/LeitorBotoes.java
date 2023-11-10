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
		}
		
		if(origem.getText() == "Organizador") {
			
		}
		
		if(origem.getText() == "Cadastro") {
			
		}
		
	}
	
}