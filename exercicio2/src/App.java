import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o número");
        numero = teclado.nextInt();
        System.out.println(numero);
    }
}
