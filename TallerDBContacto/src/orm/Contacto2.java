/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package orm;

public class Contacto2 {
	public Contacto2() {
	}
	
	private int uid;
	
	private String nombre;
	
	private String apellido;
	
	private String mail;
	
	private String telefono;
	
	private String rut;
	
	private String direccion;
	
	private Integer sexo;
	
	/**
	 * Clave primaria
	 */
	private void setUid(int value) {
		this.uid = value;
	}
	
	/**
	 * Clave primaria
	 */
	public int getUid() {
		return uid;
	}
	
	public int getORMID() {
		return getUid();
	}
	
	/**
	 * Nombre
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	/**
	 * Nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Apellido
	 */
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	/**
	 * Apellido
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Mail
	 */
	public void setMail(String value) {
		this.mail = value;
	}
	
	/**
	 * Mail
	 */
	public String getMail() {
		return mail;
	}
	
	/**
	 * Telefono
	 */
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	/**
	 * Telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	
	public void setRut(String value) {
		this.rut = value;
	}
	
	public String getRut() {
		return rut;
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setSexo(int value) {
		setSexo(new Integer(value));
	}
	
	public void setSexo(Integer value) {
		this.sexo = value;
	}
	
	public Integer getSexo() {
		return sexo;
	}
	
	public String toString() {
		return String.valueOf(getUid());
	}
	
}
