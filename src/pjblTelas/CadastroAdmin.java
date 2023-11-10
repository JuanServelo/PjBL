package pjblTelas;

import javax.swing.*;
import pjbl.Organizador;
import pjbl.Usuario;

public class CadastroAdmin extends JFrame {
    private static final long serialVersionUID = 1L;

    private String nome;
    private String email;
    private String senha1;
    private String senha2;

    public CadastroAdmin() {
        nome = JOptionPane.showInputDialog(null, "Informe seu nome: ");
        email = JOptionPane.showInputDialog(null, "Informe seu e-mail: ");
        senha1 = JOptionPane.showInputDialog(null, "Crie uma senha: ");
        senha2 = JOptionPane.showInputDialog(null, "Confirme sua senha: ");

        if (!senha1.equals(senha2)) {
            throw new IllegalArgumentException("Ambas as senhas devem ser iguais!");
        }

        System.out.println(nome);
        System.out.println(email);
        System.out.println(senha2);

        if (nome != null && email != null && senha2 != null) {
            Organizador admin = new Organizador(nome, email, senha2);
        }
        else {
            JOptionPane.showMessageDialog(null, "Erro no cadastro!");
        }
    }
}
