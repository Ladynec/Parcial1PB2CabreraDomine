package ar.edu.unlam.pb2.pokeParcial;

import java.util.stream.Stream;

public abstract class Pokemon {

	private String nombre;
	protected String estado = "en guardia";
	protected Integer puntosDeVida =200;
	protected Integer ataqueGolpe = 30;
	private Integer debilidadPorTipologia;
	protected Integer fortaleza= 50;
	private boolean participado = false;
	
	public Pokemon(String nombre) {
		this.nombre = nombre;
	}
	
	
	public abstract Integer atacar(); 
	
	public abstract Integer recibirAtaque(Integer danioRecibido);

    public abstract Integer setNuevoAtaquePorDebilidad();
    
    public abstract Integer setNuevoAtaquePorFortaleza();
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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


	public Integer getPuntosDeVida() {
		return puntosDeVida;
	}


	public void setPuntosDeVida(Integer puntosDeVida) {
		this.puntosDeVida = puntosDeVida;
	}


	public Integer getFortaleza() {
		return fortaleza;
	}


	public void setFortaleza(Integer fortaleza) {
		this.fortaleza = fortaleza;
	}


	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", estado=" + estado + ", puntosDeVida=" + puntosDeVida + ", ataqueGolpe="
				+ ataqueGolpe + ", debilidadPorTipologia=" + debilidadPorTipologia + ", fortaleza=" + fortaleza + "]";
	}

	
	
	
}
