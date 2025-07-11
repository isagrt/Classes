public class Narcisa{
    public String nome = "Narcisa";
    public String oponente = "Rita";
    public int nivel = 1;
    public int vida = 100;
    public int mana = 70;
    public int forca = 30;
     int somaForca , somaVida, somaMana;

        public void Historia(){
            System.out.println(" oii");
        }

        public void AtaqueMago(){
            somaForca = forca + 1;
            somaMana = mana + 1;
            System.out.println(nome+" utiliza seu cajado mágico para atacar "+oponente);
            System.out.println("+1 de força!! Força atual : "+somaForca);
        }
        public void receberDanoMago(){
            somaVida = vida - 5;
            if(vida > 0 && vida < 101){
                System.out.println(nome+" tenta desviar do golpe de guitarra de "+oponente+" e infelizmente não consegue :(  ");
                System.out.println("+5 de dano :( Vida atual : "+somaVida);
            }
            else{
                System.out.println("Fim de jogo para"+nome+" :( Parabebéns "+oponente);
            }

        }
        public void receberDanoMagoEspecial(){
            somaVida = vida - 10;
            if(vida > 0 && vida < 101){
                System.out.println(nome+" tenta desviar do golpe de guitarra de "+oponente+" e infelizmente não consegue :(  ");
                System.out.println("+10 de dano :( Vida atual : "+somaVida);
            }
            else{
                System.out.println("Fim de jogo para"+nome+" :( Parabebéns "+oponente);
            }

        }
        public void usarFeitiço(){
            somaForca = forca + 2; 
            somaMana = mana - 5;
            System.out.println(nome+" lança sua mágia negra para atacar"+oponente);
            System.out.println("+2 de força!! Força atual: "+somaForca);
        }
        public void subirDeNivel(){
            if(mana == 75 && forca == 50){
                System.out.println("   Parabéns você subiu de nível!!");
                somaMana = mana + 10;
                somaForca = forca + 3;
                somaVida = vida + 10;
                somaNivel = nivel + 1;
            }
        }
        public void mostrarStatus(){
            System.out.println
            ("Nome: "+nome+" | Classe: Mago | Vida: "+somaVida+" | Força: "+somaForca+" | Mana: "+somaMana);
        }





    }
