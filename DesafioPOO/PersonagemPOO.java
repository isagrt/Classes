import java.util.Scanner;

public class PersonagemPOO{
        public String nome;
        public String oponente;
        public String classe;
        public int nivel = 1;
        public int vida = 100;
        public int mana;
        public int forca;

        public void Separador(){
            System.out.println("\n:.:.:.:.:.::.:.:.:.:.::.:.:.:.:.::.:.:.:.:.:\n");
        }
        public void narcisaCorpo(){
            
           System.out.println("          X                                           ");
        System.out.println("         / \\                                          ");
        System.out.println("        /\\_/\\                                        ");
        System.out.println("     »( o.o )«                                  ");
        System.out.println("        > - <   oo                               ");
        System.out.println("       (  *  ) o                                     ");
        System.out.println("        \\ | /oo                                     ");
        System.out.println("         O O                                         ");
        System.out.println("                                                     ");
        System.out.println("                 ");                                 
                                                                                                      
        }

        

       
        public void definirStatusInicial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(">> CONFIGURACAO DA PERSONAGEM "+nome.toUpperCase()+":");
        System.out.print("Defina o nivel de forca para " + nome + "\nLEMBRETE!! " +nome + " eh uma " +classe.toLowerCase()+ ": ");
        forca = scanner.nextInt();
        
        if (classe.equals("Maga")){  //definindo mana só para magos  
        System.out.print("Defina o nivel de mana para " + nome + "\nLEMBRETE!! " +nome + " eh uma " +classe.toLowerCase()+ ": ");
        mana = scanner.nextInt();   
        System.out.println("Status definidos! Forca: " + forca + " | Mana: " +mana);}
        else if(classe.equals("Guerreira")){
            System.out.println("Status definidos! Forca: " + forca);
        }return;
        }


        public void ataque(){
            forca += 2;
            System.out.println(nome+" ataca "+oponente+" sem do nenhuma!!");
            System.out.println("+1 de forca!! Forca atual : "+forca);
        }
        public void receberDano(int dano){
            vida -= dano;
            if(vida > 0){
                System.out.println(nome+" tenta desviar do golpe de "+oponente+" e infelizmente não consegue :(  ");
                System.out.println("+5 de dano :( Vida atual : "+vida);
            }
            else{
                System.out.println("Fim de jogo para"+nome+" :( Parabens "+oponente);
            }
        }
        public void receberDanoEspecial(int dano){
            vida -= dano;
            if(vida > 0 ){
                System.out.println(nome+" tenta desviar do golpe de "+oponente+" e infelizmente não consegue :(  ");
                System.out.println("+10 de dano :( Vida atual : "+vida);
            }
            else{
                System.out.println("Fim de jogo para"+nome+" :( Parabens "+oponente);
            }


        }
        public void usarHabilidade(){
            forca += 4;             
            if (classe.equals("Maga")){
                mana -= 4;
                System.out.println(nome+" lanca sua magia negra para atacar"+oponente);
                System.out.println("+2 de forca!! Forca atual: "+forca);
            }else if(classe.equals("Guerreira")){
                System.out.println(nome+" utiliza sua guitarra para atacar "+oponente);
                System.out.println("+2 de forca!! Forca atual: "+forca);
            }
            
            
        }
        public void subirDeNivel(){
                if (classe.equals("Maga"))
                {System.out.println(nome+", parabens você subiu de nivel!!");
                mana += 10;
                forca += 2;
                vida += 10;
                nivel += 1;}
                else if(classe.equals("Guerreira")){
                System.out.println(nome+", parabens você subiu de nivel!!");
                forca += 2;
                vida += 10;
                nivel += 1;}
        
        }
        public void mostrarStatus(){
            System.out.println
            ("Nome: "+nome+" | Classe: " +classe+ " | Vida: "+vida+" | Forca: "+forca+" | Mana: "+mana);
        }

}