import java.util.Scanner;

public class Atvdd1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1=sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2=sc.nextInt();

        int soma=n1+n2;
        int sub=n1-n2;
        int mult=n1*n2;
        int div=n1/n2;

        System.out.println("Soma: "+soma);
        System.out.println("Subtração: "+sub);
        System.out.println("Multiplicação: "+mult);
        System.out.println("Divisão: "+div);
        sc.close();
    }
}
