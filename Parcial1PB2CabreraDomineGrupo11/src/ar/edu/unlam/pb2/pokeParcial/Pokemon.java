package ar.edu.unlam.pb2.pokeParcial;

public class Pokemon {

	private String nombre;
	private Integer puntosDeVida = 50;
	private Integer ataqueGolpe = -30;
	private Integer debilidadPorTipologia = -10;
	
	public Pokemon(String nombre) {
		this.nombre = nombre;
	}
	


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPuntosDeVida() {
		return puntosDeVida;
	}

	public void setPuntosDeVida(Integer puntosDeVida) {
		this.puntosDeVida = puntosDeVida;
	}

	public Integer getAtaqueGolpe() {
		return ataqueGolpe;
	}

	public void setAtaqueGolpe(Integer ataqueGolpe) {
		this.ataqueGolpe = ataqueGolpe;
	}

	public Integer getDebilidadPorTipologia() {
		return debilidadPorTipologia;
	}

	public void setDebilidadPorTipologia(Integer debilidadPorTipologia) {
		this.debilidadPorTipologia = debilidadPorTipologia;
	}
	
	
}
