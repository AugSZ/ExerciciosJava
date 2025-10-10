import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva as notas do aluno");
        double nota = sc.nextDouble();
        nota += sc.nextDouble();
        nota += sc.nextDouble();
        nota += sc.nextDouble();

        nota = nota/4;


        System.out.println("Escreva a presença do aluno em porcentagem");
        double presenca = sc.nextDouble();

        System.out.printf("A media é: %.2f %s", nota, (presenca>=75) ? "- Aprovado": "- Reprovado");

        sc.close();
    }
}