// 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

package questoes;

import java.util.Scanner;

public class questao2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = 0;
    int b = 1;
    boolean pertence = false;

    System.out.println("Digite um número: ");
    int x = sc.nextInt();

    while (a <= x) {
      if (x == a) {
        System.out.println("O número " + x + " pertence a sequência de Fibonacci.");
        pertence = true;
        break;
      } else if (a == 0) {
        a = a + 1;
      } else {
        a = a + b;
        b = a - b;
      }
    }

    if (!pertence) {
      System.out.println("O número " + x + " não pertence a sequência de Fibonacci.");
    }

    sc.close();
  }
  
}
