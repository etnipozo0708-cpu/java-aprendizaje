import java.util.Scanner;
public class EntradaUsuario {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       System.out.println("Ingresa Tu Nombre: ");
       String nombre = scanner.nextLine();

       System.out.println("Ingresa Tu Edad: ");
        int edad = scanner.nextInt();

     System.out.println("Ingresa tu Estatura en Metros: ");
       double altura = scanner.nextDouble();

        int anioActual = 2026;
        int anioNacimiento = anioActual - edad;
        System.out.println("Hola " + nombre + "," + " Tu edad es: " + edad + ". Tu año de nacimiento es: " + anioNacimiento);
    }
}
