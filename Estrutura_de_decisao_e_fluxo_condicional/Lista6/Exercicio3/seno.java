package Estrutura_de_decisao_e_fluxo_condicional.Lista6.Exercicio3;
import java.util.Scanner;

public class seno {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        double angulo = scan.nextDouble();
        double aproximado;
        double exato;
        double PI = Math.PI;

        if (angulo<0 || angulo > 180) {
            System.out.printf("Valor inválido. Fechando programa %n");
            scan.close();
            return;
        }
        aproximado = ((4*angulo)*(180-angulo))/(40500 - angulo*(180-angulo));
        angulo = (angulo*PI/180);
        exato = Math.sin(angulo);

        System.out.printf("> %.4f %n", aproximado);
        System.out.printf("> %.4f %n", exato);


       scan.close();
    }
    
}
