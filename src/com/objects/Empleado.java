package com.objects;

import com.clasesPadre.Persona;
import java.time.LocalDate;

/**
 *
 * @author Rolando Murillo Aguirre
 */
public class Empleado extends Persona {
    private String puesto;
    private int salario;
    private LocalDate fechContrato;
    private String contrasena;
    private String tipoEmpleado;

    public Empleado() {
    }

    public Empleado(String puesto, int salario, LocalDate fechContrato, String contrasena, String tipoEmpleado, String cedula, String nombre, String direccion, String telefono, String correo) {
        super(cedula, nombre, direccion, telefono, correo);
        this.puesto = puesto;
        this.salario = salario;
        this.fechContrato = fechContrato;
        this.contrasena = contrasena;
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public LocalDate getFechContrato() {
        return fechContrato;
    }

    public void setFechContrato(LocalDate fechContrato) {
        this.fechContrato = fechContrato;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "puesto=" + puesto + ", salario=" + salario + ", fechContrato=" + fechContrato + ", contrasena=" + contrasena + ", tipoEmpleado=" + tipoEmpleado + '}';
    }

    
    
}
