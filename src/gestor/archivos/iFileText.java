package gestor.archivos;//Pertenece al paquete gestor.archivos

public interface  iFileText { //Declaracion de la interfaz
  public void AbrirModoLectura();
  public String Leer();
  public void AbrirModoEscritura();
  public void Escribir(String escribir);
  public void Cerrar();
}//Final de la interfaz