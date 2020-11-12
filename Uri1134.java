import java.util.Scanner;
public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x = 0;
        int arco = 0;
        int gaso = 0;
        int diesel = 0;
        
     while  ( x != 4) {
       x = teclado.nextInt();

        if (x == 1){
            arco = arco + 1;
        }
        else if (x == 2){
            gaso = gaso + 1;
        }
        else if (x == 3){
            diesel = diesel + 1;
        }
     }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+arco);
        System.out.println("Gasolina: "+gaso);
        System.out.println("Diesel: "+diesel); 
         
         }   
}