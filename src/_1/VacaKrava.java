package _1;

public class VacaKrava extends AnimalesZvirat{

	private String uso;
	
	public VacaKrava() {
		super();
	}

	public VacaKrava(String nombre, double peso, int edad, String uso) {
		super(nombre, peso, edad);
		this.uso = uso;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}
	
	
	
	
}
