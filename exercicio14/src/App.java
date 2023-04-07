import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    double peso, excesso, multa;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Qual o peso de peixe pescado pelo o João?");
    peso = teclado.nextDouble();


    excesso = peso-50;
    multa = excesso*4;
    
    System.out.println("O excesso do limite é " + excesso + "Kg");
    System.out.println("O valor da multa é R$" + multa);

  }
}
