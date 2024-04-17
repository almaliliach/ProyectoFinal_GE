package gestor.errores;

import java.util.*; //esta importacion incluye una lista de paquetes que contiene clases determinadas
import gestor.archivos.*; //Importacion de diferentes paquetes
import gestor.errores.*;
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.*;
import gestor.empresarial.empleados.*;
import gestor.empresarial.empresa.*;
public final class GestionErrores { //Creacion de la Clase GestionErrores incluyendo la palabra clave final
    private Map<Integer,String>error; //Declaracion de un atributo pero con el metodo map el cual permite trasformar
    //un objeto en otro mediante una funcion
    private boolean existeError; //Declaracion de atributo de tipo boleano
    private int noError;
    private String DescripcionTecnica;
    public GestionErrores(){ //Constructor
        error = new HashMap<Integer,String>();//Instanciar el objeto
    }
    private void cargarErrores(){//Metodo

    }
    public void setNoError(int e1, String error){ // Creación del set el cual sirve para insertar un valor

    }
    public String getError(){//Creación del get el cual sirve para extraer valores
        return ":Error";
    }
    public String getErrorTecnico(){
        return null;
    }
    public boolean ExisteError(){
        return false;
    }

}

