package imfe;

public class Main {

	public static void main(String[] args) {
		Coche ferrari = new Coche();
		
		ferrari.aceleracion +=10;
		ferrari.matricula = "FE-1111-RARI";
		
		//Si llamo un m�todo, de un objeto que vale null, provoca un null pointer exception
		for (int i=0; i<=10; i++) {
			ferrari.acelerar();
			System.out.println("La velocidad del coche es " + ferrari.velocidad + " km/h");
		}
		//Al llamar al m�todo mostrarInfo() se ejecutan las l�neas que haya en �l, y devuelve el control una vez terminado
		ferrari.mostrarInfo();
		
	}
}
