/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package app.ito.poo;

import app.ito.poo.Ubicacion;
import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of CuerpoCeleste.
 * 
 * @author USUARIO
 */
public class CuerpoCeleste {
	public CuerpoCeleste(String nombre, HashSet<Ubicacion> localizaciones, String composicion) {
		super();
		this.nombre = nombre;
		this.localizaciones = localizaciones;
		this.composicion = composicion;
	}

	/**
	 * Description of the property nombre.
	 */
	public String nombre = "";

	/**
	 * Description of the property localizaciones.
	 */
	public HashSet<Ubicacion> localizaciones = new HashSet<Ubicacion>();

	/**
	 * Description of the property composicion.
	 */
	public String composicion = "";

	// Start of user code (user defined attributes for CuerpoCeleste)

	// End of user code

	/**
	 * The constructor.
	 */
	public CuerpoCeleste() {
		// Start of user code constructor for CuerpoCeleste)
		super();
		// End of user code
	}

	/**
	 * Description of the method desplazamiento.
	 * @param i 
	 * @param j 
	 * @return 
	 */
	public float desplazamiento(int i, int j) {
		// Start of user code for method desplazamiento
		float desplazamiento = 0F;
		return desplazamiento;
		// End of user code
	}

	// Start of user code (user defined methods for CuerpoCeleste)

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
	 * Returns localizaciones.
	 * @return localizaciones 
	 */
	public HashSet<Ubicacion> getLocalizaciones() {
		return this.localizaciones;
	}

	/**
	 * Returns composicion.
	 * @return composicion 
	 */
	public String getComposicion() {
		return this.composicion;
	}

	/**
	 * Sets a value to attribute composicion. 
	 * @param newComposicion 
	 */
	public void setComposicion(String newComposicion) {
		this.composicion = newComposicion;
	}

}
