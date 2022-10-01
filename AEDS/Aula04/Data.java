package AEDS.Aula04;
import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public Data(int dia, int mes, int ano)
    {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public Data()
    {
        int dia, mes, ano;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dia:");
        dia = entrada.nextInt();
        System.out.println("Digite o mes:");
        mes = entrada.nextInt();
        System.out.println("Digite o ano:");
        ano = entrada.nextInt();


        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public String DataAtual()
    {
        return (getDia() + "/" + getMes() + "/" + getAno());
    }

    public void ImprimeData()
    {
        System.out.println(this.DataAtual());
    }

}
