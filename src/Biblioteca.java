import java.util.LinkedList;

public class Biblioteca {
    public LinkedList<Libro> librosDisponibles = new LinkedList<Libro>();

    public void registrarLibro(Libro libro){
        librosDisponibles.add(libro);
    }
}
