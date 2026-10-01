import java.util.Scanner; 

public class ValidacionNotas { 

    public static void main(String[] args) { 

        Scanner teclado = new Scanner(System.in); 

        double suma = 0; 

        int aprobados = 0; 

        int reprobados = 0; 

        for (int i = 1; i <= 5; i++) { 

            double nota; 

            do { 

                System.out.print("Nota " + i + " (0 a 10): "); 

                nota = teclado.nextDouble(); 

                if (nota < 0 || nota > 10) { 

                    System.out.println("Nota inválida. Intente de nuevo."); 

                } 

            } while (nota < 0 || nota > 10); 

            suma += nota; 

            if (nota >= 7) { 

                aprobados++; 

            } else { 

                reprobados++; 

            } 

        } 

        System.out.println("Promedio: " + suma / 5); 

        System.out.println("Aprobados: " + aprobados); 

        System.out.println("Reprobados: " + reprobados); 

        teclado.close(); 

    } 

} 