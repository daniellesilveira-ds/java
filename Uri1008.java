import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
          int NUMBER,B;
          double C,SALARY;
        NUMBER = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextDouble();
        SALARY  = (B * C) ;
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f\n",SALARY);
    }
}