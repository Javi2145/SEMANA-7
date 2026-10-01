import java.util.Scanner; 

public class CasosLimite { 

    public static void main(String[] args) { 

        Scanner teclado = new Scanner(System.in); 

        System.out.print("Ingrese la edad: "); 

        if (teclado.hasNextInt()) { 

            int edad = teclado.nextInt(); 

            if (edad < 0 || edad > 120) { 

                System.out.println("inválido"); 

            } else if (edad >= 18) { 

                System.out.println("mayor"); 

            } else { 

                System.out.println("menor"); 

            } 

        } else { 

            System.out.println("tipo incorrecto"); 

        } 

        teclado.close(); 

    } 

} 