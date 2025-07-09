import java.util.Scanner;

public class Salario{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Nome = ");
        funcionario.nome = scanner.nextLine();

        System.out.println("Salário Bruto = ");
        funcionario.salarioBruto = scanner.nextDouble();

        System.out.println("Taxa = ");
        funcionario.taxa = scanner.nextDouble();

        System.out.println(funcionario.Info());

        

    }

}