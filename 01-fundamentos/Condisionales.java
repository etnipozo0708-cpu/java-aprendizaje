import java.util.Scanner;
public class Condisionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Ingrese su Edad: ");
         int edad = scanner.nextInt();

         if (edad>=18) {
            System.out.println("Eres Mayor de Edad"); 
         }
         else {
            System.out.println("Eres Menor de Edad");
         }
         scanner.close();
    }

}
