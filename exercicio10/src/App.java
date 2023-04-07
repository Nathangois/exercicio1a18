import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    double Fahrenheit;
    double Celsius;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Me informe o valor é Celsius para converter é Fahrenheit");
    Celsius= teclado.nextDouble();

    Fahrenheit = (Celsius-32)/1.8;
    System.out.println("O valor em Fahrenheit é " + Fahrenheit);
  }
}
