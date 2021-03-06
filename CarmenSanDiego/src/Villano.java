package CarmenSanDiego.src;
import java.util.ArrayList;
import java.util.List;

public class Villano {
	private String nombre;
	private String sexo;
	private ArrayList<String> hobbies;
	private ArrayList<String> senias;
	private int ultimoIndexRandomSenias = -1;
	private int ultimoIndexRandomHobbies = -1;
	
	public Villano(String nombre, String sexo) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.hobbies = new ArrayList<String>();
		this.senias = new ArrayList<String>();
	}
	
	public Villano(String nombre, String sexo, List<String> hobbies, List<String> senias) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.hobbies = new ArrayList<String>();
		this.senias = new ArrayList<String>();
		this.hobbies.addAll(hobbies);
		this.senias.addAll(senias);
	}
	
	public String getNombre() {
		return nombre;
		}
	
	public void agregarSenia(String senia) {
		if (!senias.contains(senia)) {
			senias.add(senia);
			}
	}
		
	public void agregarHobbie(String hobbie) {
		if (!hobbies.contains(hobbie)) {
			hobbies.add(hobbie);
			}
		}
	public ArrayList<String> getHobbies(){
		return hobbies;
	}
	
	public String getSeniaRandom() {
		ultimoIndexRandomSenias = Calculo.obtenerEnteroRandomDiferenteA((senias.size()), ultimoIndexRandomSenias);
		
		return senias.get(ultimoIndexRandomSenias);
	}
	
	public String getHobbieRandom() {
		ultimoIndexRandomHobbies = Calculo.obtenerEnteroRandomDiferenteA((hobbies.size()), ultimoIndexRandomHobbies);
		
		return hobbies.get(ultimoIndexRandomHobbies);
	}
	
	public String getSexo() {
		return sexo;
	}

	public ArrayList<String> getSenias() {
		return senias;
	}
	
	public String toString(){
		return this.getNombre();
	}

}
