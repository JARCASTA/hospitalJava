import java.util.ArrayList;

public class Usuarios{
	public static ArrayList<Doctor>doctores = new ArrayList<Doctor>();
	public static ArrayList<Paciente>pacientes = new ArrayList<Paciente>();

	
	Doctor A = new Doctor("Jose", "Ramirez", 21, "Odontologo", "JR", "123", 21);
	Doctor B = new Doctor("Bryan", "Martinez", 34, "Cirujano", "BM", "123", 22);
	Paciente PA = new Paciente("Sebastian", "Arevalo", 15, "Estudiante", "SA", "123", 23);
	Paciente PB = new Paciente("Miguel", "Higueros", 45, "Ingeniero", "MH", "123", 24);
		
	public Usuarios(){
		doctores.add(A);
		doctores.add(B);
		pacientes.add(PA);
		pacientes.add(PB);
	}
	
	public ArrayList<Doctor> getDoctores(){
		return doctores;
	}
	
	public ArrayList<Paciente> getPacientes(){
		return pacientes;
	}

}
		
		
		
		
		
		
		
		
		
		
	