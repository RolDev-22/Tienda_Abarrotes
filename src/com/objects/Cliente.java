package com.objects;

import com.clasesPadre.Persona;

/**
 *
 * @author Rolando Murillo Aguirre
 */
public class Cliente extends Persona {

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, String direccion, String telefono, String correo) {
        super(cedula, nombre, direccion, telefono, correo);
    }  
}
