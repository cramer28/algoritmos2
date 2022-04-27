
package appTareas;

public class Tarea {
    
    private String name;
    private String desc;
    
        //Constructores

    public Tarea(String name, String desc){
        this.name = name;
        this.desc = desc;
    }
    
        //Metodos

    public String leerName(){
        return this.name;
    }
    
    public String leerDesc(){
        return this.desc;
    }
        //Modificar nombre
    public int modName(String newName){
        if(newName!=null){
            this.name = newName;
            return 1;
        }else{
            return 0;
        }
        
    }
        //Modificar descripcion
    public int modDesc(String newDesc) {
        if(newDesc!=null){
            this.desc = newDesc;
            return 1;
        }else{
            return 0;
        }
        
    }
    
}
