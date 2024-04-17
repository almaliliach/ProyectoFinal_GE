package gestor.archivos;//Pertenece al paquete gestor.archivos

public interface  iFileText { //Declaracion de la interfaz
    public void AbrirModoLectura ();//Declaracion de constantes publicas disponbles
    public String Leer();
    public void AbrirModoEscritura();
    public void Escribir(String a);
    public void Cerrar();
}//Final de la interfaz