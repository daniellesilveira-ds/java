import java.util.Scanner;
public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
          int A,B,N1,N2;
          double P1,P2,SAIDA;
        A = teclado.nextInt();
        N1 = teclado.nextInt();
        P1 = teclado.nextDouble();
        B = teclado.nextInt();
        N2 = teclado.nextInt();
        P2 = teclado.nextDouble();
        SAIDA  = ((N1 * P1) + (N2 * P2)) ;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",SAIDA);
    }
}