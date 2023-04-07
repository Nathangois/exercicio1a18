import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double download, velocidade, tempo;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual o tamanho do arquivo para download (em MB)?");
    download = teclado.nextDouble();
    System.out.println("Qual a velocidade do link de Internet (em Mbps)?");
    velocidade = teclado.nextDouble();
    
    
    tempo = ((download / velocidade) * 60);
    System.out.println("tempo aproximado de download do arquivo usando este link (em minutos) é "+ tempo);
    

  }
}
