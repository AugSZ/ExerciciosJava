import java.util.Scanner;

public class moedas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos reais você tem em moedas?");
        double centavos = sc.nextDouble();
        double quantidadeMoeda;

        /* Temos moedas de:
        * 50
        * 25
        * 10
        * 5
        * 1
        */
        
        // 50 centavos
        quantidadeMoeda = (centavos-(centavos%50))/50;
        centavos %= 50;
        System.out.printf("50 centavos: %.0f%n", quantidadeMoeda);

        //25
        quantidadeMoeda = (centavos-(centavos%25))/25;
        centavos %= 25;
        System.out.printf("25 centavos: %.0f%n", quantidadeMoeda);

        //10
        quantidadeMoeda = (centavos-(centavos%10))/10;
        centavos %= 10;
        System.out.printf("10 centavos: %.0f%n", quantidadeMoeda);

        //5
        quantidadeMoeda = (centavos-(centavos%25))/5;
        centavos %= 5;
        System.out.printf("5 centavos: %.0f%n", quantidadeMoeda);

        //1 centavo
        quantidadeMoeda = (centavos-(centavos%1))/1;
        centavos %= 1;
        System.out.printf("1 centavo: %.0f%n", quantidadeMoeda);

        sc.close();
        
    }
}
