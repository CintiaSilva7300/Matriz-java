package AtividadesVetoresMatriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
        int[] vetor = {5, 12, 7, 23, 8, 15, 4, 17, 10, 2};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int entrada = scanner.nextInt();

        int posicao = pesquisarNumero(vetor, entrada);

        if (posicao != -1) {
            System.out.println("O número " + entrada + " foi encontrado na posição " + posicao + " do vetor.");
        } else {
            System.out.println("Não foi encontrado o numero: " + entrada);
        }
    }

    //  pesquisar um número no vetor
    private static int pesquisarNumero(int[] vetor, int numero) {
        for (int indice = 0; indice < vetor.length; indice++) {
            if (vetor[indice] == numero) {
                return indice; // Retorna a posição do número se for encontrado
            }
        }
        return -1;  // Retorna -1 se o número não for encontrado
    }
}
