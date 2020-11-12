import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hi, mi, hf, mf, hd, md, dur;
        
        hi = teclado.nextInt();
        mi = teclado.nextInt();
        hf = teclado.nextInt();
        mf = teclado.nextInt();
        
        dur = (hf * 60 + mf) - (hi * 60 + mi);
        
        if (dur <= 0 ){
            dur = dur + (24 * 60);
        }
        hd = dur / 60;
        md = dur % 60;

        System.out.println("O JOGO DUROU "+hd+" HORA(S)"+" E "+md+" MINUTO(S)");
         }   
}