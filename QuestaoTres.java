import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um número: ");
            vetorA[i] = teclado.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        System.out.println("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("Vetor B: ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}
