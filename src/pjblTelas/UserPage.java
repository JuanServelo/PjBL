package pjblTelas;

import pjbl.FileManager;
import pjbl.Usuario;

import javax.swing.*;
import java.util.Scanner;

public class UserPage extends JFrame {
    private static final long serialVersionUID = 1L;

    public UserPage(String nome, String email, String senha, String nomeEvento, String data, int capacidade, String descricao) {
        String[] itens = {"Ver dados", "Ver eventos", "Se inscrever"};
        Object opcao = JOptionPane.showInputDialog(null, "Escolha uma opção", "Usuário", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        System.out.println(opcao);

        if (opcao != null && opcao.equals(itens[0])) {
            JOptionPane.showMessageDialog(null, "'Ver dados' selecionado");

            JOptionPane.showMessageDialog(null, nome, "Nome", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, email, "E-mail", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, senha, "Senha", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (opcao != null && opcao.equals(itens[1])) {
            JOptionPane.showMessageDialog(null, "'Ver eventos' selecionado");

            FileManager fm = new FileManager(".database/eventos.csv");

            if (fm.verificarEvento(nomeEvento, data, capacidade, descricao)) {
                JOptionPane.showMessageDialog(null, nomeEvento, "Nome do Evento", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, data, "Data do Evento", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, capacidade, "Capacidade do Evento", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, descricao, "Descrição do Evento", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "Não há eventos os quais você se inscreveu!");
            }
        }
        else if (opcao != null && opcao.equals(itens[2])) {
            JOptionPane.showMessageDialog(null, "'Se inscrever' selecionado");
        }
        else {
            JOptionPane.showMessageDialog(null, "Selecione uma opção válida");
        }
    }
}
