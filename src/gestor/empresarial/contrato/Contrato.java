package gestor.empresarial.contrato;

public final class Contrato {  //creacion de la clase Contrato con la palabra final la cual es una clase que no puede heredar solo instanciar
    private int id; //Atrubuto
    private int noContrato; //Atributo
    private int annio; //Atributo
    private String horario;//Atributo
    private Cargos tipoCargos;//Atributo

    public Contrato (int id){ //creacion del constructor
        tipoCargos = Cargos.confianza; //Instanciamos los atributos
        tipoCargos = Cargos.sindicalizado;
        tipoCargos = Cargos.temporal;

    }

    public void setNoContrato(int noContrato){//Creacion del set el cual sirve para insertar

        this.noContrato = noContrato; //Asignamos
    }
    public int getNoContrato(){//Creacion del get el cual sirve para extraer

        return noContrato;//Devuelve un valor
    }

    public void setAnnio(int annio) {
        this.annio = annio;//Asignamos
    }

    public int getAnnio() {

        return annio;//Devuelve un valor
    }
} //final de la clase


