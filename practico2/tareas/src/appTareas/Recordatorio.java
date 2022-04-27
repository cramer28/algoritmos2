/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appTareas;

/**
 *
 * @author Sala2-02
 */
public class Recordatorio extends Tarea{
    
    String fecha, hora;
    
    
    
    public Recordatorio(String name, String desc, String fecha, String hora) {
        super(name, desc);
        this.fecha = fecha;
        this.hora = hora;
    }
    
    void setFecha(String fecha){
        this.fecha = fecha;
    
    }
    
    void sethora(String hora){
        this.hora = hora;
    
    }
    
    String getFecha(){
        return this.fecha;
    }
    
    String getHora(){
        return this.hora;
    }
    

}
