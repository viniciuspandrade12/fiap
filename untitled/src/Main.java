import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("****CRIE UM PROGRAMA QUE SOLICITA AO USUAIRO A INSERCAO DE DOIS NUMEROS E, EM SEGUIDA, REALIZA AS OPERACOES ARITMETICAS BASICAS (SOMA, SUBTRACAO, MULTIPLICACAO E DIVISAO) COM ESSES NUMEROS. O RESULTADO DEVE SER EXIBIDO NA SAIDA PADRAO****");


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