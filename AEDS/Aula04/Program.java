package AEDS.Aula04;
import AEDS.Aula04.Funcionario;

public class Program {
    
    public static void main(String[] args)
    {
        Funcionario func1, func2, func3;

        Data data = new Data(02, 10, 0);

        func1 = new Funcionario("Erick Pedrosa", 1000000, data, "12121212");
        func2 = new Funcionario(/*"Erick Pedrosa", 1000000, data, "12121212"*/);
        func3 = func1;

        func1.mostra();
        func2.mostra();
        func3.mostra();

        if (func1 == func2)
        {
            System.out.println("O funcionário 1 é igual ao funcionário 2");
        }
        else
        {
            System.out.println("O funcionário 1 é diferente do funcionário 2");
        }

        if (func1 == func3)
        {
            System.out.println("O funcionário 1 é igual ao funcionário 3");
        }

    }

}
