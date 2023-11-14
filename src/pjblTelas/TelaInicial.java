package pjblTelas;

import javax.swing.JFrame;

public class TelaInicial {
	
	public static void main(String[] args) {
		InicialFrame frame = new InicialFrame();
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
//	public static void userLogin() {
//		UserLogin frame = new UserLogin();
//		frame.setSize(300, 150);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);
//	}

	public static void userPage() {
		UserLogin login = new UserLogin();
		UserPage frame = new UserPage(login.usuario, login.email, login.senha);
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

//	public static void adminLogin() {
//		AdminLogin frame = new AdminLogin();
//		frame.setSize(300, 300);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setVisible(true);
//	}

	public static void adminPage() {
		AdminLogin login = new AdminLogin();
		AdminPage frame = new AdminPage(login.usuario, login.email, login.senha);
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void cadastro() {
		Cadastro frame = new Cadastro();
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void cadastroUser() {
		CadastroUser frame = new CadastroUser();
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void cadastroAdmin() {
		CadastroAdmin frame = new CadastroAdmin();
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
