import java.util.Scanner;
public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
          int N, C100, C50, C20, C10, C5 , C2, C1 ,RESTO;
        N = teclado.nextInt();
         C100 = N / 100;
         RESTO = N % 100;
         C50 = RESTO / 50;
         RESTO = RESTO % 50;
         C20 = RESTO / 20;
         RESTO = RESTO % 20;
         C10 = RESTO / 10;
         RESTO = RESTO % 10;
         C5 = RESTO / 5;
         RESTO = RESTO % 5;
         C2 = RESTO / 2;
         RESTO = RESTO % 2;
         C1 = RESTO / 1 ;
        System.out.println(N);
        System.out.println(C100 + " nota(s) de R$ 100,00");
        System.out.println(C50 + " nota(s) de R$ 50,00");
        System.out.println(C20 + " nota(s) de R$ 20,00");
        System.out.println(C10 + " nota(s) de R$ 10,00");
        System.out.println(C5 + " nota(s) de R$ 5,00");
        System.out.println(C2 + " nota(s) de R$ 2,00");
        System.out.println(C1 + " nota(s) de R$ 1,00");
    }
}