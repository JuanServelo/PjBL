package pjbl;

public class Usuario extends Pessoa{
	
	private int senhaValidada = 0;
	
	public Usuario(String nome, String email, String senha) {
		super.nome = nome;
		super.email = email;
		super.id += 1;
		super.senha = validadorSenha(senha);
		cadastrarUsuarios(nome, email, super.senha);
	}
	
	public void cadastrarUsuarios(String nome, String email, String senha) {
		FileManager fm = new FileManager("./database/users.csv");
		fm.adicionarUserLista(super.id, nome, email, senha, "normal");
		fm.adicionarUsers();
	}

	public boolean filtrarEvento(String nome, String data, int capacidade, String descricao) {
		Evento participante = new Evento(nome, data, capacidade, descricao);

		for (int i = 0; i < participante.participantes.size(); i++) {
			if (participante.participantes.get(i).equals(super.nome)) {
				return true;
			}
		}

		return false;
	}
	
	public void seInscrever(String nome, String nomeEvento, String data, int capacidade, String descricao) {
		Evento evento = new Evento(nomeEvento, data, capacidade, descricao);

		FileManager fm = new FileManager(".database/eventos.csv");

		try {
			if (evento.participantes.contains(nome) && !fm.verificarEvento(nomeEvento, data, capacidade, descricao)) {
				evento.adicionarParticipante(nome);
			}
		}
		
		catch(Exception e) {
			System.out.println("Não foi possivel se inscrever no evento selecionado");
		}
	}
	
	public void cancelarInscrição(int id) {
		try {
			
		}
		
		catch(Exception e) {
			System.out.println("Não foi possivel cancelar a inscrição neste evento!");
		}
	}
	
}
