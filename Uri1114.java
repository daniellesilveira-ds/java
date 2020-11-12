import java.util.Scanner;
public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int senha = 2002;
        int imputSenha = 0;


        while ( imputSenha != senha) {
         imputSenha = teclado.nextInt();
         if ( imputSenha != senha){
            System.out.println("Senha Invalida");
         }
        } 

        System.out.println("Acesso Permitido");


    }
}