package ar.edu.unlam.pb2.pokeParcial;

public class PokemonFuego extends Pokemon{ 
	

	private Integer ataqueLanzallamas = 100;

	private Integer debilidadPorTipologia = 50;

	public PokemonFuego(String nombre) {
		super(nombre);
		
	}

	@Override
	public Integer atacar() {
		Integer danioTotal;
		danioTotal = this.ataqueLanzallamas ;
		return danioTotal;
		
	}


	@Override
	
		public Integer recibirAtaque(Integer danioRecibido) {
			Integer puntos = this.puntosDeVida - danioRecibido;
			if(puntosDeVida<=0) {
				this.estado = "derrotado";
			}
			return puntos;
		}

	@Override
	public Integer setNuevoAtaquePorDebilidad() {
		Integer resultado;
		resultado=this.ataqueLanzallamas - this.debilidadPorTipologia;
		return resultado;
	}
	
	@Override
	public Integer setNuevoAtaquePorFortaleza() {
		Integer plus;
		this.ataqueLanzallamas = this.ataqueLanzallamas+ fortaleza;
		plus = this.ataqueLanzallamas;
		return plus;
	}

	@Override
	public String toString() {
		return "PokemonFuego [ataqueLanzallamas=" + ataqueLanzallamas + ", debilidadPorTipologia="
				+ debilidadPorTipologia + "]";
	}

	
}
