import java.util.Scanner;

public class Atvdd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1=sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2=sc.nextInt();

        double soma=n1+n2;
        double mediaAritmetica=soma/2;

        System.out.println("Soma: "+soma);
        System.out.println("Média Aritmética: "+mediaAritmetica);
        sc.close();
    }
}
