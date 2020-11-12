import java.util.Scanner;
public class Uri1144{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int numbers;
        int numbers2;
        int numbers3;

        numero = teclado.nextInt();
        

        for (int cont=1; cont <=numero; cont++){
            numbers = cont;
            numbers2 = numbers * numbers ;
            numbers3 = numbers2 * cont ;
            System.out.println(numbers+" "+numbers2+" "+numbers3);
            System.out.println(numbers+" "+(numbers2+1)+" "+(numbers3+1));
            }

        

    }
}