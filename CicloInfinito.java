public class CicloInfinito { 

    public static void main(String[] args) { 

        int i = 1; 

        while (i <= 10) { 

            System.out.println(i); 

            i++;   // actualización: evita el ciclo infinito 

        } 

    } 

} 