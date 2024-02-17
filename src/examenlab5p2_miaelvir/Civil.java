/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_miaelvir;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Civil extends Usuario{
    
     ArrayList<Tramite> tramites = new ArrayList(); 

    public Civil(String nombre, String apellido, String contraseña, String sexo, String departamento, Date fechaN) {
        super(nombre, apellido, contraseña, sexo, departamento, fechaN);
        
    }

    public ArrayList<Tramite> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<Tramite> tramites) {
        this.tramites = tramites;
    }

    public static Random getRan() {
        return ran;
    }

    public static void setRan(Random ran) {
        Usuario.ran = ran;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    @Override
    public String toString() {
        return "Civil{" + "tramites=" + tramites + '}';
    }
    
    
            
    
}
