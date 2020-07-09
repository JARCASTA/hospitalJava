public class Paciente extends Personas{
	String ocupacion;
	int idPaciente;
	
	public Paciente(){
		super();
	}
	
	Paciente(String nombre, String apellido, int edad, String ocupacion, String usuario, String contrasenia, int idPaciente){
		super(nombre,apellido,edad,usuario,contrasenia);
		this.ocupacion = ocupacion;
		this.idPaciente = idPaciente;
	}
	
	public void setOcupacion(String ocupacion){
		this.ocupacion = ocupacion;
	}
	
	public String getOcupacion(){
		return ocupacion;
	}
	
	public void setIdPaciente(int idPaciente){
		this.idPaciente = idPaciente;
	}
	
	public int getIdPaciente(){
		return idPaciente;
	}
	
}