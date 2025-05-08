import java.util.Scanner;

public class QuestaoDoze {
    public static void main(String[] args) {
        int[] vetorA = new int[10];

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Digite um número: ");
            vetorA[i] = teclado.nextInt();
        }

        int soma = 0;
        for(int i = 0; i < vetorA.length; i++){
            soma = soma + vetorA[i];
        }

        System.out.print("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.print("A soma dos elementos é: " + soma);
    }
    
}

//12.Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma de todos os elementos armazenados neste vetor. 