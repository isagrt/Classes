import java.util.Scanner;

public class Jogo{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Personagem personagem = new Personagem();
        Personagem.Narcisa narcisa = new Personagem.Narcisa();
        Personagem.Rita rita = new Personagem.Rita();


        System.out.println("Configuração da personagem Narcisa:");
        narcisa.definirStatusInicial();
        narcisa.mostrarStatus();

        narcisa.Separador();

        System.out.println("Configuração da personagem Rita:");
        rita.definirStatusInicial();
        rita.mostrarStatus();

        narcisa.Separador();

        System.out.println("Após uma guerra nuclear que dizimou a humanidade, a Terra ficou em silêncio. Com o passar dos séculos, os animais, únicos sobreviventes, começaram a evoluir! Influenciados por mutações ou antigas forças esquecidas, aprenderam a falar, andar sobre duas patas e formar sociedades. Inspirando-se nos vestígios da civilização humana, construíram um novo mundo baseado na era medieval. Agora, lobos nobres, gatos cavaleiros, corujas sábias e outros animais governam reinos, travam guerras, praticam magia e escrevem sua própria história, talvez repetindo os erros dos antigos senhores da Terra.");




         while (narcisa.vida > 0 && rita.vida > 0) {
            System.out.println("Turno de " + narcisa.nome + ":");
            System.out.println("1 - Atacar");
            System.out.println("2 - Usar Feitiço");
            System.out.println("3 - Ver Status");
            System.out.print("Escolha sua ação: ");
            int escolhaCisa = scanner.nextInt();

        switch (escolhaCisa) {
            case 1:
                narcisa.AtaqueMago();
                rita.receberDanoGuerreira();
                break;
            case 2:
                narcisa.usarFeitico();
                rita.receberDanoGuerreiraEspecial();
                break;
            case 3:
                narcisa.mostrarStatus();
                continue;
            default:
                System.out.println("Opção inválida. Turno perdido.");
                break;
                }

    if (rita.vida <= 0) break;

    narcisa.Separador();

        System.out.println("Vez de " + rita.nome + ":");
        System.out.println("1 - Atacar");
        System.out.println("2 - Usar Habilidade");
        System.out.println("3 - Ver Status");
        System.out.print("Escolha sua ação: ");
        int escolhaR = scanner.nextInt();

        switch (escolhaR) {
            case 1:
                rita.AtaqueGuerreira();
                narcisa.receberDanoMago();
                break;
            case 2:
                rita.usarGuitarra();
                narcisa.receberDanoMagoEspecial();
                break;
            case 3:
                rita.mostrarStatus();
                continue;
             default:
                System.out.println("Opção inválida. Turno perdido.");
                break;
        }

        narcisa.Separador();
    }


        }}
