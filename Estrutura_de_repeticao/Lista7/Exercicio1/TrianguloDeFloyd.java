package Estrutura_de_repeticao.Lista7.Exercicio1;

import java.util.Scanner;

public class TrianguloDeFloyd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.printf("Digite a quantidade de linhas desejadas");
        int n = scan.nextInt();
        int numero = 1;
        int i = 1;
        int j = 1;
        int quantidade = 1;

        while (i<=n) {
            System.out.printf("", numero);
            numero++;
            while (j<quantidade){
                numero++;
                System.out.printf("", numero);
            }
            quantidade++;
            i++;
        }


        scan.close();
    }
}
