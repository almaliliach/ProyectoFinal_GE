package gestor.empresarial.contrato;


public final class Contrato {  //creacion de la clase Contrato con la palabra final la cual es una clase que no puede heredar solo instanciar
    private int id;
    private int noContrato;
    private int annio;
    private String horario;
    private Cargos tipoCargos;

    public Contrato (int id){ //creacion del constructor
        this.id = id;
        this.tipoCargos = Cargos.sindicalizado;

    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setNoContrato(int noContrato){//Creacion del set el cual sirve para insertar

        this.noContrato = noContrato; //Asignamos
    }
    public int getNoContrato(){//Creacion del get el cual sirve para extraer

        return noContrato;//Devuelve un valor
    }

    public void setTipoCargos(Cargos tipoCargos) {
        this.tipoCargos = tipoCargos;
    }
    public Cargos getTipoCargos() {
        return tipoCargos;
    }

    public void setAnnio(int annio) {
        this.annio = annio;//Asignamos
    }

    public int getAnnio() {

        return annio;//Devuelve un valor
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getHorario() {
        return horario;
    }
} //final de la clase


