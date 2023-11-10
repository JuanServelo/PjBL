package pjblTelas;

import javax.swing.*;

public class AdminPage extends JFrame {
    private static final long serialVersionUID = 1L;

    public AdminPage() {
        String[] itens = {"Ver dados", "Ver eventos criados", "Criar Eventos"};
        Object opcao = JOptionPane.showInputDialog(null, "Escolha uma opção", "Organizador", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        System.out.println(opcao);

        if (opcao != null && opcao.equals(itens[0])) {
            JOptionPane.showMessageDialog(null, "'Ver dados' selecionado");
        }
        else if (opcao != null && opcao.equals(itens[1])) {
            JOptionPane.showMessageDialog(null, "'Ver eventos criados' selecionado");
        }
        else if (opcao != null && opcao.equals(itens[2])) {
            JOptionPane.showMessageDialog(null, "'Criar eventos' selecionado");
        }
        else {
            JOptionPane.showMessageDialog(null, "Selecione uma opção válida");
        }
    }
}
