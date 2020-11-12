import java.util.Scanner;
public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int expo;
        numero = teclado.nextInt();

        for (int cont=1; cont <=numero; cont++){
            if (cont % 2 == 0){
                expo = cont * cont;
            System.out.println(cont+"^2"+" = "+expo);

            }

        }

    }
}