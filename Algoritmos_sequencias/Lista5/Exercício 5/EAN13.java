import java.util.Scanner;

public class EAN13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite a primeira parte de um dígito do código de barras: ");
        int primeiro = scan.nextInt();
        System.out.printf("Digite a segunda parte: ");
        int segundaParte = scan.nextInt();
        int segundo = (segundaParte%1000000)/100000;
        int terceiro = (segundaParte%100000)/10000;
        int quarto = (segundaParte%10000)/1000;
        int quinto= (segundaParte%1000)/100;
        int sexto= (segundaParte%100)/10;
        int setimo= segundaParte%10;
        System.out.printf("Escreva a terceira parte: ");
        int terceiraParte = scan.nextInt();
        int oitavo = (terceiraParte%100000)/10000;
        int nono = (terceiraParte%10000)/1000;
        int decimo = (terceiraParte%1000)/100;
        int decimoPrimeiro = (terceiraParte%100)/10;
        int decimoSegundo = (terceiraParte%10);
        
        int verificador;
        
        segundaParte = primeiro+terceiro+quinto+setimo+nono+decimoPrimeiro;
        System.out.println(segundaParte);
        terceiraParte = segundo+quarto+sexto+oitavo+decimo+decimoSegundo;
        System.out.println(terceiraParte);
        verificador = terceiraParte*3+segundaParte;
        System.out.println(verificador);
        verificador -= 1;
        System.out.println(verificador);
        verificador %= 10;
        System.out.println(verificador);
        verificador = 9-verificador;
        
        System.out.println("O dígito verificador é " + verificador );
        scan.close();
    }
}