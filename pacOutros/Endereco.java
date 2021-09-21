package pacOutros;

public class Endereco {
	private String rua, bairro;
	private int numeroCasa;

	public Endereco(String bairro, String rua, int numeroCasa) {
		this.bairro = bairro;
		this.rua = rua;
		this.numeroCasa = numeroCasa;
	}

	@Override
	public String toString() {
		return "Bairro: " +bairro+ ",\nRua: " +rua+ ",\nNúmero: " + numeroCasa+ ".";
	}
}