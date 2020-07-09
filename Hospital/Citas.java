public class Citas{
	int dia,mes;
	String hora,nombre,apellido;

	public Citas(){
	}
	
	Citas(String nombre, String apellido, int dia,int mes,String hora){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dia = dia;
		this.mes = mes;
		this.hora = hora;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre(){
		return nombre;
	}
	
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	public String getApellido(){
		return apellido;
	}
	
	public void setDia(int dia){
		this.dia = dia;
	}
	public int getDia(){
		return dia;
	}
	
	public void setMes(int mes){
		this.mes = mes;
	}
	public int getMes(){
		return mes;
	}
	
	public void setHora(String hora){
		this.hora = hora;
	}
	public String getHora(){
		return hora;
	}
}