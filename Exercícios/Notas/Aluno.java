public class Aluno{
    public String name;
    public double trimestre1;
    public double trimestre2;
    public double trimestre3, pontos, notafinal;

  //media final
  public double NotaFinal(){
    notafinal = trimestre1 + trimestre2 + trimestre3;
     if (notafinal >= 60 ){
        System.out.println(name+" você está aprovado(a) : "+notafinal);
     }
     if(notafinal < 60){
        System.out.println(name+" você falhou: " +notafinal);
        
     }
     return notafinal;
  }

  //pontos que faltam 
    public double PontosFaltantes(){
    pontos = 60 - notafinal;
    System.out.println("Pontos faltantes: "+pontos);
    return pontos;
  }

}