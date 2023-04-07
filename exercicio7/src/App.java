import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //unidade de medida
    double medida;
    double area;

    //pergunta
    Scanner teclado = new Scanner(System.in);

    System.out.println("Me informe a medida do lado do quadrado");
    medida = teclado.nextDouble();

    area = (medida * medida) * 2;
    
    //resposta
    System.out.println("O valor da area é " + area);
  }
}
