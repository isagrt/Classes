public class Funcionario{
    String nome;
    double salarioBruto;
    double taxa;

    public double SalarioComTaxa(){
        double salarioAtualizado = salarioBruto - taxa;
        return salarioAtualizado;
    }

    public String Info(){
        String info = ("Nome = "+nome+" Salario = "+(salarioBruto - taxa));
        return info;
    }
    public void Aumento(double porcentagem){
       salarioBruto += (salarioBruto * porcentagem);
    }
}