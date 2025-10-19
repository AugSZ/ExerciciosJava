package Estrutura_de_decisao_e_fluxo_condicional.Lista6.Exercicio6;
import java.util.Scanner;

public class seno {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double formula;

        formula = ((4*x)*(180-x))/(40500 - x*(180-x));

        System.out.println(formula);

        sc.close();
    }
    
}
