package Estrutura_de_decisao_e_fluxo_condicional.Lista6;
import java.util.Scanner;

public class vendas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double salario = 20000;

        System.out.println("Quanto esse funcionário vendeu?");
        double valorDeVendas = sc.nextDouble();

        System.out.println("E qual a nota dele?");
        double avaliacao = sc.nextDouble();

         

        if (valorDeVendas>=10000) {
            salario = salario+((salario*7)/100); // comissão se vendeu bastante
        }
        else {
            salario = salario+((salario*5)/100); // comissão se vendeu normal
        }
        
        if (avaliacao >= 8){
            salario = salario+((salario*8)/100);
        }

        System.err.printf("Esse funcionário vai receber %.2f%n", salario);

        sc.close();
    }
}
