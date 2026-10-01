import java.util.Scanner; 

public class CafeteriaUniversitaria { 

    static int leerEntero(Scanner teclado, String mensaje, int min, int max) { 

        while (true) { 

            System.out.print(mensaje); 

            if (teclado.hasNextInt()) { 

                int valor = teclado.nextInt(); 

                teclado.nextLine(); 

                if (valor >= min && valor <= max) { 

                    return valor; 

                } 

                System.out.println("Fuera de rango (" + min + " a " + max + ")"); 

            } else { 

                System.out.println("Debe ingresar un entero"); 

                teclado.nextLine(); 

            } 

        } 

    } 

    static double leerPrecio(Scanner teclado, String mensaje) { 

        while (true) { 

            System.out.print(mensaje); 

            if (teclado.hasNextDouble()) { 

                double valor = teclado.nextDouble(); 

                teclado.nextLine(); 

                if (valor > 0) { 

                    return valor; 

                } 

                System.out.println("El precio debe ser mayor que cero"); 

            } else { 

                System.out.println("Debe ingresar un número"); 

                teclado.nextLine(); 

            } 

        } 

    } 

    public static void main(String[] args) { 

        Scanner teclado = new Scanner(System.in); 

        final int MAX = 100; 

        String[] productos = new String[MAX]; 

        int[] cantidades = new int[MAX]; 

        double[] precios = new double[MAX]; 

        int ventas = 0; 

        int totalProductos = 0; 

        double totalVendido = 0; 

        int opcion; 

        do { 

            System.out.println("\n=== CAFETERÍA UNIVERSITARIA ==="); 

            System.out.println("1. Registrar venta"); 

            System.out.println("2. Mostrar estadísticas"); 

            System.out.println("3. Mostrar tabla de ventas"); 

            System.out.println("4. Salir"); 

            opcion = leerEntero(teclado, "Seleccione una opción: ", 1, 4); 

            switch (opcion) { 

                case 1: 

                    if (ventas >= MAX) { 

                        System.out.println("Se alcanzó el máximo de ventas."); 

                        break; 

                    } 

                    System.out.print("Producto: "); 

                    productos[ventas] = teclado.nextLine(); 

                    cantidades[ventas] = leerEntero(teclado, "Cantidad: ", 1, 1000); 

                    precios[ventas] = leerPrecio(teclado, "Precio unitario: $"); 

                    totalProductos += cantidades[ventas]; 

                    totalVendido += cantidades[ventas] * precios[ventas]; 

                    ventas++; 

                    System.out.println("Venta registrada."); 

                    break; 

                case 2: 

                    System.out.println("\n=== REPORTE ==="); 

                    System.out.println("Ventas realizadas: " + ventas); 

                    System.out.println("Productos vendidos: " + totalProductos); 

                    System.out.printf("Total vendido: $%.2f%n", totalVendido); 

                    if (ventas > 0) { 

                        System.out.printf("Promedio por venta: $%.2f%n", totalVendido / ventas); 

                    } else { 

                        System.out.println("Promedio por venta: $0.00"); 

                    } 

                    break; 

                case 3: 

                    System.out.println("\n=== TABLA DE VENTAS ==="); 

                    if (ventas == 0) { 

                        System.out.println("No hay ventas registradas."); 

                    } else { 

                        System.out.printf("%-4s %-15s %-9s %-10s %-10s%n", 

                                "N°", "Producto", "Cantidad", "Precio", "Subtotal"); 

                        for (int i = 0; i < ventas; i++) { 

                            System.out.printf("%-4d %-15s %-9d $%-9.2f $%-9.2f%n", 

                                    i + 1, productos[i], cantidades[i], 

                                    precios[i], cantidades[i] * precios[i]); 

                        } 

                    } 

                    break; 

                case 4: 

                    System.out.println("Gracias por usar el sistema."); 

                    break; 

            } 

        } while (opcion != 4); 

        teclado.close(); 

    } 

} 