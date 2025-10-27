package Estrutura_de_repeticao.Lista7.Ex1_TrianguloDeFloyd;

import java.util.Scanner;

public class TrianguloDeFloyd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.printf("Digite a quantidade de linhas desejadas: ");
        int n = scan.nextInt();
        int algarismoPrintado = 1;
        int i = 1; 
        int j = 1; 
        int numerosPorLinha = 0; 
        System.out.println();

        while (i<=n) {
            System.out.printf("%d", algarismoPrintado);
            while (0 < j && j <= numerosPorLinha){
                algarismoPrintado++;
                System.out.printf(" %d", algarismoPrintado);
                j --;
            }
            System.out.println();
            numerosPorLinha ++;
            j = numerosPorLinha;
            algarismoPrintado ++;
            i++;

        }


        scan.close();
    }
}
