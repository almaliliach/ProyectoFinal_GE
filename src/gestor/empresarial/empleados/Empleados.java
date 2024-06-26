package gestor.empresarial.empleados;

import gestor.empresarial.contrato.Cargos; //Importacion de paquetes
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.errores.GestionErrores;

/*Declaracion de la clase empleados incluyendo la palabra reservada final e implemntando con la interfaz,
* declaracion de atributos, constructores, uso de metodos como el add el cual nos ayudara a añadir elementos
* de datos al paquete DatosPersonales y el comoponente show el cual nos permite abrir un cuadro de dialogo*/
public final class Empleados implements iEmpleados{
    public GestionErrores error;
    private DatosEmpresariales[] DatoPersonal;
    private int i; //Declaracion de atributos
    private Contrato[] Contratos;
    private int j;




    public Empleados(){//constructor
        DatoPersonal = new DatosEmpresariales[50];
        Contratos = new Contrato[50];
        i = 0;
        j = 0;
        error = new GestionErrores();
    }

    public void addDatosPersonales( String nombre, String apellidos, String correo,String whatsapp) {

        if (i < 100) {
            DatoPersonal[i] = new DatosEmpresariales();
            DatoPersonal[i].setId(i+1);
            DatoPersonal[i].setNombre(nombre);
            DatoPersonal[i].setApellidos(apellidos);
            DatoPersonal[i].setCorreo(correo);
            DatoPersonal[i].setWhatsapp(whatsapp);
            this.i++;
            System.out.println("Datos guardados con exito");
        } else {
            //error.getError(2);
        }
    }

    public int getId(){
        return this.i;
    }
    public void showDatosPersonales(){
        for(int x=0; x<i; x++){
            System.out.println("Id: " + DatoPersonal[x].getId()+"\n" + "Nombre:"+DatoPersonal[x].getNombre()+
                    "\n"+ "Apellidos: "+ DatoPersonal[x].getApellidos()+"\n"+ "Correo: "+ DatoPersonal[x].getCorreo()+
                    "\n" + "WhatsApp: "+ DatoPersonal[x].getWhatsapp());
        }
    }

    public void addDatosEmpresariales(int Id, String Adscripcion, String TelefonoExterior, String Puesto) {
        if (Id >=0 && Id <=this.i) {

            DatoPersonal[Id].setAdscripcion(Adscripcion);
            DatoPersonal[Id].setTelefonoExterior(TelefonoExterior);
            DatoPersonal[Id].setPuesto(Puesto);

            System.out.println("Datos guardados con exito");
        } else {
            //error.getError(2);
        }
    }

    public void showDatosEmpleado() {
        for (int x = 0; x<i; x++) {
            System.out.println("Id: "+ DatoPersonal[x].getId()+ "\n"+ "Nombre: "  + DatoPersonal[x].getNombre()+ "\n"+
                    "Apellidos: " + DatoPersonal[x].getApellidos() + "\n" + "Correo: " + DatoPersonal[x].getCorreo() + "\n" +
                    "WhatsApp: "+DatoPersonal[x].getWhatsapp() + "\n" + "Adscripción: " +DatoPersonal[x].getAdscripcion()+ "\n" +
                    "Telefono exterior: "+DatoPersonal[x].getTelefonoExterior()+ "\n" +"Puesto: "+DatoPersonal[x].getPuesto());
        }
    }

    public void addContrato(int id, int noContrato, int annio, String horario, Cargos tipoCargo) {
        Contratos[j] = new Contrato(id);
        if (this.j < 100) {
            Contratos[j].setNoContrato(noContrato);
            Contratos[j].setAnnio(annio);
            Contratos[j].setHorario(horario);
            Contratos[j].setTipoCargos(tipoCargo);
            this.j++;
            System.out.println("Datos guardados con exito");
        } else {
            error.getError(1);
        }
    }

    public void showContratosEmpleado(int b) {
        for (int k = 0; k<j; k++) {
            if (Contratos[k] != null) {
                System.out.println("Id empleado: " + DatoPersonal[k].getId() + "\n"+ "No. de contrato: "
                        + Contratos[k].getNoContrato()+ "\n" + "Año: " + Contratos[k].getAnnio()+ "\n"
                        + "Horario: " + Contratos[k].getHorario() + "\n"+ "Cargo: " + Contratos[k].getTipoCargos());
            }
        }
    }
    public void showEmpresa(){
        System.out.println("Empresa Mexicana Itera S.A de C.V");
        System.out.println("Telefono: 55-3300-0650");
        System.out.println("RFC: GHT469357839A");
    }
}

