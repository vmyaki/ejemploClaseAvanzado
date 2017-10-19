package imfe;

public class Coche {
	//Atributos
	String matricula;
	String color;
	int velocidad;
	int aceleracion;

	//Constructor
	//El constructor se va a encargar de inicializar los atributos en el momento de la creación del objeto
	public Coche() {
		matricula = "XXXX-XXX";
		color = "Sin pintura";
		velocidad = 0;
		aceleracion = 5;
	}
	
	//Métodos
	public void acelerar() {
		velocidad += aceleracion;
	}
	
	public void mostrarInfo() {
		System.out.println("ID          : " + matricula);
		System.out.println("Color       : " + color);
		System.out.println("Speed       : " + velocidad + " km/h");
		System.out.println("Aceleration : " + aceleracion);
	}
	

}