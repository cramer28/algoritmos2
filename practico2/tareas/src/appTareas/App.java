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

public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, opc1,opc2,opc3,x;
        String name, desc;
        
        ArrayList<Tarea> lista = new ArrayList<Tarea>();
        
        do{
            System.out.println("1 - Tarea\n2 - Recordatorio \n3 - Evento \n 0-Salir"); //menu 
            menu = sc.nextInt();
            sc.nextLine();
            
            switch(menu){
                
                case 1:
                    do{
                        System.out.println("1 - Crear Tarea\n2 - Ver lista\n0 - Salir"); //menu 
                        opc1 = sc.nextInt();
                        sc.nextLine();

                        switch(opc1){
                            case 1:  //crear tarea
                                System.out.println("Ingresar el nombre de la tarea");
                                name = sc.nextLine();
                                System.out.println("Ingresar la descripcion de la tarea");
                                desc = sc.nextLine();
                                lista.add(new Tarea(name, desc));
                                break;
                            case 2:  //ver lista
                                if(lista.size() < 1){
                                    System.out.println("No hay tareas");
                                }else{
                                    System.out.println("Id  / Nombre Tarea / Descripcion Tarea");
                                    for(x = 0; x<lista.size(); x++){
                                        System.out.println(x+"  / "+lista.get(x).leerName()+" / "+lista.get(x).leerDesc());
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
                                            if(lista.get(opc3).modName(name)==1){
                                                System.out.println("Nombre modificado correctamente");
                                            }
                                            if(lista.get(opc3).modDesc(desc)==1){
                                                System.out.println("Descripcion modificada correctamente");
                                            }
                                        }else if(opc2 == 2){
                                            lista.remove(opc3);
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
            
                case 2:
                    break;
        
            }
        
        
        
        
        
    }while();
    sc.close();
}
