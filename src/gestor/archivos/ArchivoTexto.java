package gestor.archivos;
import java.util.*;

import java.io.*;//Lista de paquetes que contiene clases determinadas

/*En este apartado al esqueleto principal le modificamos distintas cosas puesto que con algunas palabras reservadas
* marcaba diferentes errores, se programo la clase Archivo para que implementara la interfaz, declaramos los atributos
* y tambien incluimos atributos con ayuda de una libreria, se declararon los distintos metodos incluyendo la informacion
* que le correspondia a cada uno pero teniendo en cuenta que en algunos se inclui un if el cual nos ayudo a ejecutar una
* sentencia.*/
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
        catch (Exception e){
            System.out.println(" Los errores no se encuentran en el archivo ");
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

            }catch(Exception e){

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
