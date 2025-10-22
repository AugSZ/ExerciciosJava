package Estrutura_de_repeticao.Exercicios_aula;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um número inteiro não negativo");

        int num = scan.nextInt();
        int soma = 0;
        int digito;
        scan.close();
        for (soma=0; num!=0; soma+=digito){
            digito = num%10;
            num = num/10;
        }

        System.out.println(soma);
    }
}