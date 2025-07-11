import java.util.Scanner;

public class Jogo{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Narcisa narcisa = new Narcisa();
        Rita rita = new Rita();
        
        System.out.println("Após uma guerra nuclear que dizimou a humanidade, a Terra ficou em silêncio. Com o passar dos séculos, os animais, únicos sobreviventes, começaram a evoluir! Influenciados por mutações ou antigas forças esquecidas, aprenderam a falar, andar sobre duas patas e formar sociedades. Inspirando-se nos vestígios da civilização humana, construíram um novo mundo baseado na era medieval. Agora, lobos nobres, gatos cavaleiros, corujas sábias e outros animais governam reinos, travam guerras, praticam magia e escrevem sua própria história, talvez repetindo os erros dos antigos senhores da Terra.");

        do{
          narcisa.AtaqueMago();
          rita.receberDanoGuerreira();
        }
        while(narcisa.vida < 0 || rita.vida < 0);

    }}