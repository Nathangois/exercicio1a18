import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double altura, homens, mulheres;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual é a altura?");
        altura = teclado.nextDouble();

        homens =  (72.7*altura) - 58;
        mulheres = (62.1*altura) - 44.7;
        System.out.println("O peso ideal para o homens é " + homens);
        System.out.println("O peso ideal para o mulheres é " + mulheres);
    }
}
