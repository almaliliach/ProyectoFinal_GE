package gestor.empresarial.datos;

/*En la decl*/
public class DatosEmpresariales extends DatosPersonales{
    //y un extends el cual ofrece herencia de la clase DatosPersonales


    public  String adscripcion; //Declaracion de atributos
    public String telefonoExterior;
    public String puesto;



    /*public  DatosEmpresariales (int id, String adscripcion, String telefonoExterior , String puesto){
        this.adscripcion= adscripcion;
        this.telefonoExterior = telefonoExterior;
        this.puesto= puesto;
    }*/

    public void setAdscripcion(String adscripcion){//Creacion del get, devuelve un valor
        this.adscripcion = adscripcion;
    }
    public String getAdscripcion(){//creacion del Set, el cual asina un valor al atributo
        return adscripcion;
    }

    public void setTelefonoExterior(String telefonoExterior){
        this.telefonoExterior = telefonoExterior;
    }
    public String getTelefonoExterior(){
        return telefonoExterior;
    }

    public void setPuesto(String puesto){
        this.puesto= puesto;
    }
    public String getPuesto(){
        return puesto;
    }

}