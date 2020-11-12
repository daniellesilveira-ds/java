import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int ini, fim, dur;
        
        ini = teclado.nextInt();
        fim = teclado.nextInt();
        
        dur = fim - ini;
        
        if (dur <= 0 ){
            dur = dur + 24;
        }
        System.out.println("O JOGO DUROU "+dur+" HORA(S)");
         }   
}