import java.util.Scanner;
import java.util.ArrayList;

public class Hospital{
	public static ArrayList<Doctor> listadedoctores;
	public static ArrayList<Paciente> listadepacientes;
	public static ArrayList<Citas> A;
	public static ArrayList<Citas> B;
	public static ArrayList<Citas> listadecitas;
	public static ArrayList<Paciente> PA;
	public static ArrayList<Paciente> PB;
	public static void main(String args[]){
		Scanner tecla = new Scanner(System.in);
		Usuarios us = new Usuarios();
		Clinicas cita = new Clinicas();
		int ID;
		int dia;
		int mes;
		String username;
		String contrasenia;
		String nombre;
		String apellido;
		String hora;
		String op;
		String repetir = null;
		listadedoctores = us.getDoctores();
		listadepacientes = us.getPacientes();
		A = cita.getA();
		B = cita.getB();
		PA = cita.getPA();
		PB = cita.getPB();
		do{
			int contador = 0;
			System.out.println("-------------------------------------------------");
			System.out.println("|Hospital|");
			System.out.println("-------------------------------------------------");
			System.out.println("|Ingrese su nombre de usuario|");
			username = tecla.next();
			System.out.println("-------------------------------------------------");
			System.out.println("|Ingrese su password|");
			contrasenia = tecla.next();

			for(int i=0;(i<listadedoctores.size())||(i<listadepacientes.size());i++){
				contador +=i;
				if(((username.equals(listadedoctores.get(i).getUsuario()))&&(contrasenia.equals(listadedoctores.get(i).getContrasenia())))||((username.equals(listadepacientes.get(i).getUsuario()))&&(contrasenia.equals(listadepacientes.get(i).getContrasenia())))){
					contador -= 1;
					System.out.println("|         Ingrese su ID	        |");
					ID = tecla.nextInt();
		
				if(ID == listadedoctores.get(i).getIdDoctor()){
						System.out.println("|			Bienvenido			|");
						do{
							int contador2 = 0;
						System.out.println("|	¿Que desea realizar?	|");
						System.out.println("A. Revisar citas");
						System.out.println("B. Datos de pacientes");
						char sw = tecla.next().charAt(0);
						switch(sw){
							case 'A':
								System.out.println("Ingrese la fecha del dia a consultar");
								System.out.println("Dia:");
								dia = tecla.nextInt();
								System.out.println("Mes:"); 
								mes = tecla.nextInt();
								if(ID == listadedoctores.get(0).getIdDoctor()){
									//int contador2 = 0;
									if(A.size() != 0){
										for(int j=0;j<A.size();j++){
											contador2 +=j;
											if((dia == A.get(j).getDia())&&(mes == A.get(j).getMes())){
												contador2 -= 1;
												System.out.println(A.get(j).getApellido() + ", " + A.get(j).getNombre() + "\nEdad: " + PA.get(j).getEdad() + "\nOcupacion: " + PA.get(j).getOcupacion() + "\nHora: " + A.get(j).getHora());
											}else if((contador2 -1) == (A.size())){
												System.out.println("Sin citas");
											}
										}
									}else{
										System.out.println("No hay citas");
									}
								break;
								}else if(ID == listadedoctores.get(1).getIdDoctor()){
									if(B.size() != 0){
										for(int j=0;j<B.size();j++){
											if((dia == B.get(j).getDia())&&(mes == B.get(j).getMes())){
												System.out.println(B.get(j).getApellido() + ", " + B.get(j).getNombre() + "\nEdad: " + PB.get(j).getEdad() + "\nOcupacion: " + PB.get(j).getOcupacion() + "\nHora: " + B.get(j).getHora());
											}else{
												System.out.println("No hay citas");
											}
										}
									}else{
										System.out.println("No hay citas");
									}
								break;
								}
							case 'B':
								if(ID == listadedoctores.get(i).getIdDoctor()){
									if(PA.size() != 0){
										for(int p=0;p<PA.size();p++){
											System.out.println(PA.get(p).getApellido() + ", " + PA.get(p).getNombre() + ", " + PA.get(p).getEdad() + ", " + PA.get(p).getOcupacion());
										}
									}else{
										System.out.println("Sin pacientes para mostrar");
									}
								}else if(ID == listadedoctores.get(i).getIdDoctor()){
									if(PB.size() != 0){
										for(int p=0;p<PB.size();p++){
											System.out.println(PB.get(p).getApellido() + ", " + PB.get(p).getNombre() + ", " + PB.get(p).getEdad() + ", " + PB.get(p).getOcupacion());
										}
									}else{
										System.out.println("Sin pacientes para mostrar");
									}
								}
								break;
							default:
					
								break;	
						}
						System.out.println("¿Quiere regresar al menu anterior?");
						repetir = new Scanner(System.in).nextLine();
						}while (repetir.equals("si") || repetir.equals("Si"));
					}else if((Integer.toString(ID).length() == 5)&&(ID == listadepacientes.get(i).getIdPaciente())){
						System.out.println("|			Bienvenido 			|");
						do{
						System.out.println("|	¿Que desea realizar?	|");
						System.out.println("A. Reservar una cita");
						System.out.println("B. Consultar doctor");
						char sw = tecla.next().charAt(0);
						
							switch(sw){
								case 'A':
										System.out.println("Ingrese su nombre:");
										nombre = tecla.next();
										System.out.println("Ingrese su apellido:");
										apellido = tecla.next();
										
									do{
										System.out.println("Desea realizar cita por doctor o por consulta?");
										String c = tecla.next();
		
										if(c.equals("Doctor")){
											System.out.println("Seleccione el doctor con quien desea realizar la cita");
											System.out.println("A. Jose Ramirez");
											System.out.println("B. Bryan Martinez");
											sw = tecla.next().charAt(0);
											switch(sw){
												case 'A':
													System.out.println("Indique la fecha y hora en que desea realizar la cita");
													System.out.println("Dia:");
													dia = tecla.nextInt();
													System.out.println("Mes:");
													mes = tecla.nextInt();
													System.out.println("Hora:");
													hora = tecla.next();
										
													for(int j=0;j<A.size();j++){
														if((dia == (A.get(j).getDia()))&&(mes == (A.get(j).getMes())&&(hora.equals((A.get(j).getHora()))))){
															System.out.println("Cita no disponible");
														}
													}
													A.add(new Citas(nombre, apellido, dia, mes, hora));
													PA.add(listadepacientes.get(i));
													break;
												case 'B':
													System.out.println("Ingrese la fecha y hora en que desea realizar la cita");
													System.out.println("Dia:");
													dia = tecla.nextInt();
													System.out.println("Mes:");
													mes = tecla.nextInt();
													System.out.println("Hora:");
													hora = tecla.next();
										
													for(int j=0;j<B.size();j++){
														if((dia == (B.get(j).getDia()))&&(mes == (B.get(j).getMes())&&(hora.equals((B.get(j).getHora()))))){
															System.out.println("Cita no disponible");
														}
													}
													B.add(new Citas(nombre, apellido, dia, mes, hora));
													PB.add(listadepacientes.get(i));
													break;
												default:
													System.out.println("Opcion no valida");
													break;
											}
										}else if(c.equals("Consulta")){
											System.out.println("A. Jovenes");
											System.out.println("B. Adultos");
											sw = tecla.next().charAt(0);
											
											switch(sw){
												case 'A':
													for(int d=0;d<listadedoctores.size();d++){
														if(listadedoctores.get(d).getEspecialidad().equals("Odontologo")){
															System.out.println("Se recomienda cita con el doctor "+ listadedoctores.get(d).getNombre() + " " + listadedoctores.get(d).getApellido());
															System.out.println("Realizar cita?");
															c = tecla.next();
															
															if(c.equals("Si")||c.equals("si")){
																System.out.println("Indique la fecha y hora en que desea realizar la cita");
																System.out.println("Dia:");
																dia = tecla.nextInt();
																System.out.println("Mes:");
																mes = tecla.nextInt();
																System.out.println("Hora:");
																hora = tecla.next();
										
																for(int j=0;j<B.size();j++){
																	if((dia == (B.get(j).getDia()))&&(mes == (B.get(j).getMes())&&(hora.equals((B.get(j).getHora()))))){
																		System.out.println("Cita no disponible");
																	}
																}
																B.add(new Citas(nombre, apellido, dia, mes, hora));
															}
														}
													}
													break;
												case 'B':
													for(int d=0;d<listadedoctores.size();d++){
														if(listadedoctores.get(d).getEspecialidad().equals("Cirujano")){
															System.out.println("Se recomienda cita con el doctor "+ listadedoctores.get(d).getNombre() + " " + listadedoctores.get(d).getApellido());
															System.out.println("Realizar cita?");
															c = tecla.next();
															
															if(c.equals("Si")||c.equals("si")){
																System.out.println("Indique la fecha y hora en que desea realizar la cita");
																System.out.println("Dia:");
																dia = tecla.nextInt();
																System.out.println("Mes:");
																mes = tecla.nextInt();
																System.out.println("Hora:");
																hora = tecla.next();
										
																for(int j=0;j<A.size();j++){
																	if((dia == (A.get(j).getDia()))&&(mes == (A.get(j).getMes())&&(hora.equals((A.get(j).getHora()))))){
																		System.out.println("Cita no disponible");
																	}
																}
																A.add(new Citas(nombre, apellido, dia, mes, hora));
															}
														}
													}
													break;
											}
										}
										System.out.println("Desea realizar otra cita?");
										op = tecla.next();
										}while(op.equals("si") || op.equals("Si"));
									
								break;
							case 'B':
								for(int doc=0;doc<listadedoctores.size();doc++){
											System.out.println(listadedoctores.get(doc).getApellido() + ", " + listadedoctores.get(doc).getNombre() + ", " + listadedoctores.get(doc).getEdad() + ", " + listadedoctores.get(doc).getEspecialidad());
										}
								break;
							default:
								System.out.println("Opcion no valida");
								break;	
							}
						System.out.println("Desea regresar al menu anterior?");
						repetir = new Scanner(System.in).nextLine();
						}while (repetir.equals("si") || repetir.equals("Si"));
					}else{
						System.out.println("ID no valido");
					}
					
				}else if(((contador +1) == (listadedoctores.size()))||(contador == (listadepacientes.size())) ){
					System.out.println("Nombre de usuario o password no validos");
					break;
				}
			}
		System.out.println("Desea regresar al menu principal?");
		repetir = new Scanner(System.in).nextLine();
		}while (repetir.equals("si") || repetir.equals("Si"));
	}
}