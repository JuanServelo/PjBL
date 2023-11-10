package pjbl;

import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.Scanner;

public class FileManager {
	
	private String caminhoArquivo;
	public String[][] users = {{"ID", "nome", "e-mail", "senha", "tipo usuario"}};
	public String[][] eventos = {{"ID", "nome", "Data", "Capacidade", "Descrição"}};
	
	public FileManager(String caminhoArquivo) {
		this.caminhoArquivo = caminhoArquivo;
	}
	
	public void adicionarUserLista(int id, String nome, String email, String senha, String tipoUser) {
		String id_user = "" + id;
		users[0][0] = id_user;
		users[0][1] = nome;
		users[0][2] = email;
		users[0][3] = senha;
		users[0][4] = tipoUser;
	}
	
	public void adicionarEventoLista(int id, String nome, String data, String capacidade, String descricao) {
		String id_user = "" + id;
		eventos[0][0] = id_user;
		eventos[0][1] = nome;
		eventos[0][2] = data;
		eventos[0][3] = capacidade;
		eventos[0][4] = descricao;
	}
	
	public void adicionarEventoLista(String nome, String data, String capacidade, String descricao) {
		eventos[0][1] = nome;
		eventos[0][2] = data;
		eventos[0][3] = capacidade;
		eventos[0][4] = descricao;
	}

	public boolean verificarEvento(String nome, String data, String capacidade, String descricao) {
		if (eventos[0][1].equals(nome) && eventos[0][2].equals(data) && eventos[0][3].equals(capacidade) && eventos[0][4].equals(descricao)) {
			return true;
		} else {
			return false;
		}
	}
	
//	public void modificarEvento(String nomeEvento, String nome, String data, String capacidade, String descricao) {
//		File file = new File(caminhoArquivo);
//		try {
//			FileWriter fileWriter = new FileWriter(file, true);
//			for(String[] valor : eventos) {
//				StringBuilder line = new StringBuilder();
//				// esse line está escrevendo tudo no arquivo csv
//				for(int cont = 0; cont < valor.length; cont++) {
//					if(valor[cont] == nomeEvento) {
//						line.delete(0, 4);
//					}
//				}
//				if(validador) {
//					line.append("\n");
//					fileWriter.append(line.toString());
//				}
//			}
//			fileWriter.close();
//			if(validador == false) {
//				throw new ExecaoPersonalizada("Nenhum evento foi encontrado para exclusão!");
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
	
	public void excluirEvento(String nomeEvento) {
		File file = new File(caminhoArquivo);
		boolean validador = false;
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			for(String[] valor : eventos) {
				StringBuilder line = new StringBuilder();
				// esse line está escrevendo tudo no arquivo csv
				for(int cont = 0; cont < valor.length; cont++) {
					if(valor[cont] == nomeEvento) {
						line.delete(0, 4);
						validador = true;
					}
				}
				if(validador) {
					line.append("\n");
					fileWriter.append(line.toString());
				}
			}
			fileWriter.close();
			if(validador == false) {
				throw new ExecaoPersonalizada("Nenhum evento foi encontrado para exclusão!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void lerArquivoUser() {
		File file = new File(caminhoArquivo);
		try {
			Scanner scanner = new Scanner(file);
			String cabecalho = scanner.nextLine();
			System.out.println(cabecalho);
			while (scanner.hasNextLine()) {
				String dado = scanner.nextLine();
				Scanner dadoSeparado = new Scanner(dado).useDelimiter(",");
				System.out.println("ID" + dadoSeparado.nextInt());
				System.out.println("Nome" + dadoSeparado.next());
				System.out.println("Preço" + dadoSeparado.nextInt());
				dadoSeparado.close();
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void validadorUser(String nome, String email, String senha) {
		File file = new File(caminhoArquivo);
		String valoresDigitados = nome+email+senha;
		try {
			Scanner scanner = new Scanner(file);
			String cabecalho = scanner.nextLine();
			System.out.println(cabecalho);
			while(scanner.hasNext()) {
				String dado = scanner.nextLine();
				Scanner dadoSeparado = new Scanner(dado).useDelimiter(",");
				String usuariosArmazenados = "";
				usuariosArmazenados += dadoSeparado.next();//adiciona o nome na String
				usuariosArmazenados += dadoSeparado.next();//adiciona o email na String
				usuariosArmazenados += dadoSeparado.next();//adiciona a senha na String
				dadoSeparado.close();
				if(usuariosArmazenados == valoresDigitados) {
					//usuariovalidado
				}
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void lerArquivoEvento() {
		File file = new File(caminhoArquivo);
		try {
			Scanner scanner = new Scanner(file);
			String cabecalho = scanner.nextLine();
			System.out.println(cabecalho);
			while (scanner.hasNextLine()) {
				String dado = scanner.nextLine();
				Scanner dadoSeparado = new Scanner(dado).useDelimiter(",");
				System.out.println("ID:" + dadoSeparado.nextInt());
				System.out.println("Nome:" + dadoSeparado.next());
				System.out.println("Data:" + dadoSeparado.nextInt());
				System.out.println("Capacidade:" + dadoSeparado.next());
				System.out.println("Descrição:" + dadoSeparado.nextInt());
				dadoSeparado.close();
			}
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void adicionarUsers() {
		File file = new File(caminhoArquivo);
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			for(String[] valor : users) {
				StringBuilder line = new StringBuilder();
				// esse line está escrevendo tudo no arquivo csv
				for(int cont = 0; cont < valor.length; cont++) {
					// pega os valores que estão armazenados na lista de eventos
					line.append(valor[cont]);
					if(cont != valor.length - 1) {
						line.append(',');
					}
				}
				line.append("\n");
				fileWriter.append(line.toString());
			}
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void adicionarEvento() {
		File file = new File(caminhoArquivo);
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			for(String[] valor : eventos) {
				StringBuilder line = new StringBuilder();
				// esse line está escrevendo tudo no arquivo csv
				for(int cont = 0; cont < valor.length; cont++) {
					// pega os valores que estão armazenados na lista de eventos
					line.append(valor[cont]);
					if(cont != valor.length - 1) {
						line.append(',');
					}
				}
				line.append("\n");
				fileWriter.append(line.toString());
			}
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
