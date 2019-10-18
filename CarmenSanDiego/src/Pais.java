package CarmenSanDiego.src;
import java.util.List;

public class Pais {
	private String nombre;
	private List<String> caracteristicas;
	private List<Lugar> lugares;
	private List<Pais> conexiones;
	
	Pais(String nombre,List<String> caracteristicas,List<Lugar> lugares){
		this.nombre=nombre;
		this.caracteristicas=caracteristicas;
		this.lugares=lugares;
		
	}
	
	public void asignarConexion(Pais pais) {
		conexiones.add(pais);
	}
	
	public boolean hayConexion(Pais pais) {
		return conexiones.contains(pais);
	}

	public String getNombre() {
		return nombre;
	}

	public List<String> getCaracteristicas() {
		return caracteristicas;
	}

	public List<Lugar> getLugares() {
		return lugares;
	}

	public List<Pais> getConexiones() {
		return conexiones;
	}
	
	
}
