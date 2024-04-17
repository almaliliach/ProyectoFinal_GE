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
    }
}