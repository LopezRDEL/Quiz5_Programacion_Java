/**
 * importar libreria de listas
 */

import java.util.LinkedList;
public class Principal {
    public static void main(String[] args) {
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();

        Libro libro100AñosSoledad = new Libro("Cien años de Soledad", "Gabriel Garcia Marquez", 496);
        bibliotecaKonradLorenz.registrarLibro(libro100AñosSoledad);
        Libro libroElcódigoDaVinci= new Libro("ElcódigoDaVinci", "Dan Brown", 656);
        Libro milNovecientosOchentayCuatro = new Libro("1984", "GeorgeOrwell", 326);
        Libro ElHobbit = new Libro("ElHobbit", "J.R.R.Tolkien", 310);
        Libro LaOdisea = new Libro("LaOdisea", "Homero", 448);
    }
}
