import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numeroprimeiro;
        int numerosegundo;
        int soma;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        numeroprimeiro = teclado.nextInt();
        System.out.println("Informe o segundo número");
        numerosegundo = teclado.nextInt();
        soma = numeroprimeiro+numerosegundo;
        System.out.println("resultado é "+soma);
    }
}
