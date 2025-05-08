import java.util.Scanner;

public class QuestaoUm{
    public static void main(String[] args) {
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        Scanner teclado = new Scanner (System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.print("\nDigite um número: ");
            vetorA[i] = teclado.nextInt();
            vetorB[i] = vetorA[i];
        }

        System.out.print("Vetor A: ");
        for(int i = 0; i <  vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("Vetor B: ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}