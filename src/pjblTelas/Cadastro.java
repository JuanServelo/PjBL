package pjblTelas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Cadastro extends JFrame {
    private static final long serialVersionUID = 1L;

    public Cadastro() {
        super("Cadastro");

        criarFormulario();
    }

    private void criarFormulario() {
        setLayout(new BorderLayout());

        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new FlowLayout());

        JLabel titulo = new JLabel("Cadastrar Usuário ou Admin");
        titulo.setFont(new Font("Verdana", Font.PLAIN, 16));

        panelTitulo.add(titulo);

        JPanel panelEscolha1 = new JPanel();
        panelEscolha1.setLayout(new FlowLayout());

        JPanel panelEscolha2 = new JPanel();
        panelEscolha2.setLayout(new FlowLayout());

        JButton userButton = new JButton("Usuário");
        JButton adminButton = new JButton("Admin");

        panelEscolha1.add(userButton);
        panelEscolha2.add(adminButton);

        ActionListener leitor_botoes = new LeitorBotoes();
        userButton.addActionListener(leitor_botoes);
        adminButton.addActionListener(leitor_botoes);

        add(panelTitulo, BorderLayout.NORTH);
        add(panelEscolha1, BorderLayout.CENTER);
        add(panelEscolha2, BorderLayout.SOUTH);
    }
}
