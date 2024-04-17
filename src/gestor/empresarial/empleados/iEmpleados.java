package gestor.empresarial.empleados;

import gestor.archivos.*; //importacion de los diferentes paquetes que se utilizaran
import gestor.errores.*;
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.*;
import gestor.empresarial.empleados.*;
import gestor.empresarial.empresa.*;
public  interface  iEmpleados { //Declaracion de la interfaz
    public String getinfoEmpleado(int empleado); //Declaracion de constantes disponibles

    public String getInfoEmpleado(String empleado);

    public void showDatosEmpleado();

    public int getAntiguedad(int Ai);
}