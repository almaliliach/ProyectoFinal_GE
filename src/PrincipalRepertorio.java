import gestor.empresarial.contrato.Cargos;
import gestor.empresarial.contrato.Contrato;
import gestor.empresarial.empleados.Empleados;
import gestor.errores.GestionErrores;

import java.util.Scanner;

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
        String Tle;
        String Puesto;

        String id ;
        String cont;
        String annio;
        int op = 0;
        do{
            System.out.println("\n \nBienvenido al gestor empresarial de la empresa ITERA ");
            System.out.println(" ***REPERTORIO***");
            System.out.println("1) Agregar datos personales");
            System.out.println("2) Mostrar datos personales");
            System.out.println("3) Agregar datos empresariales");
            System.out.println("4) Mostrar datos de los empleados");
            System.out.println("5) Agregar datos del Contrato");
            System.out.println("6) Mostrar contrato");
            System.out.println("7) Información de la empresa");
            System.out.println("8) Salir");

            System.out.println("Seleccione una opción: ");

            op=entrada.nextInt();
            switch (op) {
                case 1:
                    System.out.println("< Ingresar datos personales >");
                    entrada.nextLine();

                    System.out.println("Nombre: ");
                    nombre = entrada.nextLine();

                    System.out.println("Apellidos: ");
                    apellidos = entrada.nextLine();

                    System.out.println("Correo: ");
                    correo = entrada.nextLine();

                    System.out.println("WhatsApp: ");
                     whatsApp= entrada.nextLine();

                    datos.addDatosPersonales(nombre, apellidos , correo,whatsApp);

                    System.out.println("Su id correspondiente es: " + datos.getId());
                    break;
                case 2:
                    System.out.println("< Mostrando datos personales >");
                    System.out.println("Datos del empleado:");

                    datos.showDatosPersonales();
                    break;

                case 3:
                    System.out.println("< Agregar datos empresariales > ");
                    entrada.nextLine();
                    System.out.println("Ingresar el id del aspirante: ");
                    id = entrada.nextLine();

                    if (Integer.parseInt(id) > 0 && Integer.parseInt(id) <= datos.getId()) {
                        System.out.println("Ingrese la Adscripcion: ");
                        ads = entrada.nextLine();
                        System.out.println("Ingrese el Telefono Exterior: ");
                        Tle = entrada.nextLine();
                        System.out.println("Ingrese el puesto: ");
                        Puesto = entrada.nextLine();
                        datos.addDatosEmpresariales(Integer.parseInt(id) - 1, ads, Tle, Puesto);
                    } else {
                        System.out.println(error.getError(2));
                    }
                    break;
                case 4:
                    System.out.println(" <  Mostrar datos empresariales >");
                    System.out.println("\n");
                    System.out.println();
                    datos.showDatosEmpleado();
                    break;

                case 5:
                    System.out.println("< Agregar datos del contrato > ");
                    entrada.nextLine();
                    System.out.println("Ingresar el id del trabajador");
                    id = entrada.nextLine();

                    if (Integer.parseInt(id) > 0 && Integer.parseInt(id) <= datos.getId()) {

                        System.out.print("Ingrese el ID del contrato: ");
                        int idContrato = entrada.nextInt();

                        entrada.nextLine();
                        System.out.println("Ingrese el numero de contrato:");
                        cont = entrada.nextLine();
                        System.out.println("Ingrese el año:");
                        annio = entrada.nextLine();
                        System.out.println("Ingrese el horario:");
                        String hor = entrada.nextLine();
                        System.out.println("Tipos de cargo disonibles:");
                        for (Cargos cargo : Cargos.values()) {
                            System.out.println(cargo.name());
                        }
                        System.out.println(" A)Sindicalizado\n B)confianza\n C)temporal\n Seleccione el tipo de cargo:");
                        String tipoCargoStr = entrada.nextLine();
                        Cargos tipoCargo = Cargos.sindicalizado;
                        switch(tipoCargoStr) {
                            case "A":
                                tipoCargo = Cargos.sindicalizado;
                                break;
                            case "B":
                                tipoCargo = Cargos.confianza;
                                break;
                            case "C":
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
                    System.out.println(" ----- Mostrando datos de los contratos ----- ");
                    datos.showContratosEmpleado(2);
                    break;

                case 7:
                    System.out.println(" ----- Sobre ITERA ----- ");
                    datos.showEmpresa();
                    break;

                case 8:
                    System.out.println("Cerrando gestor empresarial de ITERA");
                    break;

                default:
                    System.out.println(error.getError(3));
            }
        }while(op!=8);
    }
}
