public class Retangulo{
    double base;
    double altura;

    public double area(){
        double a = base * altura;
        return a;
    }
    public double perimetro(){
        double p = 2 * (base + altura);
        return p;
    }
    /*public double diagonal(){
        double d = c;
        d = d * c;
        d = Math.pow(altura, 2) + Math.pow(base, 2);

    }*/
}