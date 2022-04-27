
package appTareas;

public class Evento extends Tarea {
    protected String fecha_evento;
    protected String horario_inicio;
    protected String horario_fin;
    
    public Evento(String name, String desc) {
        super(name, desc);
    }
     //Metodos Fecha
    public String leerFecha(){
    return this.fecha_evento;
     }
    public void MostrarFecha(){
        System.out.println("Fecha del evento: "+this.fecha_evento);
     }
        //Modificar Fecha
        public void modFecha(String newfecha){
            if(newfecha!=null){
                this.fecha_evento = newfecha;
              }
          }
    
    //Metodos Horarios
    public String leerHoraInicio(){
    return this.horario_inicio;
     }
    public void HorarioInicio(){
        System.out.println("El horario de inicio es: "+this.horario_inicio);
     }
        //Modificar Horarios
        public void modHorarioInicio(String newHorarioInicio){
            if(newHorarioInicio!=null){
                this.horario_inicio = newHorarioInicio;
              }
          }
    
    
    public String leerHorarioFin(){
    return this.horario_fin;
     }
    public void MostrarHorarioFin(){
        System.out.println("El horario de fin es: "+this.horario_fin);
     }
        public void modHorarioFin(String newHorarioFin){
            if(newHorarioFin!=null){
                this.horario_fin = newHorarioFin;
              }
          }
    
}

   
