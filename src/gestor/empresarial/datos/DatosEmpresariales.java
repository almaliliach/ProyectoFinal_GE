package gestor.empresarial.datos;

public final class DatosEmpresariales extends DatosPersonales{ //Clase DatosEmpresariales incluyendo la palabra clave final
    //y un extends el cual ofrece herencia de la clase DatosPersonales
    private String adscripcion; //Declaracion de atributos
    private String telefonoExterior;
    private String puesto;
    public  DatosEmpresariales (int id, String adscripcion, String telefonoExterior , String puesto){
        this.adscripcion= adscripcion;
        this.telefonoExterior = telefonoExterior;
        this.puesto= puesto;
    }
    public String getAdscripcion(){//creacion del Set, el cual asina un valor al atributo
        return adscripcion;
    }
    public void setAdscripcion(String adscripcion){//Creacion del get, devuelve un valor
        this.adscripcion = adscripcion;
    }
    public String getTelefonoExterior(){
        return telefonoExterior;
    }

    public void setTelefonoExterior(String telefonoExterior){
        this.telefonoExterior = telefonoExterior;
    }
    public String getPuesto(){
        return puesto;
    }

    public void setPuesto(String puesto){
        this.puesto= puesto;
    }

}