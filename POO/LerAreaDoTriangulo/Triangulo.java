public class Triangulo {

    //Atributos (característivas e campos/variáveis)
    double ladoA;
    double ladoB;
    double ladoC;

    //Metodos (Ação e comportamento)
    public double area(){
        double p = (ladoA + ladoB + ladoC) / 2.0;
        double area = Math.sqrt(p *(p - ladoA) * (p - ladoB) * (p - ladoC));
        return area;
    }
}