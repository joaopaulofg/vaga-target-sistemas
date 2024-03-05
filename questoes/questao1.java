// 1) Observe o trecho de código abaixo:
// int INDICE = 13, SOMA = 0, K = 0;
// enquanto K < INDICE faça

// {
// K = K + 1;
// SOMA = SOMA + K;
// }

// imprimir(SOMA);

// RESPOSTA: SOMA = 91

package questoes;

public class questao1 {
    public static void main(String[] args) {

      int INDICE = 13, SOMA = 0, K = 0;

      while (K < INDICE) {
        K = K + 1;
        SOMA = SOMA + K;
      }

      System.out.println(SOMA);

    }
}
