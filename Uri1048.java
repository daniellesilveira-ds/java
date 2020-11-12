import java.util.Scanner;
public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double sal, reaj, ind;
        
        
        sal = teclado.nextDouble();
        
        
        if (  sal >= 0  && sal <= 400.00){
            ind = 0.15;
            reaj = sal * ind;
            sal = sal + reaj;
            System.out.printf("Novo salario: %.2f\n",sal);
            System.out.printf("Reajuste ganho: %.2f\n",reaj);
            System.out.println("Em percentual: 15 %" );
        }
        else if (  sal >= 400.01  && sal <= 800.00){
            ind = 0.12;
            reaj = sal * ind;
            sal = sal + reaj;
            System.out.printf("Novo salario: %.2f\n",sal);
            System.out.printf("Reajuste ganho: %.2f\n",reaj);
            System.out.println("Em percentual: 12 %" );
        }
                
        else if (  sal >= 800.01  && sal <= 1200.00){
            ind = 0.10;
            reaj = sal * ind;
            sal = sal + reaj;
            System.out.printf("Novo salario: %.2f\n",sal);
            System.out.printf("Reajuste ganho: %.2f\n",reaj);
            System.out.println("Em percentual: 10 %" );
        }
         else if (  sal >= 1200.01  && sal <= 2000.00){
            ind = 0.07;
            reaj = sal * ind;
            sal = sal + reaj;
            System.out.printf("Novo salario: %.2f\n",sal);
            System.out.printf("Reajuste ganho: %.2f\n",reaj);
            System.out.println("Em percentual: 7 %" );
        }
           else if (  sal > 2000.00){
            ind = 0.04;
            reaj = sal * ind;
            sal = sal + reaj;
            System.out.printf("Novo salario: %.2f\n",sal);
            System.out.printf("Reajuste ganho: %.2f\n",reaj);
            System.out.println("Em percentual: 4 %" );
        }

         }

     
}