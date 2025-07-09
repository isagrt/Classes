import java.util.Scanner;
import java.util.Locale;

public class Estoque {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os dados do produto: ");
        Produto Produto1 = new Produto();
        System.out.println("Nome: ");
        Produto1.name = scanner.nextLine();
        System.out.println("Preço: ");
        Produto1.price = scanner.nextDouble();
        System.out.println("Quantidade: ");
        Produto1.quantity = scanner.nextInt();

        System.out.println(Produto1.Mensagem());

        System.out.println("Insira o n° de produtos para adicionar no estoque: ");
        Produto1.AdicionarProdutos(scanner.nextInt());

        System.out.println(Produto1.Mensagem());

        System.out.println("Insira o n° de produtos para retirar do estoque: ");
        Produto1.RemoverProdutos (scanner.nextInt());

        System.out.println(Produto1.Mensagem());
        System.out.println("Total em estoque: "+Produto1.ValorTotal());

        scanner.close();

    }
}