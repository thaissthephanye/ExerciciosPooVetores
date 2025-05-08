import java.util.Scanner;

public class QuestaoOnze {
    public static void main(String[] args) {
        int[] vetorA = new int[10];

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um número: ");
            vetorA[i] = teclado.nextInt();
        }

        int quantPares = 0;
        for(int i = 0; i < vetorA.length; i++){
            if(vetorA[i] % 2 == 0){
                quantPares++;
            }
        }

        System.out.print("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.print("Quantidade de elementos pares: " + quantPares);
    }
    
}

//11.Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de elementos armazenados neste vetor que são pares. 