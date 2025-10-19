package Estrutura_de_decisao_e_fluxo_condicional.Lista6.Exercicio2;
import java.util.Scanner;

public class triangulos {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os lados do triângulo, na mesma unidade de medida: ");
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();

        if ((lado1+lado2)<lado3 || (lado3+lado1)<lado2 || (lado2+lado3)<lado1){
            System.out.println("Inválido");
            return;
        }

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Triângulo equilátero");
        }
        else if (lado1==lado2 && lado1!= lado3 || lado2==lado3&&lado2!=lado1 || lado3==lado1&&lado3!=lado2){
            System.out.println("Triângulo isóceles");
        }
        else {
            System.out.println("Triângulo escaleno");
        }

        sc.close();
    }
    
}
