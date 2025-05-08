import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        int[] vetorA = new int[8];
        int[] vetorB = new int[8];

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um número: ");
            vetorA[i] = teclado.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }

        System.out.println("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " \n");
        }

        System.out.println("Vetor B: ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}
