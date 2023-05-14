package ar.edu.unlam.pb2.pokeParcial;

public class PokemonElectrico extends Pokemon{


	private Integer ataqueTrueno = 80;
	private Integer debilidadPorTipologia = 50;

	public PokemonElectrico(String nombre) {
		super(nombre);
		
	}

	@Override
	public Integer atacar() {
		Integer danioTotal;
		danioTotal = this.ataqueTrueno;
		return danioTotal;
		
	}


	@Override
	public Integer recibirAtaque(Integer danioRecibido) {
		this.puntosDeVida = this.puntosDeVida - danioRecibido;
		if(puntosDeVida<=0) {
			this.estado = "derrotado";
		}
		return this.puntosDeVida;
	}

	@Override
	public Integer setNuevoAtaquePorDebilidad() {
		Integer resultado;
		resultado=this.ataqueTrueno - this.debilidadPorTipologia;
		return resultado;
	}
	
	@Override
	public Integer setNuevoAtaquePorFortaleza() {
		Integer plus;
		plus =this.ataqueTrueno+ this.fortaleza;
		return plus;
	}



	public Integer getFortaleza() {
		return fortaleza;
	}

	public void setFortaleza(Integer fortaleza) {
		this.fortaleza = fortaleza;
	}

	public Integer getDebilidadPorTipologia() {
		return debilidadPorTipologia;
	}

	public void setDebilidadPorTipologia(Integer debilidadPorTipologia) {
		this.debilidadPorTipologia = debilidadPorTipologia;
	}

	@Override
	public String toString() {
		return "PokemonElectrico [ataqueTrueno=" + ataqueTrueno + ", debilidadPorTipologia=" + debilidadPorTipologia
				+ "]";
	}
	
	
	
}
