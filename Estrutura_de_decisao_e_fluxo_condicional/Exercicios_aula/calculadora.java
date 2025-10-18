package Estrutura_de_decisao_e_fluxo_condicional.Exercicios_aula;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int valorA = sc.nextInt();
        char operador = sc.next().charAt(0); //  .charAt(0) para ler um char .next() uma String
        int valorB = sc.nextInt();
        double resultado;
    
        switch (operador) {
            case '+' -> {
                resultado = valorA + valorB;
            }
            case '-' -> {
                resultado = valorA - valorB;
            }
            case '*' -> {
                resultado = valorA * valorB;
            }
            case '/' -> {
                resultado = valorA / valorB;
            }
            default -> {
                resultado = 0;
                sc.close();
                return;
            }
        }
        sc.close();
        System.out.printf("Resultado: %.2f%n", resultado);
        
    }
}
