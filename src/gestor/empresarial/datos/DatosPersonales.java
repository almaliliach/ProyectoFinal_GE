package gestor.empresarial.datos;

public abstract class DatosPersonales { //La clase contiene la palabra reservada abstract, lo cual ofrece instancia
    private int id; //Declaracion de atributos
    private String nombre;
    private String apellidos;
    private String correo;
    private String whatsapp;

    protected int getId() {//Creacion del get el cual muestra un valor, incluyendo la palabra protected al incio
        // la cual indica que nuestro metodo es visible en la clase
        return id;
    }

    protected void setId() {//Creacion del set el cual es utilizado para la asignacion de un valor a un atributo,
        //incluyendo la palabra protected al incio la cual indica que nuestro metodo es visible en la clase
        this.id = id;
    }

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getApellidos() {
        return apellidos;
    }

    protected void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    protected String getCorreo() {
        return correo;
    }

    protected void setCorreo(String correo) {
        this.correo = correo;
    }

    protected String getWhatsapp() {
        return whatsapp;
    }

    protected void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }


    public String obtenerDatosPersonales() {
        return "Nombre: " + nombre + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "Correo: " + correo + "\n" +
                "WhatsApp: " + whatsapp;
    }
}


