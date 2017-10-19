package imfe;

public class Main {

	public static void main(String[] args) {
		Coche ferrari = new Coche();
		
		ferrari.aceleracion +=10;
		ferrari.matricula = "FE-1111-RARI";
		
		//Si llamo un método, de un objeto que vale null, provoca un null pointer exception
		for (int i=0; i<=10; i++) {
			ferrari.acelerar();
			System.out.println("La velocidad del coche es " + ferrari.velocidad + " km/h");
		}
		//Al llamar al método mostrarInfo() se ejecutan las líneas que haya en él, y devuelve el control una vez terminado
		ferrari.mostrarInfo();
		
	}
}
