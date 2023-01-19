package es.Studium.Ejemplo1;

public class Test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub		//En la main utilizamos el constructor que queramos,en las otras utilizamos los 2
		PersonaEJ persona1= new PersonaEJ();	//Creamos un objeto utilizando la clase Persona
		
		persona1.setNombre("Curro");
		persona1.setApellidos("Correa");
		persona1.setEdad(18);
		persona1.setHaPagado(false);
		persona1.setAula(2);
	
		Empleado empleado1= new Empleado("Curro","Correa Silva","64567809F","Avd Huerto","informático",645709832);
		
		System.out.println(persona1.getNombre()+" "+persona1.getApellidos()+" "+persona1.getEdad()+" "+persona1.getAula()+" "+persona1.isHaPagado());
		
		System.out.println(empleado1.getNombre()+" "+empleado1.getApellidos()+" "+empleado1.getDni()+" "+empleado1.getDomicilio()+" "+empleado1.getPuesto()+" "+empleado1.getTelefono());
		
	}
	
	

}
