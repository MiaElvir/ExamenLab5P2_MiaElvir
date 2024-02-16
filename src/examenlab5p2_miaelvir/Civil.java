/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_miaelvir;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Civil extends Usuario{
    
    public ArrayList<Tramite> tramites = new ArrayList(); 

    public Civil(String nombre, String apellido, String contraseña, String sexo, String departamento, Date fechaN) {
        super(nombre, apellido, contraseña, sexo, departamento, fechaN);
        
    }
    
    
            
    
}
