import java.util.Scanner;

public class Calculo{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a base e a altura do retângulo: ");
        Retangulo retangulo = new Retangulo();
        retangulo.base = scanner.nextDouble();
        retangulo.altura = scanner.nextDouble();

        //area
        double areaRetangulo = retangulo.area();
        System.out.println("Area = "+areaRetangulo);

        //perimetro
        double perimetroRetangulo = retangulo.perimetro();
        System.out.println("Perimetro = "+perimetroRetangulo);

        //diagonal
        double diagonalRetangulo = retangulo.diagonal();
        System.out.println("Diagonal = "+diagonalRetangulo);
    }

}