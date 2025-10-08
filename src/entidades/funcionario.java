package entidades;

public class funcionario {

	private String nome;
	private String cpf;
	private Double salario;

	public funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getSalario() {
		return salario;
	}
	
	public double calcularBonus() {
		return salario * 0.10; 
	  
	}
	
	
}
