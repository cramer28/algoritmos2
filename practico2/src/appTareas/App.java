 /**
 *  
 * Alumnos: 
 * Geronimo Finochietti
 * Valentin Risatti
 * Benjamin Velasco
 *
 */
package appTareas;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc1,opc2,n,x;
        String name, desc;
        Tarea lista[] = new Tarea[10];
        n = 0;
        do{
            System.out.println("1 - Crear Tarea\n2 - Ver lista\n0 - Salir");
            opc1 = sc.nextInt();
            sc.nextLine();
            switch(opc1){
                case 1:  //crear tarea
                    if(n < 10){
                        System.out.println("Ingresar el nombre de la tarea");
                        name = sc.nextLine();
                        System.out.println("Ingresar la descripcion de la tarea");
                        desc = sc.nextLine();
                        lista[n] = new Tarea(name, desc);
                        n++; 
                    }else{
                        System.out.println("La lista de tareas esta llena");
                    }
                    break;
                case 2:  //ver lista
                    if(n < 1){
                        System.out.println("No hay tareas");
                    }else{
                        System.out.println("Id  / Nombre Tarea / Descripcion Tarea");
                        for(x = 0; x<n; x++){
                            System.out.println(x+"  / "+lista[x].leerName()+" / "+lista[x].leerDesc());
                        }
                        System.out.println("Desea modificar una tarea? 1 - Si / 2 - No");
                        opc2 = sc.nextInt();
                        sc.nextLine();
                        if(opc2 == 1){
                            System.out.println("Ingresar ID de tarea");
                            opc2 = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Ingresar el nuevo nombre de la tarea");
                            name = sc.nextLine();
                            System.out.println("Ingresar la nueva descripcion de la tarea");
                            desc = sc.nextLine();
                            if(lista[opc2].modName(name)==1){
                                System.out.println("Nombre modificado correctamente");
                            }
                            if(lista[opc2].modDesc(desc)==1){
                                System.out.println("Descripcion modificado correctamente");
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
        sc.close();
    }
    
}
