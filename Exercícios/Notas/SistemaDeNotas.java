import java.util.Scanner;

public class SistemaDeNotas{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Nome = ");
        aluno.name = scanner.nextLine();

        System.out.println("Nota do primeiro trimestre = ");
        aluno.trimestre1 = scanner.nextDouble();

        System.out.println("Nota do segundo trimestre = ");
        aluno.trimestre2 = scanner.nextDouble();

        System.out.println("Nota do terceiro trimestre = ");
        aluno.trimestre3 = scanner.nextDouble();

        if(aluno.trimestre1 <= 30 && aluno.trimestre2 <= 35 && aluno.trimestre3 <= 35){
            aluno.NotaFinal();
            aluno.PontosFaltantes();
            
        }
        else{
            System.out.println("Valores Inválidos");
            System.out.println("No primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada) ");
        }
        
    }

}