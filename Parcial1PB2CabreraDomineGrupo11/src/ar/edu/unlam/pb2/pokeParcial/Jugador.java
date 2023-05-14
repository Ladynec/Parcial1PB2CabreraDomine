package ar.edu.unlam.pb2.pokeParcial;

public class Jugador {

	private String nombre;
	private ManoCartas mano;


	public Jugador(String nombre, ManoCartas mano) {
		super();
		this.nombre = nombre;
		this.mano = mano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ManoCartas getMano() {
		return mano;
	}

	public void setMano(ManoCartas mano) {
		this.mano = mano;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", mano=" + mano + "]";
	}
	
    
}
