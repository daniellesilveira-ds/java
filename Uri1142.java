import java.util.Scanner;
public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int numbers;
        int numbers2;
        int numbers3= -1;

        numero = teclado.nextInt();

        for (int cont=1; cont <=numero; cont++){
            numbers = numbers3 +2;
            numbers2 = numbers + 1 ;
            numbers3 = numbers2 + 1 ;
            System.out.println(numbers+" "+numbers2+" "+numbers3+" PUM");
            }

        

    }
}