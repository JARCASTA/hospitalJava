public class Personas{
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected String usuario;
	protected String contrasenia;
	
	public Personas(){	
	}
	
	Personas(String nombre, String apellido, int edad, String usuario, String contrasenia){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}public void setApellido(String apellido){
		this.apellido = apellido;
	}

	public String getApellido(){
		return apellido;
	}public void setUsuario(String usuario){
		this.usuario = usuario;
	}
	
	public void setEdad(){
		this.edad = edad;
	}
	
	public int getEdad(){
		return edad;

	}
	
	public String getUsuario(){
		return usuario;
	}
	
	public void setContrasenia(String contrasenia){
		this.contrasenia = contrasenia;
	}

	public String getContrasenia(){
		return contrasenia;
	}
	
}