import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //unidade de medida
    double medida;
    double resultado;

    //pergunta
    Scanner teclado = new Scanner(System.in);
    System.out.println("Me informe o metro");
    medida = teclado.nextDouble();
    
    resultado = medida * 100;
    
    //resposta
    System.out.println("O valor em centimentos é " + resultado +"cm");
  }
}
