package gestor.errores;

import java.util.*; //esta importacion incluye una lista de paquetes que contiene clases determinadas
import gestor.archivos.*; //Importacion de diferentes paquetes
import gestor.errores.*;
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.*;
import gestor.empresarial.empleados.*;
import gestor.empresarial.empresa.*;
import gestor.archivos.ArchivoTexto;

/*Como se menciona mas adelante realizamos la declaracion de la clase, incluimos el metodo map el cual nos permitira
* transformar un objeto en otro a traves de una funcion, incluimos constructores e instanciamos onjeto, se modificaron
* los get originales del esqueleto y solo dejamos uno el cual nos sera util*/

public final class GestionErrores { //Creacion de la Clase GestionErrores incluyendo la palabra clave final
    private Map<Integer,String> error;
    private ArchivoTexto almacenar;

    /*private String DescripcionTecnica;*/

    public GestionErrores(){ //Constructor
        error = new HashMap<Integer,String>();//Instanciar el objeto
        almacenar=new ArchivoTexto("D:\\ESTANCIA\\Programas\\Adobe Animate CC 2018");
        almacenar.AbrirModoEscritura();
    }
    private void cargarErrores(){//Metodo
        error.put(1, "Sin vacantes disponibles");
        error.put(2, "Id no existente");
        error.put(3, "Opcion incorrecta");

    }

    public String getError(int folio){//Creación del get el cual sirve para extraer valores
        almacenar.AbrirModoEscritura();
        cargarErrores();
        almacenar.Escribir(error.get(folio));

        almacenar.Cerrar();
        return error.get(folio);
    }


}

