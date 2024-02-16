
package examenlab5p2_miaelvir;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Empleado extends Usuario{
    
    protected String carrera, puesto, anios; 

    public Empleado(String carrera, String puesto, String anios, String nombre, String apellido, String contraseña, String sexo, String departamento, Date fechaN) {
        super(nombre, apellido, contraseña, sexo, departamento, fechaN);
        this.carrera = carrera;
        this.puesto = puesto;
        this.anios = anios;
        
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getAnios() {
        return anios;
    }

    public void setAnios(String anios) {
        this.anios = anios;
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
        return "Empleado{" + "carrera=" + carrera + ", puesto=" + puesto + ", anios=" + anios + '}';
    }
    
    
}
