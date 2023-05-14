package ar.edu.unlam.pb2.pokeParcial;

public class PokemonPlanta extends Pokemon{ 

	
	private Integer ataqueHojasCuchillas = 30;
	private Integer debilidadPorTipologia = 50;
	
	public PokemonPlanta(String nombre) {
		super(nombre);
		
	}

	@Override
	public Integer atacar() {
		Integer danioTotal;
		danioTotal = this.ataqueHojasCuchillas;
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
		resultado=this.ataqueHojasCuchillas - this.debilidadPorTipologia;
		return resultado;
	}
	
	@Override
	public Integer setNuevoAtaquePorFortaleza() {
		Integer plus;
		plus =this.ataqueHojasCuchillas+ this.fortaleza;
		return plus;
	}

	@Override
	public String toString() {
		return "PokemonPlanta [ataqueHojasCuchillas=" + ataqueHojasCuchillas + ", debilidadPorTipologia="
				+ debilidadPorTipologia + "]";
	}


	
}
