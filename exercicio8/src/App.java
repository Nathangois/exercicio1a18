import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    double horas;
    double dinheiro;
    double salario;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Me informe número de horas trabalhas no mês");
    horas = teclado.nextDouble();
    System.out.println("Me informe o valor ganho por hora trabalhada");
    dinheiro = teclado.nextDouble();

    salario = horas * dinheiro;
    
    System.out.println("O valor do salário referido é R$" + salario);
  }
}
