package modelo;

public class Ejemplar extends Libro {

	private int id_ejemplar;

	public Ejemplar(String isbn, String titulo, String autor, String editorial, int edicion, int id_ejemplar) {
		super(isbn, titulo, autor, editorial, edicion);
		this.id_ejemplar = id_ejemplar;
	}

	/**
	 * @return el id_ejemplar
	 */
	public int getId_ejemplar() {
		return id_ejemplar;
	}

	/**
	 * @param id_ejemplar el id_ejemplar a establecer
	 */
	public void setId_ejemplar(int id_ejemplar) {
		this.id_ejemplar = id_ejemplar;
	}

	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ejemplar [id_ejemplar=" + id_ejemplar + ", getIsbn()=" + getIsbn() + ", getTitulo()=" + getTitulo()
				+ ", getAutor()=" + getAutor() + ", getEditorial()=" + getEditorial() + ", getEdicion()=" + getEdicion()
				+ "]";
	}
	
	
	
}
