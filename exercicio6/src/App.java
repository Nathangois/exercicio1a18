import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //unidade de medida
    double raio;
    double area;

    //pergunta
    Scanner teclado = new Scanner(System.in);
    System.out.println("Me informe o raio de um circulo");
    raio = teclado.nextDouble();
    area = 2 * (Math.PI) * raio;
    
    //resposta
    System.out.println(area);
  }
}
