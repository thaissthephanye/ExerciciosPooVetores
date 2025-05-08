import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um número: ");
            vetorA[i] = teclado.nextInt();
            vetorB[i] = vetorA[i] * i;
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

//5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i] * i. 