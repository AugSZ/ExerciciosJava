import java.util.Scanner;

public class caixas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura");
        double altura = sc.nextDouble();

        System.out.println("Digite a largura");
        double largura = sc.nextDouble();

        System.out.println("Digite o comprimento");
        double comprimento = sc.nextDouble();

        Double area = (largura*comprimento + comprimento*altura + altura*largura)*2.0;

        System.out.println("A área é:" + area);

    }


}