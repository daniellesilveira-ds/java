import java.util.Scanner;
public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero1;
        int numero;

        numero1 = teclado.nextInt();

        for (int cont=1; cont <=numero1; cont++){
            numero = teclado.nextInt();
            if (numero % 2 == 0 && numero > 0){
            System.out.println("EVEN POSITIVE");
            }
            else if (numero % 2 == 0 && numero < 0) {
            System.out.println("EVEN NEGATIVE");
            }
            if (numero % 2 != 0 && numero > 0){
            System.out.println("ODD POSITIVE");
            }
            else if (numero % 2 != 0 && numero < 0) {
            System.out.println("ODD NEGATIVE");
            }
            else if (numero == 0){
            System.out.println("NULL");    
            }

        }

    }
}