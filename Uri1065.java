import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero;
        float somatoria=0;
        int qtdePares=0;

        for (int cont=1; cont <=5; cont++){
            numero = teclado.nextInt();
            if (numero % 2 == 0){
            //   System.out.println("Voce digitou um numero positivo");
                qtdePares++;
                
            }
        }
System.out.println(qtdePares+" valores pares");

    }
}