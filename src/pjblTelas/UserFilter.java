package pjblTelas;

import pjbl.Evento;
import pjbl.Usuario;

public class UserFilter extends Usuario {
    public UserFilter(String nome, String email, String senha) {
        super(nome, email, senha);

        if (!filtrarUsuario(nome, email, senha)) {
            throw new IllegalArgumentException("Usuário não cadastrado!");
        }
    }

    @Override
    public boolean filtrarEvento(String nome, String data, int capacidade, String descricao) {
        Evento participante = new Evento(nome, data, capacidade, descricao);

        for (int i = 0; i < participante.participantes.size(); i++) {
            if (participante.participantes.get(i).equals(super.nome)) {
                return true;
            }
        }

        return false;
    }

    public boolean filtrarUsuario(String nome, String email, String senha) {
        if (super.nome.equals(nome) && super.email.equals(email) && super.senha.equals(senha)) {
            return true;
        }
        else {
            return false;
        }
    }
}
