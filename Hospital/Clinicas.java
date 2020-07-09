import java.util.ArrayList;

public class Clinicas{
	public ArrayList<Citas>A = new ArrayList<Citas>();
	public ArrayList<Citas>B = new ArrayList<Citas>();
	public ArrayList<Paciente> PA = new ArrayList<Paciente>();
	public ArrayList<Paciente> PB = new ArrayList<Paciente>();
	public Clinicas(){}
	
	public ArrayList<Citas> getA(){
		return A;
	}
	
	public ArrayList<Citas> getB(){
		return B;
	}
	
	public ArrayList<Paciente> getPA(){
		return PA;
	}
	
	public ArrayList<Paciente> getPB(){
		return PB;
	}
}