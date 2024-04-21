package gestor.archivos;
import java.util.*;

import java.io.*;//Lista de paquetes que contiene clases determinadas
import gestor.archivos.*; //Importacion de los diferentes paquetes a utilizar
import gestor.errores.*;
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.*;
import gestor.empresarial.empleados.*;
import gestor.empresarial.empresa.*;

public class ArchivoTexto implements iFileText {
    private File file; //Declaracion de atributos publicos
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    private boolean archivoExistente;
    private boolean modoLectura;
    private boolean modoEscritura;
    public ArchivoTexto(String tituloArchivo){ //Constructor
        try {
            file = new File(tituloArchivo);

            if (!file.exists())
                file.createNewFile();

            this.archivoExistente = true;
            this.modoLectura = false;
            this.modoEscritura = false;
        }
        catch (Exception a){
            System.out.println(" Los errores no se encuentran en un archivo ");
            this.archivoExistente=false;
        }
    }
    public void AbrirModoLectura(){//Implementacion
        if(archivoExistente){
            try{
                fr = new FileReader(this.file.getAbsoluteFile());
                br = new BufferedReader(this.fr);
                this.modoLectura = true;

            }catch
            (Exception e){
                System.out.println("Error: NO SE PUEDE ABRIR EN MODO LECTURA");
            }
        }
    }
    public String Leer(){
        if(archivoExistente == true){
            try{
                return this.br.readLine();
            }catch (Exception a){
            }
        }
        return null;
    }
    public void AbrirModoEscritura(){
        if(archivoExistente){
            try{
                fw = new FileWriter(this.file.getAbsoluteFile(),true);
                bw = new BufferedWriter(this.fw);
                modoEscritura=true;

            }catch(Exception a){

            }
        }
    }
    public void Escribir(String texto){
        if(archivoExistente==true){
            try{
                this.bw.write(texto+"\n");
            }catch (Exception e){
                System.out.println("Error:No se permite editar el archivo");
            }
        }
    }
    public void Cerrar(){
        if(modoEscritura==true){
            try{
                this.bw.close();
                this.fw.close();
            }catch (Exception a){

            }
        }
        else if(modoLectura){
            try{
                this.br.close();
                this.fr.close();
            }catch (Exception e){

            }
        }
    }
} //Final de la clase
