
package appTareas;
import java.time.LocalDate;
public class Evento extends Tarea {
    protected LocalDate fecha_evento;
    protected String horario_inicio;
    protected String horario_fin;
    
    public Evento(String name, String desc, LocalDate fecha_evento, String horario_inicio , String horario_fin){
        super(name, desc);
        this.fecha_evento = fecha_evento;
        this.horario_inicio = horario_inicio;
        this.horario_fin = horario_fin;
    }
     //Metodos Fecha
    public LocalDate leerFecha(){
    return this.fecha_evento;
     }
    public void MostrarFecha(){
        System.out.println("Fecha del evento: "+this.fecha_evento);
    }
    //Modificar Fecha
    public int modFecha(LocalDate newfecha){
        if(newfecha!=null){
            this.fecha_evento = newfecha;
            return 1;
          }
        else{
        return 0;
        }
    }
    
    //Metodos Horarios
    public String leerHoraInicio(){
    return this.horario_inicio;
     }
    public void HorarioInicio(){
        System.out.println("El horario de inicio es: "+this.horario_inicio);
     }
    //Modificar Horario Inicio
    public int modHorarioInicio(String newHorarioInicio){
        if(newHorarioInicio!=null){
            this.horario_inicio = newHorarioInicio;
            return 1;
          }
        else{
        return 0;
        }
      }
    
    
    public String leerHoraFin(){
    return this.horario_fin;
     }
    public void MostrarHorarioFin(){
        System.out.println("El horario de fin es: "+this.horario_fin);
     }
    //Modificar Horario Fin    
    public int modHorarioFin(String newHorarioFin){
            if(newHorarioFin!=null){
                this.horario_fin = newHorarioFin;
                return 1;
              }
            else{
            return 0;
            }
          }
    
}

   
