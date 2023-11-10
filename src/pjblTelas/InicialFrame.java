package pjblTelas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InicialFrame extends JFrame {
	
	public InicialFrame() {
		
		super("Usuário");
		
		criarFormulario();
		
	}
	
	private void criarFormulario() {
		setLayout(new BorderLayout());
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setLayout(new FlowLayout());
		
		JLabel titulo = new JLabel("Escolha seu usuário:");
		titulo.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		panelTitulo.add(titulo);
		
		JPanel panelEscolha = new JPanel();
		panelEscolha.setLayout(new FlowLayout());
		
		JButton userButton = new JButton("Participante");
		JButton adminButton = new JButton("Organizador");
		
		panelEscolha.add(userButton);
		panelEscolha.add(adminButton);
		
		JPanel panelCadastro = new JPanel();
		panelCadastro.setLayout(new FlowLayout());
		
		JButton cadastroButton = new JButton("Cadastro");
		
		panelCadastro.add(cadastroButton);
		
		ActionListener leitor_botoes = new LeitorBotoes();
		userButton.addActionListener(leitor_botoes);
		adminButton.addActionListener(leitor_botoes);
		cadastroButton.addActionListener(leitor_botoes);
		
		add(panelTitulo, BorderLayout.NORTH);
		add(panelCadastro, BorderLayout.SOUTH);
		add(panelEscolha,BorderLayout.CENTER);
		
	}
	
}