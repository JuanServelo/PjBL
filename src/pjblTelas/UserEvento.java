package pjblTelas;

import pjbl.FileManager;
import pjbl.Usuario;
import javax.swing.*;

public class UserEvento extends JFrame {
    public UserEvento(String nomeEvento, String data, int capacidade, String descricao, String nome, String email, String senha) {
        String[] itens = {"Informações", "Se inscrever", "Se desinscrever"};
        Object opcao = JOptionPane.showInputDialog(null, "Escolha uma opção", "Usuário", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        System.out.println(opcao);

        if (opcao != null && opcao.equals(itens[0])) {
            FileManager fm = new FileManager("./database/eventos.csv");

            if (fm.verificarEvento(nomeEvento, data, capacidade, descricao)) {
                JOptionPane.showMessageDialog(null, nomeEvento, "Nome do Evento", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, data, "Data do Evento", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, capacidade, "Capacidade do Evento", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, descricao, "Descrição do Evento", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null, "Não existem informações sobre o evento!");
            }
        }
        else if (opcao != null && opcao.equals(itens[1])) {
            Usuario usuario = new Usuario(nome, email, senha);

            usuario.seInscrever(nome, nomeEvento, data, capacidade, descricao);
        }
        else if (opcao != null && opcao.equals(itens[2])) {
            Usuario usuario = new Usuario(nome, email, senha);

            usuario.cancelarInscrição(nome, nomeEvento, data, capacidade, descricao);
        }
        else {
            JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
        }
    }
}
