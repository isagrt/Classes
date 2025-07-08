import java.util.Scanner;
import java.util.Locale;

public class Estoque {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        Produto Produto1 = new Produto();
        System.out.println("Nome: ");
        Produto1.name = scanner.nextLine();
        System.out.println("Preço: ");
        Produto1.price = scanner.nextDouble();
        System.out.println("Quantidade: ");
        Produto1.quantity = scanner.nextInt();

    }
}