package pjblTelas;

import pjbl.Evento;
import pjbl.Organizador;

public class AdminFilter extends Organizador {
    public AdminFilter(String nome, String email, String senha) {
        super(nome, email, senha);

        if (!filtrarUsuario(nome, email, senha)) {
            throw new IllegalArgumentException("Usuário não cadastrado!");
        }
    }

    @Override
    public boolean filtrarEvento(String nome, String data, int capacidade, String descricao) {
        Evento palestrante = new Evento(nome, data, capacidade, descricao);

        for (int i = 0; i < palestrante.palestrantes.size(); i++) {
            if (palestrante.palestrantes.get(i).equals(super.nome)) {
                filtrarUsuario(super.nome, super.email, super.senha);
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
