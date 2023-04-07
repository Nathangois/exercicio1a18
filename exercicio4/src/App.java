import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double soma;
    double media;

    Scanner teclado = new Scanner(System.in);

    System.out.println("nota1");
    nota1 = teclado.nextDouble();

    System.out.println("nota2");
    nota2 = teclado.nextDouble();

    System.out.println("nota3");
    nota3 = teclado.nextDouble();

    System.out.println("nota4");
    nota4 = teclado.nextDouble();

    soma = nota1+nota2+nota3+nota4;
    media = soma/4;
    System.out.println(media);
    
  }
}
