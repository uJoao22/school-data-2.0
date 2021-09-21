package pacOutros;

public class Aluno {
	private String nome;
	private Endereco end;
	private int idade, serie;

	public Aluno(String nome, int idade, int serie, Endereco end) {
		this.nome = nome;
		this.idade = idade;
		this.serie = serie;
		this.end = end;
	}

	@Override
	public String toString() {
		return "Nome: " +nome+ ",\nIdade: " +idade+ ",\nSérie: " +serie+ "º,\n" +end;
	}
}