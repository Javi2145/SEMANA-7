import java.util.Scanner; 

public class ValidacionEdad { 

    public static void main(String[] args) { 

        Scanner teclado = new Scanner(System.in); 

        int edad; 

        while (true) { 

            System.out.print("Edad: "); 

            if (teclado.hasNextInt()) { 

                edad = teclado.nextInt(); 

                if (edad >= 0 && edad <= 120) { 

                    break; 

                } 

                System.out.println("Fuera de rango"); 

            } else { 

                System.out.println("Debe ingresar un entero"); 

                teclado.next(); 

            } 

        } 

        System.out.println("Edad aceptada: " + edad); 

        teclado.close(); 

    } 

} 