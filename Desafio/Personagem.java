import java.util.Scanner;

public class Personagem{
        public String nome;
        public String oponente;
        public String classe;
        public int nivel = 1;
        public int vida = 100;
        public int mana;
        public int forca;

        public void Separador(){
            System.out.println("------------------------------");
        }
        public void Historia(){
            String desenho =                                                             
                                                                                                      
        }

        public void definirStatusInicial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Defina o nivel de forca para " + nome + ": ");
        forca = scanner.nextInt();

        System.out.print("Defina o nivel de mana para " + nome + "\nLEMBRETE!! " +nome + " eh um" +classe+ "  : ");
        mana = scanner.nextInt();

        System.out.println("Status definidos! Forca: " + forca + " | Mana: " + mana);
        }


        public void Ataque(){
            forca += 2;
            mana += 2;
            System.out.println(nome+" utiliza seu cajado magico para atacar "+oponente);
            System.out.println("+1 de forca!! Forca atual : "+forca);
        }
        public void receberDano(){
            
            if(vida > 0){
                vida -= 2;
                System.out.println(nome+" tenta desviar do golpe de guitarra de "+oponente+" e infelizmente não consegue :(  ");
                System.out.println("+5 de dano :( Vida atual : "+vida);
            }
            else{
                System.out.println("Fim de jogo para"+nome+" :( Parabens "+oponente);
            }


        }
        public void receberDanoEspecial(){
            if(vida > 0 ){
                vida -= 10;
                System.out.println(nome+" tenta desviar do golpe de guitarra de "+oponente+" e infelizmente não consegue :(  ");
                System.out.println("+10 de dano :( Vida atual : "+vida);
            }
            else{
                System.out.println("Fim de jogo para"+nome+" :( Parabens "+oponente);
            }


        }
        public void usarHabilidade(){
            forca += 4; 
            mana -= 4;
            System.out.println(nome+" lanca sua magia negra para atacar"+oponente);
            System.out.println("+2 de forca!! Forca atual: "+forca);
        }
        public void subirDeNivel(){
            if(mana == 75 && forca == 50){
                System.out.println(nome+", parabens você subiu de nivel!!");
                mana += 10;
                forca += 2;
                vida += 10;
                nivel += 1;
            }
        }
        public void mostrarStatus(){
            System.out.println
            ("Nome: "+nome+" | Classe: Mago | Vida: "+vida+" | Forca: "+forca+" | Mana: "+mana);
        }

}