public class Produto {
    String name;
    double price; 
    int quantity;

    public String Mensagem(){
        String atualizado = ("Nome: "+name+" R$: "+price+" Quantidade em estoque: "+quantity+" Total: "+(price*quantity));
        return atualizado;
    }

    public double ValorTotal(){
        return price * quantity;

    }
    public void AdicionarProdutos( int qtd){
        quantity += qtd;
    }

    public void RemoverProdutos(int qtd){
        quantity -= qtd;
    }
}