package pjblTelas;

import javax.swing.JFrame;

public class TelaInicial {
	
	public static void main(String[] args) {
		InicialFrame frame = new InicialFrame();
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void userLogin() {
		UserLogin frame = new UserLogin();
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
