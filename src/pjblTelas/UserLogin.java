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
		String email = JOptionPane.showInputDialog(null, "E-mail");
		String senha = JOptionPane.showInputDialog(null, "Senha");

		System.out.println(usuario);
		System.out.println(email);
		System.out.println(senha);

		UserFilter filter = new UserFilter(usuario, email, senha);

		if (usuario != null && senha != null && filter.filtrarUsuario(usuario, email, senha)){
			JOptionPane.showMessageDialog(null, "login autorizado");
		}
		else{
			JOptionPane.showMessageDialog(null, "login recusado");
		}
	}
}
