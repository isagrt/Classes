public class Rita{
    String nome = "Rita";
    String oponente = "Narcisa";
    int nivel = 1;
    int vida = 100;
    int mana = 40;
    int forca = 40;
    int somaForca , somaVida, somaMana;

        public void Historia(){
            System.out.println(" oii");
        }

        public void AtaqueGurreira(){
            somaForca = forca + 1;
            somaMana = mana + 1;
            System.out.println(nome+" utiliza sua guitarra espada poderosa para atacar "+oponente+ " com força!!");
            System.out.println("+1 de força!! Força atual : "+somaForca);
        }
        public void receberDanoGuerreira(){
            somaVida = vida - 5;
            if(vida > 0 && vida < 101){
                System.out.println(nome+" tenta desviar da magia negra de "+oponente+" e infelizmente não consegue :(  ");
                System.out.println("+5 de dano :( Vida atual : "+somaVida);
            }else{
                System.out.println("Fim de jogo para"+nome+" :( Parabebéns "+oponente);
            }

        }
        public void receberDanoGuerreiraEspecial(){
            somaVida = vida - 10;
            if(vida > 0 && vida < 101){
                System.out.println(nome+" tenta desviar da magia negra de "+oponente+" e infelizmente não consegue :(  ");
                System.out.println("+10 de dano :( Vida atual : "+somaVida);
            }else{
                System.out.println("Fim de jogo para"+nome+" :( Parabebéns "+oponente);
            }

        }
        public void usarGuitarra(){
            somaForca = forca + 2; 
            somaMana = mana - 5;
            System.out.println(nome+" lança sua mágia negra para atacar"+oponente);
            System.out.println("+2 de força!! Força atual: "+somaForca);
        }
        public void subirDeNivel(){
            if(mana == 80 && forca == 80){
                System.out.println("   Parabéns você subiu de nível!!");
                somaMana = mana + 10;
                somaForca = forca + 3;
                somaVida = vida + 10;
            }
        }
        public void mostrarStatus(){
            System.out.println
            ("Nome: "+nome+" | Classe: Guerreira | Vida: "+somaVida+" | Força: "+somaForca+" | Mana: "+somaMana);
        }





    }
