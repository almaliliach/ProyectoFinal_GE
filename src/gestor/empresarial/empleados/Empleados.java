package gestor.empresarial.empleados;

import gestor.empresarial.contrato.Cargos; //Importacion de paquetes
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.errores.GestionErrores;

public abstract   class Empleados implements iEmpleados{
    public GestionErrores error;
    private DatosEmpresariales[] DatosPersonal;
    private int i; //Declaracion de atributos
    private Contrato[] Contratos;
    private int j;




    public Empleados(){//constructor
        DatosPersonal = new DatosEmpresariales[50];
        Contratos = new Contrato[50];
        i = 0;
        j = 0;
        error = new GestionErrores();
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

