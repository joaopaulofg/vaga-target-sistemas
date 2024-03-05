// 5) Escreva um programa que inverta os caracteres de um string.

// IMPORTANTE:

// a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

// b) Evite usar funções prontas, como, por exemplo, reverse;

package questoes;

import java.util.Scanner;

public class questao5 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String str = "";

    System.out.println("Deseja inserir uma palavra ou frase? Se não utilizarei a frase 'Hello, World!' (S/N)");
    String resposta = sc.nextLine().toLowerCase();

    if (resposta.equals("s")) {
      System.out.println("Digite a palavra ou frase: ");
      str = sc.nextLine();
    } else {
      str = "Hello, World!";
    }

    String invertida = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      invertida += str.charAt(i);
    }

    System.out.println("A palavra/frase invertida é: " + invertida);
    
    sc.close();
  }
}