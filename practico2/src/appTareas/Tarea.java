
package appTareas;

public class Tarea {
    
    String name;
    String desc;
    
    public Tarea(String name, String desc){
        this.name = name;
        this.desc = desc;
    }
    
    public String leerName(){
        return this.name;
    }
    
    public String leerDesc(){
        return this.desc;
    }
    
    public int modName(String newName){
        if(newName!=null){
            this.name = newName;
            return 1;
        }else{
            return 0;
        }
        
    }
    
    public int modDesc(String newDesc) {
        if(newDesc!=null){
            this.desc = newDesc;
            return 1;
        }else{
            return 0;
        }
        
    }
    
}
