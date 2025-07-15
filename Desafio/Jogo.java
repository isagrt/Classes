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
        rita.classe ="Guerreira";
        rita.oponente="Narcisa";
        rita.definirStatusInicial();
        rita.Separador();

       System.out.println(
    "Contextualizando..." +
    "\n" +
    "Apos uma guerra nuclear, a humanidade caiu.\n" +
    "Animais evoluidos ergueram reinos e magia.\n" +
    "Num novo mundo medieval, guerreiros peludos\n" +
    "lutam por gloria... ou repetem os mesmos erros.\n" +
    "\n" +
    "Entre os mais poderosos, duas gatas se destacam:\n" +
    "Rita, a guerreira roqueira, e Narcisa, a maga sombria.\n" +
    "Irmãs de sangue, separadas por ideais opostos,\n" +
    "elas carregam uma antiga rixa de família que agora\n" +
    "explodirá em um duelo que definirá o destino do reino.\n"
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
                rita.receberDano(2);
                narcisa.mostrarStatus();
                break;
            case 2:
                narcisa.usarHabilidade();
                rita.receberDanoEspecial(10);
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
        
        rita.ritaCorpo();
        System.out.println("Vez de " + rita.nome + ":");
        System.out.println("1 - Arranhar com garras");
        System.out.println("2 - Usar Guitarra magica");
        System.out.println("3 - Ver Status");
        System.out.print("Escolha sua acao: ");
        int escolhaR = scanner.nextInt();

        switch (escolhaR) {
            case 1:
                rita.ataque();
                narcisa.receberDano(2);
                rita.mostrarStatus();
                break;
            case 2:
                rita.usarHabilidade();
                narcisa.receberDanoEspecial(10);
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
