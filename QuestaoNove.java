import java.util.Scanner;

public class QuestaoNove {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um número: ");
            vetorA[i] = teclado.nextInt();
        }

        for(int i = 0; i < vetorB.length; i++){
            System.out.println("Digite um número: ");
            vetorB[i] = teclado.nextInt();
        }

        for(int i= 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] / vetorB[i];

        }

        System.out.println("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " \n");
        }

        System.out.println("Vetor B: ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        
        System.out.println("Vetor C: ");
        for(int i = 0; i < vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
    }
}

//9. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a divisão dos respectivos elementos em A e B, ou seja: C[i] = A[i] /(B[i]). 