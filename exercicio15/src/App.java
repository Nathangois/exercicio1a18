import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    double horas;
    double dinheiro;
    double salario;
    double IR;
    double INSS;
    double Sindicato;
    double SalarioLiquido;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Me informe número de horas trabalhas no mês");
    horas = teclado.nextDouble();
    System.out.println("Me informe o valor ganho por hora trabalhada");
    dinheiro = teclado.nextDouble();

    salario = horas * dinheiro;
    IR = salario*0.11;
    INSS = salario*0.08;
    Sindicato = salario*0.05;
    SalarioLiquido = salario - IR - INSS - Sindicato;

    System.out.println("Salário Bruto : R$" + salario);
    System.out.println("IR (11%) : R$" + IR);
    System.out.println("INSS (8%) : R$" + INSS);
    System.out.println("Sindicato (5%) : R$" + Sindicato);
    System.out.println("Salário Liquido : R$" + SalarioLiquido);



  }
}
