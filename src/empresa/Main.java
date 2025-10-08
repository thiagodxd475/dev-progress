package empresa;

import entidades.Desenvolvedor;
import entidades.Gerente;
import entidades.funcionario; 

public class Main {

    public static void main(String[] args) {

     
        Gerente gerente = new Gerente("Ana Costa", "111.222.333-44", 8000.00, 1234, 1000.0);

     
        Desenvolvedor dev = new Desenvolvedor("João Silva", "555.666.777-88", 5000.00, "Java");

        System.out.println("--- Dados do Gerente ---");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário: R$" + gerente.getSalario());
        System.out.println("Bônus: R$" + gerente.calcularBonus()); 
        System.out.println("\n--------------------------\n");

        System.out.println("--- Dados do Desenvolvedor ---");
        System.out.println("Nome: " + dev.getNome());
        System.out.println("Salário: R$" + dev.getSalario());
        System.out.println("Bônus: R$" + dev.calcularBonus()); 
    }
}