package entidades;

public class Desenvolvedor extends funcionario {

    private String linguagemPrincipal;

        public Desenvolvedor(String nome, String cpf, double salario, String linguagemPrincipal) {
        super(nome, cpf, salario); 
        this.linguagemPrincipal = linguagemPrincipal;
    }

    
    @Override
    public double calcularBonus() {

        return super.calcularBonus() * 1.15;
    }
}
