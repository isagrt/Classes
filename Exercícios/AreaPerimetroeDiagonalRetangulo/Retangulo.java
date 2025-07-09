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
    public double diagonal(){
        double d;
        d = Math.pow(altura, 2) + Math.pow(base, 2);
        d = Math.sqrt(d);
        return d;

    }
}