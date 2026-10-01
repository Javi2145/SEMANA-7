import java.util.Scanner; 

public class ContadoresAcumuladores { 

    public static void main(String[] args) { 

        Scanner teclado = new Scanner(System.in); 

        int aprobados = 0; 

        double suma = 0; 

        for (int i = 1; i <= 5; i++) { 

            System.out.print("Ingrese la nota " + i + ": "); 

            double nota = teclado.nextDouble(); 

            suma += nota; 

            if (nota >= 7) { 

                aprobados++; 

            } 

        } 

        System.out.println("Suma de notas: " + suma); 

        System.out.println("Aprobados: " + aprobados); 

        teclado.close(); 

    } 

} 