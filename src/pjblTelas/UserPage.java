package pjblTelas;

import pjbl.FileManager;

import javax.swing.*;

public class UserPage extends JFrame {
    private static final long serialVersionUID = 1L;

    public UserPage(String nome, String email, String senha) {
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
        }
        else if (opcao != null && opcao.equals(itens[2])) {
            JOptionPane.showMessageDialog(null, "'Se inscrever' selecionado");
        }
        else {
            JOptionPane.showMessageDialog(null, "Selecione uma opção válida");
        }
    }
}
