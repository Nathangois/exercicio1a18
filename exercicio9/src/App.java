import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    double Fahrenheit;
    double Celsius;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Me informe o valor é Fahrenheit para converter é Celsius");
    Fahrenheit= teclado.nextDouble();

    Celsius= 5*((Fahrenheit-32)/9);
    System.out.println("O valor em Celsius é " + Celsius);
  }
}
