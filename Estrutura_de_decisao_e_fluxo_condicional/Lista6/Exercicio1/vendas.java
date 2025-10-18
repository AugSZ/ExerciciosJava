import java.util.Scanner;

public class vendas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double salario = 2000;

        System.out.println("Quanto esse funcionário vendeu?");
        double valorDeVendas = sc.nextDouble();

        System.out.println("E qual a nota dele?");
        double avaliacao = sc.nextDouble();

         

        if (valorDeVendas>=10000) {
            salario = salario+((valorDeVendas*7)/100); // comissão se vendeu bastante
        }
        else {
            salario = salario+((valorDeVendas*5)/100); // comissão se vendeu normal
        }
        
        if (avaliacao >= 8){
            salario = salario+500;
        }

        System.err.printf("Esse funcionário vai receber %.2f%n", salario);

        sc.close();
    }
}
