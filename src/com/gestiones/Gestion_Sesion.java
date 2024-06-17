package com.gestiones;

import java.util.Scanner;

/**
 *
 * @author Rolando Murillo Aguirre
 */
public class Gestion_Sesion {

    private Scanner entrada;
    private String cedulaEmpleado;
    private String contrasena;

    public void Gestion_Sesion() {
        entrada = new Scanner(System.in);

        do {
            System.out.println("Ingrese la cédula de empleado registrada");
            cedulaEmpleado = entrada.nextLine();
        } while (cedulaEmpleado.length() < 9);
    }
}
