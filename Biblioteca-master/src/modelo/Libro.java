package modelo;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private String editorial;
	private int edicion;
	
	public Libro(String isbn, String titulo, String autor, String editorial, int edicion) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.edicion = edicion;
	}

	/**
	 * @return el isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn el isbn a establecer
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return el titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo el titulo a establecer
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return el autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor el autor a establecer
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return el editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial el editorial a establecer
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return el edicion
	 */
	public int getEdicion() {
		return edicion;
	}

	/**
	 * @param edicion el edicion a establecer
	 */
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial
				+ ", edicion=" + edicion + "]";
	}
	
	
}
