import java.util.Locale;

public class Programa {
    public static void main (String[] args){

        //Locale.setDefault(new Locale(language: "pt", country: "BR"));
        System.out.println("Calculo de Área do Triângulo: ");

        /*
            - Triangulo válido 
                a + b > c
                a + c > b
                b + c > a
        */

        Triangulo triangulo1 = new Triangulo();
        triangulo1.ladoA = 3;
        triangulo1.ladoB = 4;
        triangulo1.ladoC = 5;


        Triangulo triangulo2 = new Triangulo();
        triangulo2.ladoA = 7.5;
        triangulo2.ladoB = 4.5;
        triangulo2.ladoC = 4.02;
        

        Triangulo triangulo3 = new Triangulo();
        triangulo3.ladoA = 6;
        triangulo3.ladoB = 8;
        triangulo3.ladoC = 7;


        double areaTriangulo1 = triangulo1.area();
        double areaTriangulo2 = triangulo2.area();
        double areaTriangulo3 = triangulo3.area();
        
        System.out.println("Area triangulo 1: " +areaTriangulo1);
        System.out.println("Area triangulo 2: " +areaTriangulo2);
        System.out.println("Area triangulo 3: " +areaTriangulo3);

    } 
}