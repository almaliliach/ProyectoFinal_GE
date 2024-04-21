package gestor.archivos;//Pertenece al paquete gestor.archivos

/*Declaracion de la interfaz la cual sera necesaria en la clase ArchivoTexto */
public interface  iFileText {
  public void AbrirModoLectura();
  public String Leer();
  public void AbrirModoEscritura();
  public void Escribir(String escribir);
  public void Cerrar();
}//Final de la interfaz