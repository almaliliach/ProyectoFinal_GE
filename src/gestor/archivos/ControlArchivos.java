package gestor.archivos;

public abstract class ControlArchivos {//Declaracipn de la clase ControlArchivos pero incluyendo la palabra clave abstract
    private String archivo; //Declaracion de atributos
    public ControlArchivos(String control){ //Constructor
    }
    public boolean Crear() { //Metodo
        return false; //Devolucion de un valor
    }
    public boolean Eliminar(){
        return false;
    }
    public boolean Cambiar(String cambio){
        return false;
    }
    public boolean Mover(String mover) {
        return false;
    }
}
