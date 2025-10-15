import java.util.Scanner;

public class bissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano AD");
        int ano = sc.nextInt();
        boolean serOuNaoSer;
        String resposta;
        
        serOuNaoSer = (ano%4==0) ? true : false;
        serOuNaoSer = (serOuNaoSer==true && ano%100==0 && ano%400==0) ? true : false;
        resposta = (serOuNaoSer==true) ? "Seu ano é bissexto": "Seu ano não é bissexto";
        System.out.println(resposta);

        /*
        * apenas para entender em ternário
        *if (ano%4==0 && ano%100!=0) {
        *    System.out.println("Seu ano é um ano bissexto");
        *}
        *else if (ano%100==0 && ano%400==0){
        *    System.out.println("Seu ano é um ano bissexto");
        *}
        *else {
        *    System.out.println("Seu ano é um ano normal");
        *}
        */

        sc.close();

    }
    
}
