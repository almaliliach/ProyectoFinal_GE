package gestor.empresarial.empleados;

import gestor.empresarial.contrato.Cargos; //Importacion de paquetes
import gestor.errores.GestionErrores;

public abstract class Empleados implements iEmpleados{ //Declaracion de la clase Empleados pero incluyendo la palabra
    //clave abstract la cual nos ayudara a implementar la clase con la interfaz iEmpleados.
    private int i; //Declaracion de atributos
    public GestionErrores error;
    public Empleados(){//constructor
    }
    public void addDatosPersonales(String nom, String ape , String di){//El add sirve para agrear valores
    }
    public void addContrato(int c1, int c2, String c3,Cargos c4 ){//Agreacion de valores
    }
    private int findEmpleado(int nun){ //Metodo
        return nun;

    }
    private int findEmpleado(String nun2 ){
        return 0;//duda
    }
    public void setWhatsApp(int q,String w){// Creacion del set el cual sirve para insertar un valor
    }
    private String datosPersonales(int dp){
        return null;//duda

    }
    public String getInfoEmpleado(String n){//Creacion del get el cual sirve para extraer
        return n;//duda
    }
    public void setAdscripcion(int id, String adscripcion){

    }
    public void setTelefonoExtesion(int i, String extension){

    }
    public void setPuesto(int p, String puesto){
    }
    public void showDatosEmpleados(){

    }
    public void showContratosEmpleado(int CE){

    }
    public int getAntiguedad(int Ai){
        return 0;
    }
    public void setCargo( Cargos ca){

    }
}

