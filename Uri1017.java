import java.util.Scanner;
public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
          int A,B;
          double LITROS;
        A = teclado.nextInt();
        B = teclado.nextInt();
         LITROS = ((A * B) / 12.0) ;
        System.out.printf("%.3f\n",LITROS);
    }
}