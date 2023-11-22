package pjblTelas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TelaAdminEvento extends JFrame {
    public TelaAdminEvento() {
        super("Opções do Evento");

        criarFormulario();
    }

    private void criarFormulario() {
        setLayout(new BorderLayout());

        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new FlowLayout());

        JLabel titulo = new JLabel("Opções do Evento do Admin:");
        titulo.setFont(new Font("Verdana", Font.PLAIN, 16));

        panelTitulo.add(titulo);

        JPanel panelEscolha1 = new JPanel();
        panelEscolha1.setLayout(new FlowLayout());

        JButton informationButton = new JButton("Informações");
        JButton subscribedButton = new JButton("Pessoas Inscritas");

        panelEscolha1.add(informationButton);
        panelEscolha1.add(subscribedButton);

        JPanel panelEscolha2 = new JPanel();
        panelEscolha2.setLayout(new FlowLayout());

        JButton modifyButton = new JButton("Modificar Evento");
        JButton excludeButton = new JButton("Excluir Evento");

        panelEscolha2.add(modifyButton);
        panelEscolha2.add(excludeButton);

        ActionListener leitor_botoes = new LeitorBotoes();
        informationButton.addActionListener(leitor_botoes);
        subscribedButton.addActionListener(leitor_botoes);
        excludeButton.addActionListener(leitor_botoes);
        modifyButton.addActionListener(leitor_botoes);

        add(panelTitulo, BorderLayout.NORTH);
        add(panelEscolha1, BorderLayout.CENTER);
        add(panelEscolha2, BorderLayout.SOUTH);
    }
}
