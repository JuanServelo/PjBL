package pjbl;

import pjbl.Evento;

public class Organizador extends Pessoa {
	
	public Organizador(String nome, String email, String senha) {
		super.nome = nome;
		super.email = email;
		super.id += 1;
		super.senha = validadorSenha(senha);
		cadastrarUsuarios(nome, email, super.senha);
	}
	
	public void cadastrarUsuarios(String nome, String email, String senha) {
		FileManager fm = new FileManager("./database/users.csv");
		fm.adicionarUserLista(super.id, nome, email, senha, "organizador");
		fm.adicionarUsers();
	}

	public boolean filtrarEvento(String nome, String data, int capacidade, String descricao) {
		Evento palestrante = new Evento(nome, data, capacidade, descricao);

		for (int i = 0; i < palestrante.palestrantes.size(); i++) {
			if (palestrante.palestrantes.get(i).equals(super.nome)) {
				return true;
			}
		}

		return false;
	}
	
	private void criarEvento(String nome, String data, int capacidade, String descricao) {
		Evento evento = new Evento(nome, data, capacidade, descricao);
	}
	
	private void excluirEvento(String nomeEvento) {
		try {
			FileManager fm = new FileManager(".database/eventos.csv");
			fm.excluirEvento(nomeEvento);
		}
		catch(Exception e) {
			System.out.println("Não foi possivel remover o evento selecionado!");
		}
	}
	
	private void modificarEvento(String oldName, int id,  String nome, String data, int capacidade, String descricao) {
		try {
			FileManager fm = new FileManager(".database/eventos.csv");
			String strCapacidade = String.valueOf(capacidade);
			fm.adicionarEventoLista(nome, data, strCapacidade, descricao);
		}
		catch(Exception e ) {
			System.out.println("Não foi possivel modificar o evento selecionado!");
		}
		
	}
	
}
