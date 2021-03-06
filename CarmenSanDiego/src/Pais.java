package CarmenSanDiego.src;
import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nombre;
	private ArrayList<String> caracteristicas;
	private ArrayList<Lugar> lugares;
	private ArrayList<Pais> conexiones;
	private int ultimoIndexRandomCaracteristicas = -1;
	
	public Pais(String nombre,List<String> caracteristicas,List<Lugar> lugares){
		this.nombre = nombre;
		this.caracteristicas = new ArrayList<String>();
		this.caracteristicas.addAll(caracteristicas);
		this.lugares= new ArrayList<Lugar>();
		this.lugares.addAll(lugares);
		this.conexiones = new ArrayList<Pais>();
	}
	
	public void agregarLugar(Lugar lugar) {
		this.lugares.add(lugar);
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
	
	public String getCaracteristicaRandom() {

		ultimoIndexRandomCaracteristicas = Calculo.obtenerEnteroRandomDiferenteA(caracteristicas.size(), ultimoIndexRandomCaracteristicas);
		
		return caracteristicas.get(ultimoIndexRandomCaracteristicas);
	}
	
	public List<Lugar> getLugares() {
		return lugares;
	}

	public List<Pais> getConexiones() {
		return conexiones;
	}
	
	public Lugar getLugarRandom() {
		if( lugares == null ) return null;
		
		int idLugarRandom = Calculo.obtenerEnteroRandom(this.lugares.size());
		
		return this.lugares.get(idLugarRandom);
	}
	
}
