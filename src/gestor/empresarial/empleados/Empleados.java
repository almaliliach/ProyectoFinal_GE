package gestor.empresarial.empleados;

import gestor.empresarial.contrato.Cargos; //Importacion de paquetes
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.errores.GestionErrores;

public final class Empleados implements iEmpleados{
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

    public void addDatosPersonales( String nombre, String apellidos, String correo,String whatsapp) {

        if (i < 100) {
            DatosPersonal[i] = new DatosEmpresariales();
            DatosPersonal[i].setId(i+1);
            DatosPersonal[i].setNombre(nombre);
            DatosPersonal[i].setApellidos(apellidos);
            DatosPersonal[i].setCorreo(correo);
            DatosPersonal[i].setWhatsapp(whatsapp);
            this.i++;
            System.out.println("Datos personales agregados");
        } else {
            //error.getError(2);
        }
    }

    public void showDatosEmpleados(){
        for (int k = 0; k<i; k++) {
            System.out.println("Id: " + DatosPersonal[k].getId()+", Nombre: "+DatosPersonal[k].getNombre()+", Apellidos: "+DatosPersonal[k].getApellidos()+", Correo: "+DatosPersonal[k].getCorreo()+", WhatsApp: "+DatosPersonas[k].getWhatsapp()
                    + ", Adscripción: " + DatosPersonal[k].getAdscripcion()+", Telefono exterior: "+DatosPersonal[k].getTelefonoExterior()+", Puesto: "+DatosPersonal[k].getPuesto());
    }

        public void addContrato(int id, int noContrato, int annio, String String horario, Cargos Cargos tipocargo) {
            Contratos[j] = new Contrato(id);
            if (this.j < 100) {//mejorar validasion
                Contratos[j].setNoContrato(noContrato);
                Contratos[j].setAnnio(annio);
                Contratos[j].setHorario(horario);
                Contratos[j].setTipoCargos(tipocargo);
                this.j++;
                System.out.println("Datos del contrato agregados");
            } else {
                error.getError(1);
            }
        }

}

