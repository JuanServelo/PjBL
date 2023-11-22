package pjblTelas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TelaUserEvento extends JFrame {
    public TelaUserEvento() {
        super("Opções do Evento");

        criarFormulario();
    }

    private void criarFormulario() {
        setLayout(new BorderLayout());

        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new FlowLayout());

        JLabel titulo = new JLabel("Opções do Evento do Usuário:");
        titulo.setFont(new Font("Verdana", Font.PLAIN, 16));

        panelTitulo.add(titulo);

        JPanel panelEscolha1 = new JPanel();
        panelEscolha1.setLayout(new FlowLayout());

        JButton informationButton = new JButton("Informações");
        JButton subscribeButton = new JButton("Se Inscrever");

        panelEscolha1.add(informationButton);
        panelEscolha1.add(subscribeButton);

        JPanel panelEscolha2 = new JPanel();
        panelEscolha2.setLayout(new FlowLayout());

        JButton unsubscribeButton = new JButton("Se Desinscrever");

        panelEscolha2.add(unsubscribeButton);

        ActionListener leitor_botoes = new LeitorBotoes();
        informationButton.addActionListener(leitor_botoes);
        subscribeButton.addActionListener(leitor_botoes);
        unsubscribeButton.addActionListener(leitor_botoes);

        add(panelTitulo, BorderLayout.NORTH);
        add(panelEscolha1, BorderLayout.CENTER);
        add(panelEscolha2, BorderLayout.SOUTH);
    }
}
