package persona;

public class Persona {
	
	private String nombre;
	private String apellido;
	private String dni;
	private int edad;
	private double altura;
	private double peso;
	private String estado;
	
	public Persona (String nombre, String apellido, String dni, int edad, double altura, double peso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.estado = "Parado";
	}
	
	public void caminar() {
		String estado = "Caminando";
	}
	
	public void sentarse() {
		String estado = "Sentado";
	}
	
	public void pararse() {
		String estado = "Parado";
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void cumplir() {
		edad += 1;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void engordar(float peso) {
		this.peso = peso + this.peso;
	}
	
	public void adelgazar(float peso) {
		this.peso = peso - this.peso;
	}
	
	

}
