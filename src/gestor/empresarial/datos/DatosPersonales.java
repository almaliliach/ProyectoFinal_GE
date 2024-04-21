package gestor.empresarial.datos;

public class DatosPersonales { //La clase contiene la palabra reservada abstract, lo cual ofrece instancia
    private int id; //Declaracion de atributos
    private String nombre;
    private String apellidos;
    private String correo;
    private String whatsapp;


    public void setId() {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public  void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCorreo() {
        return correo;
    }

    public  void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
    public String getWhatsapp() {
        return whatsapp;
    }

    }



