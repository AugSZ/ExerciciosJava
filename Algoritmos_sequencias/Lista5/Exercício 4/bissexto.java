import java.util.Scanner;

public class bissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano AD");
        int ano = sc.nextInt();
        String eBissexto;
        
        eBissexto = (ano%4==0) ? (ano%100==0 && ano%400==0) ? "Seu ano é bissexto" : "Seu ano não é bissexto" : "Seu ano não é bissexto";

        System.out.println(eBissexto);
        sc.close();

    }
    
}
