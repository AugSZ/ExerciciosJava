package Estrutura_de_decisao_e_fluxo_condicional.Exercicios_aula;
import java.util.Scanner;

public class imc {
public static  void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escreva seu peso e altura");
    double peso = sc.nextDouble();
    double altura = sc.nextDouble();
    
    if (altura < 0) {                           //
        System.out.println("Não existe");     // 
        sc.close();
        return;                                 //
    }                                           //
    if (peso < 0) {                             //
        System.out.println("Não existe");     // acaba se for negativo
        sc.close();
        return;                                 //
    }

    double indiceDeMassa = peso/(altura*altura);  // Cálculo do imc
    
System.out.println(indiceDeMassa);

    if (indiceDeMassa < 18.5) {
        System.out.printf("Seu IMC é %.2f Abaixo do peso. Por favor se cuide", indiceDeMassa);
    }
    else if (indiceDeMassa >= 18.5 && indiceDeMassa <= 24.9) {
        System.out.printf("Seu IMC é %.2f Peso ok (normal não é um bom termo)", indiceDeMassa);
    }

    else if (indiceDeMassa >= 24.5) {
        System.out.printf("Seu IMC é %.2f, Obesidade. Por favor se cuide", indiceDeMassa);
    }
    }
}