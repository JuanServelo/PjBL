package pjbl;

import java.util.Scanner;

public abstract class Pessoa {
	
	protected String nome;
	protected String email;
	protected String senha;
	public int id = 0;
	private int contador = 0;
	
	public void Pessoa(String nome, String email, String senha){
		this.nome = nome;
		this.email = email;
		this.senha = validadorSenha(senha);
		this.id += 1;
	}
	
	public void cadastrarUsuarios(String nome, String email, String senha) {
		FileManager fm = new FileManager("./database/users.csv");
		fm.adicionarUserLista(id, nome, email, senha, "tipoUsuario");
		fm.adicionarUsers();
	}
	
	protected String validadorSenha(String senha) {
		
		boolean validadorLetra = false;
		boolean validadorNum = false;
		boolean validadorCaracterEsp = false;
		boolean validadorLetraLowerCase = false;
		boolean validadorLetraUperCase = false;
		
		Scanner teclado = new Scanner(System.in);
		
		if (contador == 1) {
			System.out.println("Crie uma senha com ao menos uma letra maiuscula, uma minuscula, um numero e um caracter especial:");
			senha = teclado.next();
		}
		
		for(int cont = 0; cont < senha.length(); cont ++) {
			
			char c = senha.charAt(cont);
			
			if(Character.isLetter(c) == true) {
				validadorLetra = true;
				if(Character.isLowerCase(c) == true) {
					validadorLetraLowerCase = true;
				}
				else {
					validadorLetraUperCase = true;
				}
			}
			if(Character.isDigit(c)) {
				validadorNum = true;
			}
			
			if (cont == (senha.length() - 1)) {
				if((validadorLetra && validadorLetraLowerCase && validadorLetraUperCase && validadorNum) == true) {
					this.senha = senha;
					return senha;
				}
				else{
					System.out.println("A senha deve conter pelo menos uma letra maiuscula, uma minuscula, um numero e um caracter especial");
					contador = 1;
					validadorSenha(senha);
					break;
				}
			}
		}
		return this.senha;
		
	}
	
}
