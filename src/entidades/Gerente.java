package entidades;

public class Gerente extends funcionario {

	
	private int  senhaDeAcesso;
    private double bonusExtra;
    
	public Gerente(String nome, String cpf, double salario, int senhaDeAcesso, double bonusExtra) {
		super(nome, cpf, salario);
		this.senhaDeAcesso = senhaDeAcesso;
		this.bonusExtra = bonusExtra;
	}


	@Override
	public double calcularBonus() {
		
		return super.calcularBonus() + bonusExtra;
	}
}
