 /**
 * test
 
 * Alumnos: 
 * Geronimo Finochietti
 * Valentin Risatti
 * Benjamin Velasco
 *
 */
package appTareas;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;


public class App {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, opc1,opc2,opc3,x;
        String name, desc, fecha, fecha_evento_str, fecha_recordatorio_str,hora,horario_inicio, horario_fin;
        
        LocalDate date_evento; // el metodo parse de LocalDate funciona solo con fechas del formato "yyyy-mm-dd" con 0s en los digitos vacios
                               // Ejemplo: "2019-01-01"
        LocalDate date_recordatorio;
        
        ArrayList<Tarea> tareas = new ArrayList<>();
        ArrayList<Recordatorio> recordatorios = new ArrayList<>();
        ArrayList<Evento> eventos = new ArrayList<>();
        
        do{
            System.out.println("1 - Tarea\n2 - Recordatorio \n3 - Evento \n0 - Salir"); //menu 
            menu = sc.nextInt();
            sc.nextLine();
            
            switch(menu){
                
                case 1:
                    do{
                        System.out.println("1 - Crear Tarea\n2 - Ver lista\n0 - Volver atras"); //tareas 
                        opc1 = sc.nextInt();
                        sc.nextLine();

                        switch(opc1){
                            case 1:  //crear tarea
                                System.out.println("Ingresar el nombre de la tarea");
                                name = sc.nextLine();
                                System.out.println("Ingresar la descripcion de la tarea");
                                desc = sc.nextLine();
                                tareas.add(new Tarea(name, desc));
                                break;
                            case 2:  //ver lista
                                if(tareas.size() < 1){
                                    System.out.println("No hay tareas");
                                }else{
                                    System.out.println("Id  / Nombre Tarea / Descripcion Tarea");
                                    for(x = 0; x<tareas.size(); x++){
                                        System.out.println(x+"  / "+tareas.get(x).leerName()+" / "+tareas.get(x).leerDesc());
                                    }
                                    System.out.println("Opciones a continuacion:\n1 - Modificar Tarea\n2 - Eliminar Tarea\n0 - Volver al menu principal");
                                    opc2 = sc.nextInt();
                                    sc.nextLine();
                                    if(opc2 == 1 || opc2 == 2){
                                        System.out.println("Ingresar ID de tarea");
                                        opc3 = sc.nextInt();
                                        sc.nextLine();
                                        if(opc2 == 1){
                                            System.out.println("Ingresar el nuevo nombre de la tarea");
                                            name = sc.nextLine();
                                            System.out.println("Ingresar la nueva descripcion de la tarea");
                                            desc = sc.nextLine();
                                            if(tareas.get(opc3).modName(name)==1){
                                                System.out.println("Nombre modificado correctamente");
                                            }
                                            if(tareas.get(opc3).modDesc(desc)==1){
                                                System.out.println("Descripcion modificada correctamente");
                                            }
                                        }else if(opc2 == 2){
                                            tareas.remove(opc3);
                                            System.out.println("Tarea Eliminada correctamente");
                                        }
                                    }
                                }
                            break;


                            default:
                                System.out.println("Error, intente nuevamente");
                            case 0:
                                break;
                        }
                
            
                        
                    }while(opc1!=0);
                    break;
                case 2:
                    do{
                        System.out.println("\n 1-Crear Recordatorio \n 2-Ver recordatorios  \n 0-Volver atras");
                        opc2 = sc.nextInt();
                        sc.nextLine();
                        
                        switch(opc2){
                            case 1:
                                
                                System.out.println("Ingrese el nombre del recordatorio:");
                                name = sc.nextLine();
                                System.out.println("Ingrese la descripcion del recordatorio:");
                                desc = sc.nextLine();
                                System.out.println("Ingrese la fecha del recordatorio:");
                                fecha_recordatorio_str = sc.nextLine();
                                date_recordatorio = LocalDate.parse(fecha_recordatorio_str); //date_recordatorio guarda fecha_evento_str
                                System.out.println("Ingrese la hora del recordatorio:");
                                hora = sc.nextLine();
                                recordatorios.add(new Recordatorio(name, desc,date_recordatorio, hora));
                                break;
                                
                            case 2:
                                if(recordatorios.size() < 1){
                                    System.out.println("No hay recordatorios");
                                }else{
                                    System.out.println("Nombre / Descripcion / Fecha / Hora");
                                    for(x = 0; x<tareas.size(); x++){
                                        System.out.println(x+" / "+recordatorios.get(x).leerName()+" / "+recordatorios.get(x).leerDesc() + " / " + recordatorios.get(x).getFecha() + " / " + recordatorios.get(x).getHora());
                                    }
                                }
                                break;
                        }
                    }while(opc2!=0);
                    break;
                case 3:
                    do{
                        System.out.println("1-Crear Evento \n2-Ver Eventos  \n0-Volver atras");
                        opc2 = sc.nextInt();
                        sc.nextLine();
                        
                        switch(opc2){
                            //Crear Evento
                            case 1:
                                
                                System.out.println("Ingrese el nombre del Evento:");
                                name = sc.nextLine();
                                System.out.println("Ingrese la descripcion del Evento:");
                                desc = sc.nextLine();
                                System.out.println("Ingrese la fecha del Evento:");
                                fecha_evento_str = sc.nextLine();
                                date_evento = LocalDate.parse(fecha_evento_str); //date_evento guarda fecha_evento_str
                                                   
                                System.out.println("Ingrese la hora de inicio del Evento:");
                                horario_inicio = sc.nextLine();
                                System.out.println("Ingrese la hora de fin del Evento:");
                                horario_fin = sc.nextLine();
                                eventos.add(new Evento(name, desc,date_evento, horario_inicio, horario_fin));
                                break;
                                //Ver lista de Eventos
                            case 2:
                                if(eventos.size() < 1){
                                    System.out.println("No hay eventos");
                                }else{
                                    System.out.println("/  Nombre / Descripcion / Fecha / Horario Inicio / Horario Fin");
                                    for(x = 0; x<eventos.size(); x++){
                                        System.out.println("ID:"+x+" / "+eventos.get(x).leerName()+" / "+eventos.get(x).leerDesc() + " / " +eventos.get(x).leerFecha() + " / " +eventos.get(x).leerHoraInicio()+" / " +eventos.get(x).leerHoraFin());
                                    }
                                }
                                System.out.println("Opciones a continuacion:\n1 - Modificar Evento\n2 - Eliminar Evento\n0 - Volver al menu principal");
                                    opc2 = sc.nextInt();
                                    sc.nextLine();
                                    if(opc2 == 1 || opc2 == 2){
                                        //Modificar Evento
                                        System.out.println("Ingresar ID del evento:");
                                        opc3 = sc.nextInt();
                                        sc.nextLine();
                                        if(opc2 == 1){
                                            System.out.println("Ingresar el nuevo nombre del evento:");
                                            name = sc.nextLine();
                                            System.out.println("Ingresar la nueva descripcion del evento:");
                                            desc = sc.nextLine();
                                            System.out.println("Ingresar la nueva fecha del evento:");
                                            fecha_evento_str =  sc.nextLine();
                                            date_evento = LocalDate.parse(fecha_evento_str);
                                            
                                            System.out.println("Ingresar el nuevo horario de inicio del evento:");
                                            horario_inicio = sc.nextLine();
                                            System.out.println("Ingresar el nuevo horario de fin del evento:");
                                            horario_fin = sc.nextLine();
                                            
                                            if(eventos.get(opc3).modName(name)==1){
                                                System.out.println("Nombre modificado correctamente");
                                            }
                                            if(eventos.get(opc3).modDesc(desc)==1){
                                                System.out.println("Descripcion modificada correctamente");
                                            }
                                            if(eventos.get(opc3).modFecha(date_evento)==1){
                                                System.out.println("Fecha modificada correctamente");
                                            }
                                            if(eventos.get(opc3).modHorarioInicio(horario_inicio)==1){
                                                System.out.println("Horario de inicio modificado correctamente");
                                            }
                                            if(eventos.get(opc3).modHorarioFin(horario_fin)==1){
                                                System.out.println("Horario de fin modificado correctamente");
                                            }
                                        //Eliminar Evento
                                        }else if(opc2 == 2){
                                            eventos.remove(opc3);
                                            System.out.println("Evento Eliminado correctamente");
                                        }
                                    }
                                
                                        
                            break;
                        }
                        
                    }while(opc2!=0);
                    
                break;

            }
        }while(menu!=0);
    
        sc.close();

    }
}
