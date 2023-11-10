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
	
	public void seInscrever(String nome) {
		try {
			
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
