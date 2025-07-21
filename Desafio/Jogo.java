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
    "Num mundo medieval pos-nuclear, gatos e outros animais\n" +
    "evoluidos disputam reinos com magia e espada.\n" +
    "\n" +
    "Rita, a guerreira roqueira, e Narcisa, a maga sombria,\n" +
    "sao irmas marcadas por uma antiga rixa de familia.\n" +
    "Agora, o duelo entre elas vai decidir o destino do reino.\n" +
    "\n" +
    "--------- REGRAS ---------\n" +
    "- Turnos alternados;\n" +
    "- Escolhas invalidas = perde a vez;\n" +
    "- Magos usam mana;\n" +
    "- Guerreiros tem mais forca;\n" +
    "---------------------------\n"
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
                System.out.println(" ");
                rita.receberDano(2);
                System.out.println(" ");
                narcisa.mostrarStatus();
                break;
            case 2:
                narcisa.usarHabilidade();
                System.out.println(" ");
                rita.receberDanoEspecial(10);
                System.out.println(" ");
                narcisa.mostrarStatus();
                break;
            case 3:
                narcisa.mostrarStatus();
                if(narcisa.forca == 60){
                rita.subirDeNivel();    
                }
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
                System.out.println(" ");
                narcisa.receberDano(2);
                System.out.println(" ");
                rita.mostrarStatus();
                break;
            case 2:
                rita.usarHabilidade();
                System.out.println(" ");
                narcisa.receberDanoEspecial(10);
                System.out.println(" ");
                rita.mostrarStatus();
                break;
            case 3:
                rita.mostrarStatus();
                if(rita.forca == 65){
                rita.subirDeNivel();    
                }
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
