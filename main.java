import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Double number1, number2, number3, number4, soma, media;

    
    Scanner input = new Scanner(System.in);

    
    System.out.println("Entre com a primeira nota: ");
    number1 = input.nextDouble();

    System.out.println("Entre com a segunda nota: ");
    number2 = input.nextDouble();
    
    System.out.println("Entre com a terceira nota: ");
    number3 = input.nextDouble();
    
    System.out.println("Entre com a quarta nota: ");
    number4 = input.nextDouble();

    soma = number1 + number2 + number3 + number4;
    System.out.println("A soma das quatro notas e: " + soma);
    
    media = soma/4;
    System.out.println("A media e: " + media);
    
  }
}