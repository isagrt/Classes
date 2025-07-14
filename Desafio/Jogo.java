import java.util.Scanner;

public class Jogo{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Personagem personagem = new Personagem();


        System.out.println("Configuracao da personagem Narcisa:");
        narcisa.definirStatusInicial();
        narcisa.mostrarStatus();
        //narcisa.Historia();
        narcisa.Separador();

        System.out.println("Configuracao da personagem Rita:");
        rita.definirStatusInicial();
        rita.mostrarStatus();

        narcisa.Separador();

        System.out.println("Apos uma guerra nuclear que dizimou a humanidade, a Terra ficou em silencio. Com o passar dos seculos, os animais, unicos sobreviventes, comecaram a evoluir!\nInfluenciados por mutacoes ou antigas forcas esquecidas, aprenderam a falar, andar sobre duas patas e formar sociedades.\nInspirando-se nos vestigios da civilizacao humana, construiram um novo mundo baseado na era medieval.\nAgora, lobos nobres, gatos cavaleiros, corujas sabias e outros animais governam reinos, travam guerras, praticam magia e escrevem sua propria historia, talvez repetindo os erros dos antigos senhores da Terra.");
        System.out.println("");
        

         /*while (narcisa.vida > 0 && rita.vida > 0) {
            System.out.println("Vez " + narcisa.nome + ":");
            System.out.println("1 - Bater com cajado");
            System.out.println("2 - Usar cajado encantado");
            System.out.println("3 - Ver Status");
            System.out.print("Escolha sua acao: ");
            int escolhaCisa = scanner.nextInt();

        switch (escolhaCisa) {
            case 1:
                narcisa.AtaqueMago();
                rita.receberDanoGuerreira();
                narcisa.mostrarStatus();
                break;
            case 2:
                narcisa.usarFeitico();
                rita.receberDanoGuerreiraEspecial();
                narcisa.mostrarStatus();
                break;
            case 3:
                narcisa.mostrarStatus();
                continue;
            default:
                System.out.println("Opçao invalida. Vez de Rita.");
                break;
                }
  

    if (rita.vida <= 0) break;

    narcisa.Separador();

        System.out.println("Vez de " + rita.nome + ":");
        System.out.println("1 - Arranhar com garras");
        System.out.println("2 - Usar Guitarra magica");
        System.out.println("3 - Ver Status");
        System.out.print("Escolha sua acao: ");
        int escolhaR = scanner.nextInt();

        switch (escolhaR) {
            case 1:
                rita.AtaqueGuerreira();
                narcisa.receberDanoMago();
                rita.mostrarStatus();
                break;
            case 2:
                rita.usarGuitarra();
                narcisa.receberDanoMagoEspecial();
                rita.mostrarStatus();
                break;
            case 3:
                rita.mostrarStatus();
                continue;
             default:
                System.out.println("Opcao invalida. Vez de Narcisa");
                break;
        }

        narcisa.Separador();
    }*/
        if(rita.vida <= 0){
            System.out.println("Parabens Narcisa, voce eh a maior feiticeira deste reino!!");
        }else{
            System.out.println("Parabens Rita, voce eh a maior guerreira deste reino!!");
        }
    
        }}
