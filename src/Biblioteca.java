/**Importar libreria de listas
 *
 */

import java.util.LinkedList;

/**Complejidadtemporal:O(1)Tiempoconstante.
 *
 */
public class Biblioteca {
    public LinkedList<Libro> librosDisponibles = new LinkedList<Libro>();

    /**Complejidadtemporal:O(1)Tiempoconstante.
     *
     * @param libro
     */
    public void registrarLibro(Libro libro){
        librosDisponibles.add(libro);
    }

    /**Complejidadlineal:O(N)Tiempolineal.
     *
     * @param titulo
     * @return
     */
    public Libro buscarLibro(String titulo){
        for (int i=0; i<librosDisponibles.size();i++){
            Libro libroBuscado = librosDisponibles.get(i);
            if (libroBuscado.getTitulo().equals(titulo)){
                return libroBuscado;
            }
        }
        return null;
    }

    /**Complejidadtemporal:O(1)Tiempoconstante.
     *
     * @return
     */
    public LinkedList<Libro> mostrarLibrosDisponibles() {
        return librosDisponibles;
    }
}
