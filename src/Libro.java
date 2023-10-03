
public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    /**Complejidadtemporal:O(1)Tiempoconstante.
     *
     * @param titulo
     * @param autor
     * @param numeroPaginas
     */
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**Complejidadtemporal:O(1)Tiempoconstante.
     *
     * @return
     */
    public String getTitulo() {
        return titulo;
    }

    /**Complejidadtemporal:O(1)Tiempoconstante.
     *
     * @return
     */
    public String getAutor() {
        return autor;
    }

    /**Complejidadtemporal:O(1)Tiempoconstante.
     *
     * @return
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    /**Complejidadtemporal:O(1)Tiempoconstante.
     *
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**Complejidadtemporal:O(1)Tiempoconstante.
     *
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**Complejidadtemporal:O(1)Tiempoconstante.
     *
     * @param numeroPaginas
     */
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}

