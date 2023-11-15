package pjblTelas;

import pjbl.Evento;

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
		Evento evento = new Evento("Evento", "20/20/2023", 20, "Testeteststetstetste stat sayuv asiveasnoneb");
		UserLogin login = new UserLogin();
		UserPage frame = new UserPage(login.usuario, login.email, login.senha, evento.nome, evento.data, evento.capacidade, evento.descricao);
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
		Evento evento = new Evento("Evento", "20/20/2023", 20, "Testeteststetstetste stat sayuv asiveasnoneb");
		AdminLogin login = new AdminLogin();
		AdminPage frame = new AdminPage(login.usuario, login.email, login.senha, evento.nome, evento.data, evento.capacidade, evento.descricao);
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
