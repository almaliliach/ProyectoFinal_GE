package gestor.archivos;

import java.io.*;//Lista de paquetes que contiene clases determinadas
import gestor.archivos.*; //Importacion de los diferentes paquetes a utilizar
import gestor.errores.*;
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.*;
import gestor.empresarial.empleados.*;
import gestor.empresarial.empresa.*;

public final class ArchivoTexto extends ControlArchivos implements iFileText {//Creacion de la clase ArchivoTexto pero incluyendo la palabra clave final, realizando una herencia a la clase ControlArchivos y terminando con una implementacion a la interfaz iFileText
    private File file; //Declaracion de atributos publicos
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    private boolean archivoExiste;
    private boolean modoLectura;
    private boolean modoEscritura;
    public ArchivoTexto(String archivo){ //Constructor
        super(archivo);//El super accede y llama la funcion del padre de un objeto
    }
    public ArchivoTexto(String texto, boolean dato){//Constructor
        super(texto);//El super accede y llama la funcion del padre de un objeto
    }
    public void AbrirModoLectura(){//Metodo
    }
    public String  Leer(){ //Metodo
        return ("leyendo...");//Devolucion del valor
    }
    public void AbrirModoEscritura(){
    }
    public void Escribir(String palabra){
    }
    public void Cerrar(){
    }
} //Final de la clase
