public class Doctor extends Personas{
	String especialidad;
	int idDoctor;
	
	public Doctor(){
		super();
	}
	
	Doctor(String nombre, String apellido, int edad, String especialidad, String usuario, String contrasenia, int idDoctor){
		super(nombre,apellido,edad,usuario,contrasenia);
		this.especialidad = especialidad;
		this.idDoctor = idDoctor;
	}
	
	public void setEspecialidad(String especialidad){
		this.especialidad = especialidad;
	}
	
	public String getEspecialidad(){
		return especialidad;
	}
	
	public void setIdDoctor(int idDoctor){
		this.idDoctor = idDoctor;
	}
	
	public int getIdDoctor(){
		return idDoctor;
	}
	
}