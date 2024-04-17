package gestor.empresarial.empresa;

import gestor.empresarial.empleados.Empleados; //Importacion de paquetes necesarios
import gestor.errores.GestionErrores;
public final class Empresa { //Creacion de la clase pero incluyendo la palabla clave final
    private String nombreEmpresa; //Declaracion de atributos privados
    private String representanteLegal;
    private String telefono;
    private String rfc;
    public Empleados datosRH;//Declaracion de atrubutos publicos
    public GestionErrores error;
    public Empresa(String nombre, String direccion){//Metodo

    }
    public void setRepresentanteLegal(String nombre){ // Creación del set el cual sirve para insertar un valor
        this.representanteLegal= representanteLegal;//asignacion
    }
    public String getRepresentanteLegal(){//Creación del get el cual sirve para extraer
        return representanteLegal; //Devolucion de un valor
    }
    public void setTelefono(String numero){
        this.telefono=telefono;
    }
    public String gettlnfo() {
        String tlnfo= null;
        return tlnfo;
    }
}
