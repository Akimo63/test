package _1;

public class OvejaOvce extends AnimalesZvirat{

	private String pelo;

	public OvejaOvce() {
		super();
	}

	public OvejaOvce(String nombre, double peso, int edad, String pelo) {
		super(nombre, peso, edad);
		this.pelo = pelo;
	}

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}
	
	
	
	
	
	
}