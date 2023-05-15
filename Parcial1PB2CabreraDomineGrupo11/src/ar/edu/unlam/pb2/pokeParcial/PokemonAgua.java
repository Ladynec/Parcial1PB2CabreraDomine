package ar.edu.unlam.pb2.pokeParcial;

public class PokemonAgua extends Pokemon{ 
	

	private Integer ataqueChorro = 50;
	private Integer debilidadPorTipologia = 50;

	
	public PokemonAgua(String nombre) {
		super(nombre);
		
	}
	


	public Integer getAtaqueChorro() {
		return ataqueChorro;
	}

	public void setAtaqueChorro(Integer ataqueChorro) {
		this.ataqueChorro = ataqueChorro;
	}



	public Integer getDebilidadPorTipologia() {
		return debilidadPorTipologia;
	}

	


	public void setDebilidadPorTipologia(Integer debilidadPorTipologia) {
		this.debilidadPorTipologia = debilidadPorTipologia;
	}


	@Override
	public Integer atacar() {
		Integer danioTotal;
		danioTotal = this.ataqueChorro;
		return danioTotal;
		
	}


	@Override
	public Integer recibirAtaque(Integer danioRecibido) {
		Integer puntos = this.puntosDeVida - danioRecibido;
		if(puntosDeVida>=0) {
			this.estado = "derrotado";
		}
		return puntos;
	}

	@Override
	public Integer setNuevoAtaquePorDebilidad() {
		Integer resultado;
		resultado=this.ataqueChorro - this.debilidadPorTipologia;
		return resultado;
	}
	
	@Override
	public Integer setNuevoAtaquePorFortaleza() {
		Integer plus;
		plus =this.ataqueChorro+ this.fortaleza;
		return plus;
	}



	@Override
	public String toString() {
		return "PokemonAgua [ataqueChorro=" + ataqueChorro + ", debilidadPorTipologia=" + debilidadPorTipologia + "]";
	}
	
	
}
