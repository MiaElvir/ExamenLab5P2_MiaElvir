/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_miaelvir;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Tramite {
    
    protected String nombre, descripcion, dni; 
    protected Date fecha; 

    public Tramite() {
    }

    
    public Tramite(String nombre, String descripcion, String dni, Date fecha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.dni = dni;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tramite{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", dni=" + dni + ", fecha=" + fecha + '}';
    }
    
    
}
