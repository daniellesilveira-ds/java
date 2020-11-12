import java.util.Scanner;
public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int qtdImpar=0;
        int qtdPares=0;
        int qtdPositivo=0;
        int qtdNegativo=0;

        for (int cont=1; cont <=5; cont++){
            numero = teclado.nextInt();
            if (numero % 2 == 0){
            //   System.out.println("Voce digitou um numero positivo");
                qtdPares++; 
            }
            else  {
                qtdImpar++;
            }
            if (numero > 0){
                qtdPositivo++;
            }
            else if(numero < 0) {

                    qtdNegativo++;
            }
        }
System.out.println(qtdPares+" valor(es) par(es)");
System.out.println(qtdImpar+" valor(es) impar(es)");
System.out.println(qtdPositivo+" valor(es) positivo(s)");
System.out.println(qtdNegativo+" valor(es) negativo(s)");

    }
}