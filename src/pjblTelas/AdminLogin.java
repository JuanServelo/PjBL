package pjblTelas;

import javax.swing.*;

public class AdminLogin extends JFrame {
	private static final long serialVersionUID = 1L;

	public AdminLogin() {
		String usuario = JOptionPane.showInputDialog(null, "Usuário");
		String email = JOptionPane.showInputDialog(null, "E-mail");
		String senha = JOptionPane.showInputDialog(null, "Senha");

		System.out.println(usuario);
		System.out.println(email);
		System.out.println(senha);

		AdminFilter filter = new AdminFilter(usuario, email, senha);

		if (usuario != null && senha != null && email != null && filter.filtrar(usuario, email, senha)){
			JOptionPane.showMessageDialog(null, "login autorizado");
		}
		else {
			JOptionPane.showMessageDialog(null, "login recusado");
		}
	}
}