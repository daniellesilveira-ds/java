import java.util.Scanner;
public class Uri1164{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int somadiv;
        int num ;
        int n = teclado.nextInt();;

        for (int cont=1; cont <=n;cont++){
        num = teclado.nextInt();
        somadiv = 0;
            for (int div=1; div < num; div++){
                if (num % div == 0){
                somadiv = (somadiv + div) ;
                }
            }
             if (somadiv == num){
            System.out.println(num+" eh perfeito");
                }
            else {
             System.out.println(num+" nao eh perfeito");   
            }
        }

  

        

    }
}