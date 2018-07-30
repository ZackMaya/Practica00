package org.gradle;

public class Ingeniero {
	private Herramienta herramienta;


	/* (non-Javadoc)
	 * @see org.gradle.Herramienta#reparar(org.gradle.Computadora)
	 */
	public void reparar(Computadora computadora){
	
		herramienta.reparar(computadora);	
	}

	//Se le asigna la responsabilidad que otorgue la herramienta
	public void setHerramienta(Herramienta herramienta) {
		this.herramienta = herramienta;
	}


}
