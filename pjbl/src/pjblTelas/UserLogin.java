package pjblTelas;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UserLogin extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserLogin(){
		String usuario = JOptionPane.showInputDialog(null, "Usuário");
		String senha = JOptionPane.showInputDialog(null, "Senha");
		System.out.println(usuario);
		System.out.println(senha);
		if (usuario != null && senha != null && usuario.equals("pucpr") && senha.equals("poo")){
			JOptionPane.showMessageDialog(null, "login autorizado");
		}
		else{
			JOptionPane.showMessageDialog(null, "login recusado");
		}
	}
}
