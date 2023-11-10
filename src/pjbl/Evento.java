package pjbl;

import java.util.ArrayList;
import java.util.Objects;

public class Evento {
	
	private String nome;
	private String data;
	public int capacidade;
	private String descricao;
	public ArrayList<String> palestrantes = new ArrayList<>();
	public ArrayList<String> participantes = new ArrayList<>();
	private int idEvento = 0;
	
	public Evento(String nome, String data, int capacidade, String descricao) {
		this.nome = validadorNome(nome);
		this.capacidade = capacidade;
		this.data = data;
		this.descricao = descricao;
		this.idEvento += 1;
		String strCapacidade = String.valueOf(capacidade);
		FileManager fm = new FileManager("./database/eventos.csv");
		fm.adicionarEventoLista(idEvento, nome, data, strCapacidade, descricao);
		fm.adicionarEvento();
	}
	
	protected String validadorNome(String nome) {
		
		try {
			if(nome.length() > 10) {
				throw new ExecaoPersonalizada("Nome do evendo excede o limite!");
			}
			return nome;
		} catch (ExecaoPersonalizada e) {
			e.printStackTrace();
			String error = "Exceção personalizada";
			return error;
		}
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public ArrayList getPalestrantes() {
		System.out.println("Lista de palestrantes: ");
		return palestrantes;
	}
	
	public ArrayList getParticipantes() {
		System.out.println("Lista de participantes");
		return participantes;
	}
	
	public void excluirParticipantes(String participante) {
        try {
        	participantes.remove(participante);
        	System.out.println(participante + "removida com Sucesso!");
        }
        catch(ArithmeticException e) {
        	System.out.println(participante + "Não encontrado!");
        }
	}
	
	public void excluirPalestrante(String palestrante) {
        try {
        	palestrantes.remove(palestrante);
        	System.out.println(palestrante + "removida com Sucesso!");
        }
        catch(Exception e) {
        	System.out.println(palestrante + "Não encontrado!");
        }
	}
	
	public void adicionarPalestrante(String palestrante) {
		try {
			if(palestrantes.contains(palestrante) == false && (palestrantes.size() < capacidade)){
				palestrantes.add(palestrante);
			}
		}
		catch(Exception e){
			System.out.println("Não foi possivel adicionar o palestrante indicado");
		}
	}
	
	public void adicionarParticipante(String participante) {
		try {
			if(participantes.contains(participante) == false && (participantes.size() < capacidade)) {
				participantes.add(participante);
			}
		}
		catch (Exception e) {
			System.out.println("Não foi possivel adicionar o participante solicitado!");
		}
	}
	
	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return nome == evento.nome && Objects.equals(data, evento.data) && Objects.equals(capacidade, evento.capacidade);
    }

    public int hashCode() {
        return Objects.hash(nome, data, capacidade);
    }
}
