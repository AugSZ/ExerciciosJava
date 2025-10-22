
import java.util.Scanner;

public class numeroExtenso {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número de 0 a 99");
        int numero = scan.nextInt();

        int dezena = numero/10;
        int unidade = numero%10;

        
        switch (dezena){
            case 0 -> {
            }
            case 1 -> {
                if (dezena==1 && unidade==1) {
                    System.out.printf("Onze");
                }
                else if (dezena==1 && unidade==2) {
                    System.out.printf("Doze ");
                }
                else if (dezena==1 && unidade==3) {
                    System.out.printf("Treze ");
                }
                else if (dezena==1 && unidade==4) {
                    System.out.printf("Catorze ");
                }
                else if (dezena==1 && unidade==5) {
                    System.out.printf("Quinze");
                }
                else {
                    System.out.printf("Dez");
                }
            }
            case 2 -> {
                System.out.printf("Vinte");
            }
            case 3 -> {
                System.out.printf("Trinta");
            }
            case 4 -> {
                System.out.printf("Quarenta");
            }
            case 5 -> {
                System.out.printf("Cinquenta");
            }
            case 6 -> {
                System.out.printf("Sessenta");
            }
            case 7 -> {
                System.out.printf("Setenta");
            }
            case 8 -> {
                System.out.printf("Oitenta");
            }
            case 9 -> {
                System.out.printf("Noventa");
            }
        }

        if (dezena==0) {
        switch (unidade) {
            case 0 -> {

            }
            case 1 -> {
                System.out.printf("Um");
            }
            case 2 -> {
                System.out.printf("Dois");
            }
            case 3 -> {
                System.out.printf("Três");
            }
            case 4 -> {
                System.out.printf("Quatro");
            }
            case 5 -> {
                System.out.printf("Cinco");
            }
            case 6 -> {
                System.out.printf("Seis");
            }
            case 7 -> {
                System.out.printf("Sete");
            }
            case 8 -> {
                System.out.printf("Oito");
            }
            case 9 -> {
                System.out.printf("Nove");
            }
        }
        }
        else if (dezena==1) {
        switch (unidade){
            case 6 -> {
                System.out.printf("esseis");
            }
            case 7 -> {
                System.out.printf("essete");
            }
            case 8 -> {
                System.out.printf("oito");
            }
            case 9 -> {
                System.out.printf("enove");
            }
        }
        }
        else {
        switch (unidade){
            case 1 -> {
                System.out.printf(" e um");
            }
            case 2 -> {
                System.out.printf(" e dois");
            }
            case 3 -> {
                System.out.printf(" e três");
            }
            case 4 -> {
                System.out.printf(" e quatro");
            }
            case 5 -> {
                System.out.printf(" e cinco");
            }
            case 6 -> {
                System.out.printf(" e seis");
            }
            case 7 -> {
                System.out.printf(" e sete");
            }
            case 8 -> {
                System.out.printf(" e oito");
            }
            case 9 -> {
                System.out.printf(" e nove");
            }
        }
        }
        System.out.println();
        scan.close();
    }
}