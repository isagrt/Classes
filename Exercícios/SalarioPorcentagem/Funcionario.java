public class Funcionario{
    String nome;
    double salarioBruto;
    double taxa;

    public double SalarioComTaxa(){
        double salarioAtualizado = salarioBruto - taxa;
        return salarioAtualizado;
    }

    public String Info(){
        String info = ("Nome = "+nome+" | Salario = "+(salarioBruto - taxa));
        return info;
    }
    public double Aumento(double porcentagem){
       salarioBruto = salarioBruto + (salarioBruto * porcentagem);
       return porcentagem;
    }
}