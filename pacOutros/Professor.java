package pacOutros;

public class Professor {
	private String nome, materia;
	private Endereco end;
	private int idade;
	
	public Professor(String nome, int idade, String materia, Endereco end) {
		this.nome = nome;
		this.idade = idade;
		this.materia = materia;
		this.end = end;
	}

	@Override
	public String toString() {
		return "Nome: " +nome+ ",\nIdade: " +idade+ ",\nMatéria: " +materia+ ",\n" +end;
	}
}