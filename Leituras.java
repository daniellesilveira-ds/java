import java.util.Scanner; //declaro a importação da biblioteca

/*
 exemplo de leitura de dados via teclado
 DETACLE :O scanner utiliza como idioma padrão, o idioma da máquina,
  isso significa , que por exemplo , ao usuário digitar um número real
   (double ou float),o separador de casas é o do idioma padrão do pc
 */
public class Leituras{
    public static void main(String args[]){
        // preciso criar o componente
        Scanner teclado;
        teclado = new Scanner(System.in);
        //cabeçalho padrão
        int valorInteiro;
        float valorReal;
        System.out.println("por favor , digite um numero inteiro:");
        valorInteiro = teclado.nextInt();
        System.out.println("O valor inteiro " + valorInteiro + "foi digitado");
        System.out.println("Agora digite um valor real:");
        valorReal= teclado.nextFloat();
        System.out.println("o valor real digitado vale"+valorReal);
  System.out.printf("o valor com 2 casas decimais: %.2f\n",valorReal);
    }
}