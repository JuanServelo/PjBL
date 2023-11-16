package pjblTelas;

import javax.swing.*;

public class AdminLogin extends JFrame {
	private static final long serialVersionUID = 1L;

	public String usuario;
	public String email;
	public String senha;

	public AdminLogin() {
		usuario = JOptionPane.showInputDialog(null, "Usuário");
		email = JOptionPane.showInputDialog(null, "E-mail");
		senha = JOptionPane.showInputDialog(null, "Senha");

		System.out.println(usuario);
		System.out.println(email);
		System.out.println(senha);

		AdminFilter filter = new AdminFilter(usuario, email, senha);

		try {
			if (usuario != null && senha != null && email != null && filter.filtrarUsuario(usuario, email, senha)){
				JOptionPane.showMessageDialog(null, "login autorizado");
			}
		}
		catch (Exception e) {
			System.out.println("Login negado");
		}
	}
}