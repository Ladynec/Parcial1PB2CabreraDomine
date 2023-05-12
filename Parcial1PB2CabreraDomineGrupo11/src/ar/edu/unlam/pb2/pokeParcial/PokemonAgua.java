package ar.edu.unlam.pb2.pokeParcial;

public class PokemonAgua extends Pokemon{ //faltan metodos de ataques
	
	private Integer puntosDeVidaAgua = 150;
	private Integer ataqueChorro = -50;
	private Integer ataqueViento = -30;
	private Integer debilidadPorTipologia = -50;

	
	public PokemonAgua(String nombre) {
		super(nombre);
		
	}

	public Integer getPuntosDeVidaAgua() {
		return puntosDeVidaAgua;
	}

	public void setPuntosDeVidaAgua(Integer puntosDeVidaAgua) {
		this.puntosDeVidaAgua = puntosDeVidaAgua;
	}

	public Integer getAtaqueChorro() {
		return ataqueChorro;
	}

	public void setAtaqueChorro(Integer ataqueChorro) {
		this.ataqueChorro = ataqueChorro;
	}

	public Integer getAtaqueViento() {
		return ataqueViento;
	}

	public void setAtaqueViento(Integer ataqueViento) {
		this.ataqueViento = ataqueViento;
	}

	public Integer getDebilidadPorTipologia() {
		return debilidadPorTipologia;
	}

	public void setDebilidadPorTipologia(Integer debilidadPorTipologia) {
		this.debilidadPorTipologia = debilidadPorTipologia;
	}

	
	
}
