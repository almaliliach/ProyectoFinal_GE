package gestor.empresarial.datos;


public class DatosEmpresariales extends DatosPersonales{//Declaracion de clase

    public  String adscripcion; //Declaracion de atributos
    public String telefonoExterior;
    public String puesto;

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