package Estrutura_de_decisao_e_fluxo_condicional.Lista6.Exercicio4;
import java.util.Scanner;

public class ValorDaComissao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o quanto foi vendido pelo funcionário");
        double valorVenda = scan.nextDouble();
        double comissao = 0;

        if (valorVenda<2500) {
            comissao = (1.17/100)*valorVenda + 30;
            comissao = (comissao<39) ? 39 : comissao;
        }
        else if (valorVenda>=2500 && valorVenda<=6250) {
            comissao = 56 + (0.66/100)*valorVenda;
        }
        else if (valorVenda>6250 && valorVenda<=20000){
            comissao = 76 + (0.34/100)*valorVenda;
        }
        else if (valorVenda>20000 && valorVenda<=50000){
            comissao = 100 + (0.22/100)*valorVenda;
        }
        else if (valorVenda>50000 && valorVenda<=500000){
            comissao = 155 + (0.11/100)*valorVenda;
        }
        else  if (valorVenda<500000){
            comissao = 255 + (0.09/100)*valorVenda;
        }

        System.out.printf("O funcionário deve receber uma comissão de: %.2f %n", comissao);

        scan.close();
    }
    
}