    /*import java.util.Scanner;

    public class Rita{
    public String nome = "Rita";
    public String oponente = "Narcisa";
    public int nivel = 1;
    public int vida = 100;
    public int mana = 70;
    public int forca = 30;
    

        public void Separador(){
            System.out.println("------------------------------");
        }
        public void Historia(){
            System.out.println(" oii");
        }

        public void definirStatusInicial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Defina o nível de força para " + nome + " \nLEMBRETE!!:" +nome+ "é um gurreiro ");
        forca = scanner.nextInt();

        System.out.print("Defina o nível de mana para " + nome + ": ");
        mana = scanner.nextInt();

        System.out.println("Status definidos! Força: " + forca + " | Mana: " + mana);
        }

        public void AtaqueGuerreira(){
            forca += 2;
            mana += 2;
            System.out.println(nome+" utiliza seu cajado mágico para atacar "+oponente);
            System.out.println("+1 de força!! Força atual : "+forca);
        }
        public void receberDanoGuerreira(){
            
            if(vida > 0){
                vida -= 2;
                System.out.println(nome+" tenta desviar do golpe de guitarra de "+oponente+" e infelizmente não consegue :(  ");
                System.out.println("+5 de dano :( Vida atual : "+vida);
            }
            else{
                System.out.println("Fim de jogo para"+nome+" :( Parabebéns "+oponente);
            }


        }
        public void receberDanoGuerreiraEspecial(){
            if(vida > 0 ){
                vida -= 10;
                System.out.println(nome+" tenta desviar do golpe de guitarra de "+oponente+" e infelizmente não consegue :(  ");
                System.out.println("+10 de dano :( Vida atual : "+vida);
            }
            else{
                System.out.println("Fim de jogo para"+nome+" :( Parabebéns "+oponente);
            }


        }
        public void usarGuitarra(){
            forca += 4; 
            mana -= 4;
            System.out.println(nome+" lança sua mágia negra para atacar"+oponente);
            System.out.println("+2 de força!! Força atual: "+forca);
        }
        public void subirDeNivel(){
            if(mana == 75 && forca == 50){
                System.out.println("   Parabéns você subiu de nível!!");
                mana += 10;
                forca += 2;
                vida += 10;
                nivel += 1;
            }
        }
        public void mostrarStatus(){
            System.out.println
            ("Nome: "+nome+" | Classe: Guerreira | Vida: "+vida+" | Força: "+forca+" | Mana: "+mana);
        }





    }
*/