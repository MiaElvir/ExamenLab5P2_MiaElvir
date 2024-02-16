
package examenlab5p2_miaelvir;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public abstract class Usuario {
    static Random ran = new Random(); 
    protected String nombre, apellido, contraseña, sexo, departamento, Id; 
    protected Date fechaN;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String contraseña, String sexo, String departamento, Date fechaN) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.sexo = sexo;
        this.departamento = departamento;
        this.fechaN = fechaN;
        //metodo identidad
        this.Id = Id(departamento, fechaN); 
    }
    
    public String Id(String departamento, Date fecha){
        String idi = ""; 
        if (departamento.equalsIgnoreCase("Francisco Morazan")){
            int iden = ran.nextInt(01, 29); 
            int f = fecha.getYear(); 
            idi+=(01+iden+"-"+f+"-"); 
            for (int i = 0; i < 5; i++) {
                int rani = ran.nextInt(0,9); 
                idi+=rani; 
            }
            
        }else if (departamento.equalsIgnoreCase("Cortes")){
            int iden = ran.nextInt(01, 12); 
            int f = fecha.getYear();
            idi+=(02+iden+"-"+f+"-"); 
            for (int i = 0; i < 5; i++) {
                int rani = ran.nextInt(0,9); 
                idi+=rani; 
            }
        }else if (departamento.equalsIgnoreCase("Comayagua")){
            int iden = ran.nextInt(01, 21); 
            int f = fecha.getYear();
            idi+=(03+iden+"-"+f+"-"); 
            for (int i = 0; i < 5; i++) {
                int rani = ran.nextInt(0,9); 
                idi+=rani; 
            }
        }
        return idi; 
    }
    
    
    
}
