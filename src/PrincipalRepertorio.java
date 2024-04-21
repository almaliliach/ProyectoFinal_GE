import gestor.empresarial.contrato.Cargos;
import gestor.empresarial.contrato.Contrato;
import gestor.empresarial.empleados.Empleados;
import gestor.errores.GestionErrores;

import java.util.Scanner;

/*En este apartado se encuentra el Repertorio, es decir el main principal, el cual abarca los distintos
* atributos de los diferentes paquetes creados para poder ser ejecutado correctamente, para comenzar se
* instancia para que se pueda especificar la iformacion, declaramos atributos que seran necesarios,
* utilizamos un do/while el cual nos ayudo para crear el cuerpo del bucle mientras cumple la condicion
* del switch  el cual evaluara las diferentes opciones solicitadas, sin olvidar que tenemos que integrar
* los diferentes mensajes para saber que se solicita*/

public class PrincipalRepertorio{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Empleados datos = new Empleados();
        Contrato con = new Contrato(1);
        GestionErrores error = new GestionErrores();

        String nombre;
        String apellidos;
        String correo;
        String whatsApp;

        String ads;
        String telefono;
        String Puesto;

        String id ;
        String cont;
        String annio;
        int op = 0;
        do{
            System.out.println("\n BIENVEDIDO AL GESTOR EMPRESARIAL DE LA IMPRESA MEXICANA ITERA S.A DE C.V");
            System.out.println(" ***REPERTORIO***");
            System.out.println("1) AGREGAR DATOS PERSONALES");
            System.out.println("2) MOSTRAR DATOS PERSONALES ");
            System.out.println("3) AGREGAR DATOS EMPRESARIALES");
            System.out.println("4) MOSTRAR DATOS EMPRESARIALES");
            System.out.println("5) AGREGAR DATOS DEL CONTRATO");
            System.out.println("6) MOSTRAR CONTRATO");
            System.out.println("7) INFORMACIÓN DE LA EMPRESA ");
            System.out.println("8) SALIR");

            System.out.println("Seleccione una opción: ");

            op=entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.println("AGREGAR DATOS PERSONALES");
                    entrada.nextLine();

                    System.out.println("Nombre: ");
                    nombre = entrada.nextLine();

                    System.out.println("Apellidos: ");
                    apellidos = entrada.nextLine();

                    System.out.println("Correo: ");
                    correo = entrada.nextLine();

                    System.out.println("WhatsApp: ");
                     whatsApp= entrada.nextLine();

                    datos.addDatosPersonales(nombre, apellidos , correo, whatsApp);
                    System.out.println("ID OTORGADO: " + datos.getId());
                    break;
                case 2:
                    System.out.println("MOSTRAR DATOS PERSONALES");
                    datos.showDatosPersonales();
                    System.out.println();
                    break;

                case 3:
                    System.out.println("AGREGAR DATOS EMPRESARIALES");
                    entrada.nextLine();
                    System.out.println("Ingresa el Id asignado: ");
                    id = entrada.nextLine();

                    if (Integer.parseInt(id) > 0 && Integer.parseInt(id) <= datos.getId()) {
                        System.out.println("Ingresar Adscripcion: ");
                        ads = entrada.nextLine();
                        System.out.println("Ingresar Telefono Exterior: ");
                        telefono = entrada.nextLine();
                        System.out.println("Ingresar Puesto: ");
                        Puesto = entrada.nextLine();
                        datos.addDatosEmpresariales(Integer.parseInt(id) - 1, ads, telefono, Puesto);
                    } else {
                        System.out.println(error.getError(2));
                    }
                    break;
                case 4:
                    System.out.println("MOSTRAR DATOS EMPRESARIALES");
                    System.out.println("\n");
                    System.out.println();
                    datos.showDatosEmpleado();
                    break;

                case 5:
                    System.out.println("AGREGAR DATOS DEL CONTRATO");
                    entrada.nextLine();
                    System.out.println("Ingresar Id del Trabajador: ");
                    id = entrada.nextLine();

                    if (Integer.parseInt(id) > 0 && Integer.parseInt(id) <= datos.getId()) {

                        System.out.print("Ingresar ID del contrato:\n ");
                        int idContrato = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Ingresar numero de contrato: ");
                        cont = entrada.nextLine();
                        System.out.println("Ingresar año: ");
                        annio = entrada.nextLine();
                        System.out.println("Ingresar horario: ");
                        String hor = entrada.nextLine();
                        System.out.println("Tipos de cargo disonibles:");
                        for (Cargos cargo : Cargos.values()) {
                        }

                        System.out.println(" a)Sindicalizado\n b)confianza\n c)temporal\n Seleccione el tipo de cargo:");
                        String tipoCargoStr = entrada.nextLine();
                        Cargos tipoCargo = Cargos.sindicalizado;
                        switch(tipoCargoStr) {
                            case "a":
                                tipoCargo = Cargos.sindicalizado;
                                break;
                            case "b":
                                tipoCargo = Cargos.confianza;
                                break;
                            case "c":
                                tipoCargo = Cargos.temporal;
                                break;
                        }

                        datos.addContrato(Integer.parseInt(id), Integer.parseInt(cont), Integer.parseInt(annio), hor, tipoCargo);
                    }

                    else {
                        System.out.println(error.getError(2));
                    }
                    break;

                case 6:
                    System.out.println("MOSTRAR CONTRATO");
                    datos.showContratosEmpleado(2);
                    break;

                case 7:
                    System.out.println("INFORMACIÓN DE LA EMPRESA ITERA");
                    datos.showEmpresa();
                    break;

                case 8:
                    System.out.println("CERRANDO GESTOR EMPRESARIAL DE ITERA S.A DE C.V");
                    break;

                default:
                    System.out.println(error.getError(3));
            }
        }while(op!=8);
    }
}
