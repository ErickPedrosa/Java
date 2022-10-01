package AEDS.Aula04;
import java.util.Scanner;

import AEDS.Aula04.Data;


public class Funcionario {
    
    private String nome;
    private double salario;
    private Data dataDeEntrada;
    private String rg;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Data getDataDeEntrada() {
        return dataDeEntrada;
    }
    public void setDataDeEntrada(Data dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }


    public Funcionario(String nome, double salario, Data dataDeEntrada, String rg)
    {
        this.setNome(nome);
        this.setSalario(salario);
        this.setDataDeEntrada(dataDeEntrada);  
        this.setRg(rg);
    }

    public Funcionario()
    {
        String nome, rg;
        double salario;
        Data dataDeEntrada;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome:");
        nome = input.nextLine();
        System.out.println("Digite o RG:");
        rg = input.nextLine();
        System.out.println("Digite o salário:");
        salario = input.nextDouble();

        System.out.println("Digite a data da entrada do funcionário no banco:");
        
        dataDeEntrada = new Data();

        this.setNome(nome);
        this.setSalario(salario);
        this.setDataDeEntrada(dataDeEntrada);  
        this.setRg(rg);

    }

    public void mostra()
    {
        System.out.println("\nNome: " + nome + "\nSalário: " + salario + "\nData de entrada no banco: " + dataDeEntrada.DataAtual() + "\nRG: " + rg + "\n");
    }

}
