package modelo;

public class Prestamo extends Ejemplar {
	private String fecha;
	private int dni;
	
	
	public Prestamo(String isbn, String titulo, String autor, String editorial, int edicion, int id_ejemplar,
			String fecha, int dni) {
		super(isbn, titulo, autor, editorial, edicion, id_ejemplar);
		this.fecha = fecha;
		this.dni = dni;
	}

	/**
	 * @return el fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha el fecha a establecer
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return el dni
	 */
	public int getDni() {
		return dni;
	}
	/**
	 * @param dni el dni a establecer
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}

	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Prestamo [fecha=" + fecha + ", dni=" + dni + "]";
	}
	

}
