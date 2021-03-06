/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Fruta.
 * 
 * @author USUARIO
 */
public class Fruta {
	public Fruta(String nombre, float extension, String tiempoCosecha, float cantCosechaxtiempo, float costoPromedio,
			float precioVentaProm) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tiempoCosecha = tiempoCosecha;
		this.cantCosechaxtiempo = cantCosechaxtiempo;
		this.costoPromedio = costoPromedio;
		this.precioVentaProm = precioVentaProm;
	}

	/**
	 * Description of the property nombre.
	 */
	public String nombre = "";

	/**
	 * Description of the property extension.
	 */
	public float extension = 0F;

	/**
	 * Description of the property tiempoCosecha.
	 */
	public String tiempoCosecha = "";

	/**
	 * Description of the property cantCosechaxtiempo.
	 */
	public float cantCosechaxtiempo = 0F;

	/**
	 * Description of the property costoPromedio.
	 */
	public float costoPromedio = 0F;

	/**
	 * Description of the property precioVentaProm.
	 */
	public float precioVentaProm = 0F;

	// Start of user code (user defined attributes for Fruta)

	// End of user code

	/**
	 * The constructor.
	 */
	public Fruta() {
		// Start of user code constructor for Fruta)
		super();
		// End of user code
	}

	/**
	 * Description of the method agregarPeriodo.
	 * @param periodo 
	 * @param cantEstimada 
	 */
	public void agregarPeriodo(String periodo, float cantEstimada) {
		// Start of user code for method agregarPeriodo
		// End of user code
	}

	/**
	 * Description of the method eliminarPeriodo.
	 * @param i 
	 * @return 
	 */
	public Boolean eliminarPeriodo(int i) {
		// Start of user code for method eliminarPeriodo
		Boolean eliminarPeriodo = Boolean.FALSE;
		return eliminarPeriodo;
		// End of user code
	}

	/**
	 * Description of the method costoPeriodo.
	 * @param i 
	 * @return 
	 */
	public float costoPeriodo(int i) {
		// Start of user code for method costoPeriodo
		float costoPeriodo = 0F;
		return costoPeriodo;
		// End of user code
	}

	/**
	 * Description of the method ganancia.
	 * @param i 
	 * @return 
	 */
	public float ganancia(int i) {
		// Start of user code for method ganancia
		float ganancia = 0F;
		return ganancia;
		// End of user code
	}

	// Start of user code (user defined methods for Fruta)

	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns extension.
	 * @return extension 
	 */
	public float getExtension() {
		return this.extension;
	}

	/**
	 * Sets a value to attribute extension. 
	 * @param newExtension 
	 */
	public void setExtension(float newExtension) {
		this.extension = newExtension;
	}

	/**
	 * Returns tiempoCosecha.
	 * @return tiempoCosecha 
	 */
	public String getTiempoCosecha() {
		return this.tiempoCosecha;
	}

	/**
	 * Sets a value to attribute tiempoCosecha. 
	 * @param newTiempoCosecha 
	 */
	public void setTiempoCosecha(String newTiempoCosecha) {
		this.tiempoCosecha = newTiempoCosecha;
	}

	/**
	 * Returns cantCosechaxtiempo.
	 * @return cantCosechaxtiempo 
	 */
	public float getCantCosechaxtiempo() {
		return this.cantCosechaxtiempo;
	}

	/**
	 * Sets a value to attribute cantCosechaxtiempo. 
	 * @param newCantCosechaxtiempo 
	 */
	public void setCantCosechaxtiempo(float newCantCosechaxtiempo) {
		this.cantCosechaxtiempo = newCantCosechaxtiempo;
	}

	/**
	 * Returns costoPromedio.
	 * @return costoPromedio 
	 */
	public float getCostoPromedio() {
		return this.costoPromedio;
	}

	/**
	 * Sets a value to attribute costoPromedio. 
	 * @param newCostoPromedio 
	 */
	public void setCostoPromedio(float newCostoPromedio) {
		this.costoPromedio = newCostoPromedio;
	}

	/**
	 * Returns precioVentaProm.
	 * @return precioVentaProm 
	 */
	public float getPrecioVentaProm() {
		return this.precioVentaProm;
	}

	/**
	 * Sets a value to attribute precioVentaProm. 
	 * @param newPrecioVentaProm 
	 */
	public void setPrecioVentaProm(float newPrecioVentaProm) {
		this.precioVentaProm = newPrecioVentaProm;
	}

	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", extension=" + extension + ", tiempoCosecha=" + tiempoCosecha
				+ ", cantCosechaxtiempo=" + cantCosechaxtiempo + ", costoPromedio=" + costoPromedio
				+ ", precioVentaProm=" + precioVentaProm + "]";
	}

}
