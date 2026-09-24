import java.util.Scanner;
public class Bucles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 100; i++) {
    System.out.println(i);
    5}        
    int suma = 0;
    int numero = 0;
    while (numero >=0) {
        System.out.print("Ingrese un numero (Negativo para salir): " );
        numero = scanner.nextInt();
        if (numero >= 0); {
        suma = suma + numero;
        }
    }
    System.out.println("La suma total es: " + suma );
        
        scanner.close();
    }
}
