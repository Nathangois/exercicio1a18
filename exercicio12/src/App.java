import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double altura, peso;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual é a sua altura?");
        altura = teclado.nextDouble();
        peso = (72.7*altura) - 58;
        System.out.println("O seu peso ideal é " + peso);
    }
}
