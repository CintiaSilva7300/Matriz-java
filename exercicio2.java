package AtividadesVetoresMatriz;

import java.util.Scanner;

public class exercicio2 {

		public static void main(String[] args) {
	        int numParticipantes = 10;
	        int numBimestres = 4;

	        double[][] notas = new double[numParticipantes][numBimestres];

	        // Criar vetor para armazenar as médias dos participantes
	        double[] medias = new double[numParticipantes];

	        Scanner scanner = new Scanner(System.in);

	        // Ler as notas
	        for (int i = 0; i < numParticipantes; i++) {
	            System.out.println("Digite as notas do participante " + (i + 1) + ":");
	            for (int j = 0; j < numBimestres; j++) {
	                System.out.print("Nota do bimestre " + (j + 1) + ": ");
	                notas[i][j] = scanner.nextDouble();
	            }
	        }

	        // Calcular as médias dos participantes
	        for (int i = 0; i < numParticipantes; i++) {
	            double soma = 0;
	            for (int j = 0; j < numBimestres; j++) {
	                soma += notas[i][j];
	            }
	            medias[i] = soma / numBimestres;
	        }

	        // Exibir as médias dos participantes
	        System.out.println("\nMédias dos participantes:");
	        for (int i = 0; i < numParticipantes; i++) {
	            System.out.println("Participante " + (i + 1) + ": " + medias[i]);
	        }
	    }

	}


