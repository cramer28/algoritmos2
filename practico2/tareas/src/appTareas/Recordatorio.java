/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appTareas;
import java.time.LocalDate;
/**
 *
 * @author Sala2-02
 */
public class Recordatorio extends Tarea{
    
    String hora;
    LocalDate fecha;
    
    
    
    public Recordatorio(String name, String desc, LocalDate fecha, String hora) {
        super(name, desc);
        this.fecha = fecha;
        this.hora = hora;
    }
    
    void setFecha(LocalDate fecha){
        this.fecha = fecha;
    
    }
    
    void sethora(String hora){
        this.hora = hora;
    
    }
    
    LocalDate getFecha(){
        return this.fecha;
    }
    
    String getHora(){
        return this.hora;
    }
    

}
