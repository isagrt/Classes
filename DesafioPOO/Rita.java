public class Rita extends PersonagemPOO {
    public void ritaCorpo() {

        System.out.println(
                "                :&:\n" +
                        "        /\\_/\\    #\n" +
                        "     »( o.o )« #\n" +
                        "        > - < O _#_\n" +
                        "       (     )O( # )\n" +
                        "        \\ | /O / O \\\n" +
                        "         O O  ( === )\n" +
                        "               `---'\n");
    }

    @Override
    public void ataque() {
        forca += 2;
        System.out.println(nome + " ataca " + oponente + " sem do nenhuma!!");
        System.out.println("+1 de forca!! Forca atual : " + forca);
    }

    @Override
    public void receberDano(int dano) {
        vida -= dano;
        if (vida > 0) {
            System.out.println(nome + " tenta desviar do golpe de " + oponente + " e infelizmente não consegue :(  ");
            System.out.println("+5 de dano :( Vida atual : " + vida);
        } else {
            System.out.println("Fim de jogo para" + nome + " :( Parabens " + oponente);
        }
    }

    @Override
    public void receberDanoEspecial(int dano) {
        vida -= dano;
        if (vida > 0) {
            System.out.println(nome + " tenta desviar do golpe de " + oponente + " e infelizmente não consegue :(  ");
            System.out.println("+10 de dano :( Vida atual : " + vida);
        } else {
            System.out.println("Fim de jogo para" + nome + " :( Parabens " + oponente);
        }
    }

    @Override
    public void usarHabilidade() {
        forca += 4;
        System.out.println(nome + " utiliza sua guitarra para atacar " + oponente);
        System.out.println("+2 de forca!! Forca atual: " + forca);

    }
}
