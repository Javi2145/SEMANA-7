public class TrazaSuma { 

    public static void main(String[] args) { 

        int suma = 0; 

        for (int i = 1; i <= 4; i++) { 

            int antes = suma; 

            suma = suma + i; 

            System.out.println("Iteración " + i + " | i = " + i 

                    + " | antes = " + antes 

                    + " | operación = " + antes + " + " + i 

                    + " | después = " + suma); 

        } 

        System.out.println("Suma final: " + suma); 

    } 

} 