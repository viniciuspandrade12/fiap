import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("****Crie um programa que solicita ao usuário a insercao de dois numeros e, em seguida, realiza as operacoes aritmeticas basicas (soma, subtracao, multiplicacao e divisao) com esses numeros. Oresultado deve ser exibido na saída padrao****");


        System.out.println("Insira um numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Insira outro numero: ");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + soma);
        System.out.println(num1 + " - " + num2 + " = " + subtracao);
        System.out.println(num1 + " * " + num2 + " = " + multiplicacao);
        System.out.println(num1 + " / " + num2 + " = " + divisao);
    }
}