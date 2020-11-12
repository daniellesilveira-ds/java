import java.util.Scanner;
public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
          int N, horas, minu, segu, resto;
        N = teclado.nextInt();
         horas = N / 3600;
         resto = N % 3600;
         minu = resto / 60;
         segu = resto % 60;
        System.out.println(horas + ":" + minu + ":" + segu);
    }
}