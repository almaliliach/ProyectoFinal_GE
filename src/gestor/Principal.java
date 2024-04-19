package gestor;

import gestor.empresarial.datos.DatosPersonales;

import java.util.Scanner;

public class Principal {//Clase Principal
    public static void main(String[] arg){
        //DATOS PERSONALES
        String nombre;
        String apellido;
        String correo;
        String whatsapp;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloca el nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Coloca los apellidos:  ");
        apellido = scanner.nextLine();

        System.out.println("Ingrese el correo: ");
        correo = scanner.nextLine();

        System.out.println("Teclee el numero de WhatsApp: ");
        whatsapp = scanner.nextLine();
        DatosPersonales dat;



        //DATOS EMPRESARIALES
        Scanner dp = new Scanner(System.in);
        String adscripcion;
        String telefonoExterior;
        String puesto;
        System.out.print("DATOS EMPRESARIALES\n");

        System.out.print("Ingrese la adscripcion: ");
        adscripcion=dp.nextLine();

        System.out.print("Ingrese el telefono exterior: ");
        telefonoExterior = dp.nextLine();

        System.out.print("Ingrese el puesto correspondiente: ");
        puesto = dp.nextLine();
    }


}