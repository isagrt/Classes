import java.util.Scanner;

public class Jogo{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Narcisa narcisa = new Narcisa();
        Rita rita = new Rita();

        do{
        narcisa.AtaqueMago();
        rita.receberDanoGuerreira();
        rita.AtaqueGurreira();
        narcisa.receberDanoMago();
        rita.usarGuitarra();
        narcisa.mostrarStatus();
        narcisa.receberDanoMagoEspecial();
        rita.usarGuitarra();
        narcisa.mostrarStatus();
        narcisa.receberDanoMagoEspecial();
        rita.usarGuitarra();
        narcisa.mostrarStatus();
        narcisa.receberDanoMagoEspecial();
        rita.usarGuitarra();
        narcisa.mostrarStatus();
        narcisa.receberDanoMagoEspecial();

        }
        while(narcisa.vida < 0 || rita.vida < 0);

    }}