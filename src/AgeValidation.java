//Se importa la libreria Scanner 
import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        //Se crea el objeto scanner
        Scanner scanner = new Scanner(System.in);
        //Inicializamos la constante AGE_LIMIT 
        final int AGE_LIMIT = 18; 
        //Se pide al usuario ingresar edad por teclado
        System.out.println("Ingrese su edda: ");
        int age = scanner.nextInt();
        
        if (age >= AGE_LIMIT) {
            System.out.println("Access granted");
        }else{
            System.out.println("Access denied");
        }    
    }
}
