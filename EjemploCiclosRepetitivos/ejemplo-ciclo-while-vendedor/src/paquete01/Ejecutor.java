
package paquete01;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        // variables para ingreso de datos
        String nombre;
        int edad;
        double sMinino;
        int autos;
        boolean bandera;
        String opcion;
        Scanner entrada = new Scanner(System.in);

        // Inicio de proceso iterativo 
        bandera = true;
        while (bandera) { // bandera == true
            // con los datos ingresados se crea el objeto de tipo Vendedor
            System.out.println("Ingrese nombre, edad, salario minimmo, numero de autos");
            Vendedor v = new Vendedor(entrada.next(), entrada.nextInt(), entrada.nextDouble(), entrada.nextInt());
            v.calcularPagoMensual();
            System.out.println(v);
            entrada.nextLine(); // limpieza del buffer
            System.out.println("Desea ingresar más vendedores. Ingrese n para"
                    + "salir");
            opcion = entrada.nextLine();
            if (opcion.equals("n")) {
                bandera = false;
            }

        }
    }
}
