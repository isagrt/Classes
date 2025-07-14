import java.util.Scanner;

public class Jogo{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //DEFININDO PARAMETROS PARA A PRIMEIRA PERSONAGEM
        Personagem narcisa = new Personagem();
        narcisa.nome = "Narcisa";
        narcisa.classe = "Maga";
        narcisa.oponente = "Rita";
        narcisa.definirStatusInicial();
        narcisa.mostrarStatus();
        narcisa.Separador();

        Personagem rita = new Personagem();
        rita.nome = "Rita";
        rita.classe ="Gurreira";
        rita.oponente="Narcisa";
        rita.definirStatusInicial();
        rita.Separador();

        System.out.println(
    "==============================================\n" +
    "                   WAR CAT             \n" +
    "==============================================\n" +
    "Apos uma guerra nuclear, a humanidade foi dizimada.\n" +
    "A Terra mergulhou em silencio por seculos...\n\n" +
    "Dos escombros, os animais evoluiram, aprenderam a falar,\n" +
    "andar sobre duas patas e construir novas sociedades.\n\n" +
    "Inspirados na civilizacao humana, criaram um mundo\n" +
    "medieval, repleto de magia, reinos e batalhas epicas.\n\n" +
    "Lobos nobres, gatos cavaleiros, corujas sabias\n" +
    "e outros seres agora escrevem a nova historia da Terra...\n" +
    "Talvez repetindo os erros dos antigos senhores.\n" +
    "=============================================="
);

        System.out.println("");
        

        while (narcisa.vida > 0 && rita.vida > 0) {
            narcisa.narcisaCorpo();
            System.out.println("Vez " + narcisa.nome + ":");
            System.out.println("1 - Bater com cajado");
            System.out.println("2 - Usar cajado encantado");
            System.out.println("3 - Ver Status");
            System.out.print("Escolha sua acao: ");
            int escolhaCisa = scanner.nextInt();

        switch (escolhaCisa) {
            case 1:
                narcisa.ataque();
                rita.receberDano();
                narcisa.mostrarStatus();
                break;
            case 2:
                narcisa.usarHabilidade();
                rita.receberDanoEspecial();
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
                rita.ataque();
                narcisa.receberDano();
                rita.mostrarStatus();
                break;
            case 2:
                rita.usarHabilidade();
                narcisa.receberDanoEspecial();
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
    }
        if(rita.vida <= 0){
            System.out.println("Parabens Narcisa, voce eh a maior feiticeira deste reino!!");
        }else{
            System.out.println("Parabens Rita, voce eh a maior guerreira deste reino!!");
        }
    
        }}
