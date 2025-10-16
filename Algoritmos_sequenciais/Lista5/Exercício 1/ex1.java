import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        // Definir a variável para scannear
       Scanner sc = new Scanner(System.in);

       System.out.print("Digite a temperatura em fahrenheint: ");
       double fahrenheint = sc.nextDouble();

       double celsius = (fahrenheint-32)/1.8;

       System.out.printf("A temperatura em Celsius é: %.2f %n ", celsius);

       sc.close();
    }
}
