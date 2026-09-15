public class Operadores {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;

        double c = 15.0; 
        double d = 4.0;

        System.out.println("Operaciones Basicas entre A y B");
        System.out.println("suma: " + (a + b));
        System.out.println("resta: " + (a - b));
        System.out.println("división: " + (a / b));
        System.out.println("multiplicacicón: " + (a * b));
        System.out.println("módulo: " + (a % b));
        System.out.println(" ");

        System.out.println("Operaciones Basicas entre C y D");
        System.out.println("Division: " + (c / d));
        System.out.println(" ");
        
        System.out.println("Contador");
        int contador = 10;
        contador += 5;
       System.out.println("Valor después de sumar: " + contador);  
       contador -= 3;
       System.out.println("Valor despues de restar: " + contador);
       contador *= 2;
       System.out.println("Valor despues de multiplicar: " + contador);
       System.out.println(" ");

       System.out.println("Operadores de comparación");
       System.out.println("¿15 es mayor que 4?: " + (a > b));
       System.out.println("¿15 es igual a 4?: " + (a == b));
       System.out.println("¿15 es distinto de 4?: " + (a != b));
       System.out.println(" ");

       System.out.println("Operadores Logicos");
       boolean esMayor = true;
       boolean tieneDinero = false; 
       System.out.println("¿Es mayor Y tiene dinero?: " + (esMayor && tieneDinero));
       System.out.println("Es mayor O tiene dinero?: " + (esMayor || tieneDinero));

    }
    
}
