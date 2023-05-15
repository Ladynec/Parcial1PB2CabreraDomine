package ar.edu.unlam.pb2.pokeParcial;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testBatalla {

	@Test
	public void queSeleccionealeatoriamenteelPrimerJugador() { //hecho por noelia
		ManoCartas manoJugador1 =new ManoCartas(7);
		ManoCartas manoJugador2 =new ManoCartas(7);
		Jugador jugador1 = new Jugador("Juan", manoJugador1);
		Jugador jugador2 = new Jugador("Ana", manoJugador2);
		Batalla nuevaBatalla = new Batalla(jugador1, jugador2);
		Jugador elPrimeroEnJugar = nuevaBatalla.seleccionarElJugadorQueJuegaPrimero(jugador1, jugador2);
		assertTrue(elPrimeroEnJugar == jugador1 || elPrimeroEnJugar == jugador2);
	}
	
	@Test
	public void queUnPokemonAGuaAlAtacarUnPokemonElectricoSuAtaqueSeaDe0PuntosDeVidaPorSuDebilidadPorTipologia() { //hecho por noelia
		PokemonAgua pokemonAtacante = new PokemonAgua("Squirtle");
		PokemonElectrico pokemonVictima = new PokemonElectrico("Pikachu");
		Integer ataque = pokemonAtacante.atacar();
		 ataque = pokemonAtacante.setNuevoAtaquePorDebilidad();
		pokemonVictima.recibirAtaque(ataque);
		Integer puntosDeAtaqueEsperados = 0;
		assertEquals(puntosDeAtaqueEsperados,ataque);
		
	}
	
	@Test
	public void queUnPokemonFuegoAlAtacarUnPokemonAguaSuAtaqueSea50PuntosMasFuerte() { // hecho por noelia (el ataque del pokemon fuego equivale a 50 puntos)
		PokemonAgua pokemonVictima = new PokemonAgua("Squirtle");
		PokemonFuego pokemonAtacante = new PokemonFuego("Charizar");
		Integer ataque = pokemonAtacante.setNuevoAtaquePorFortaleza(); 
		 ataque = pokemonAtacante.atacar();
		pokemonVictima.recibirAtaque(ataque);
		Integer puntosDeAtaqueEsperados = 150;
		assertEquals(puntosDeAtaqueEsperados, ataque);
	}
	
	@Test
	public void queUnAtaqueDeUnPokemonAguaSeaDe50puntos() { //hecho por noelia
		PokemonAgua pokemonAtacante = new PokemonAgua("Squirtle");
		PokemonAgua pokemonVictima = new PokemonAgua("Squirtle");
		Integer ataque = pokemonAtacante.atacar();
		Integer puntosDeAtaqueEsperados = 50;
		assertEquals(puntosDeAtaqueEsperados, ataque);
	}
	
	// hechos por yanina


@Test	
	public void queAlRecibirUnDanioMayorASusPuntosDeVidaElPokemonSeaEliminado() { //Creado por Dominé Yanina
		//Datos de entrada
		ManoCartas manoJugador1 =new ManoCartas(7);
		ManoCartas manoJugador2 =new ManoCartas(7);
		Jugador jugadorUno = new Jugador("Yanina", manoJugador1);
		Jugador jugadorDos = new Jugador("noelia", manoJugador2);
		Batalla nuevaBatalla = new Batalla(jugadorUno, jugadorDos);
		
		//Ejecucion
		nuevaBatalla.seleccionarElJugadorQueJuegaPrimero(jugadorUno, jugadorDos);
		nuevaBatalla.batallar(jugadorUno, jugadorDos);
		Boolean eliminado = nuevaBatalla.getEliminado();
		//Validacion
		assertFalse(eliminado);
	}
/*@Test
	public void queElOrdenDeCartasUsadasEnUnaBatallaSeaAleatoria() { //Creado por Dominé Yanina
		//Datos de entrada
		ManoCartas manoJugador1 =new ManoCartas(7);
		ManoCartas manoJugador2 =new ManoCartas(7);
		Jugador jugadorUno = new Jugador("Yanina", manoJugador1);
		Jugador jugadorDos = new Jugador("noelia", manoJugador2);
		Batalla nuevaBatalla = new Batalla(jugadorUno, jugadorDos);
		
		//Ejecucion
		nuevaBatalla.seleccionarElJugadorQueJuegaPrimero(jugadorUno, jugadorDos);
		nuevaBatalla.batallar(jugadorUno, jugadorDos);
		Boolean ordenado = nuevaBatalla.mazoJugador1Aleatorio();
		//Validacion
		assertFalse(ordenado);
	}*/
/*@Test //*
	public void queNoHayaCoincidenciasEnLasCartasDeLosMazosDeCartasDeAmbosJugadores() { //Creado por Dominé Yanina
		//Datos de entrada
		ManoCartas manoJugador1 =new ManoCartas(7);
		ManoCartas manoJugador2 =new ManoCartas(7);
		Jugador jugadorUno = new Jugador("Yanina", manoJugador1);
		Jugador jugadorDos = new Jugador("noelia", manoJugador2);
		Batalla nuevaBatalla = new Batalla(jugadorUno, jugadorDos);
		
		//Ejecucion
		nuevaBatalla.seleccionarElJugadorQueJuegaPrimero(jugadorUno, jugadorDos);
		nuevaBatalla.batallar(jugadorUno, jugadorDos);
		Boolean noRepe = nuevaBatalla.noCartasRepetidas();
		//Validacion
		assertFalse(noRepe);
	}

/*@Test //*
    public void queSiLaCantidadDePokemonEnGuardiaEsElMismoAlTerminarLasRondasDeEmpate() { //Creado por Dominé Yanina
	//Datos de entrada
	ManoCartas manoJugador1 =new ManoCartas(7);
	ManoCartas manoJugador2 =new ManoCartas(7);
	String valorEsperado = "Empate";
	Jugador jugadorUno = new Jugador("Yanina", manoJugador1);
	Jugador jugadorDos = new Jugador("Noelia", manoJugador2);
	Batalla batalla = new Batalla(jugadorUno, jugadorDos);
	//Ejecucion
	batalla.seleccionarElJugadorQueJuegaPrimero(jugadorUno, jugadorDos);
	batalla.batallar(jugadorDos, jugadorDos);
	String valor = batalla.getGanador().getNombre();
	//Validacion
	assertEquals(valorEsperado, valor);
}
	*/
@Test
    public void queNoHayaPokemonesRepetidosEnElMazo() { //Creado por Dominé Yanina
	//Datos de entrada
	ManoCartas manoJugador1 =new ManoCartas(7);
	ManoCartas manoJugador2 =new ManoCartas(7);
	Jugador jugadorUno = new Jugador("Yanina", manoJugador1);
	Jugador jugadorDos = new Jugador("Noelia", manoJugador2);
	Batalla batalla = new Batalla(jugadorUno, jugadorDos);
	//Ejecucion
	batalla.seleccionarElJugadorQueJuegaPrimero(jugadorUno, jugadorDos);
	batalla.batallar(jugadorDos, jugadorDos);
	//Validacion
	// Verificar que no haya pokemones repetidos en el mazo del jugadorUno
    boolean noHayaRepetidos = batalla.verificarPokemonesRepetidos();
    assertTrue(noHayaRepetidos);
}
	
/*@Test
    public void queSeRepartan7CartasParaCadaJugador() {
	// Datos de entrada
	ManoCartas manoJugador1 = new ManoCartas(7);
	ManoCartas manoJugador2 = new ManoCartas(7);
	Jugador jugadorUno = new Jugador("Yanina", manoJugador1);
	Jugador jugadorDos = new Jugador("Noelia", manoJugador2);
	Batalla batalla = new Batalla(jugadorUno, jugadorDos);
	// Ejecucion
	batalla.seleccionarElJugadorQueJuegaPrimero(jugadorUno, jugadorDos);
	batalla.batallar(jugadorUno, jugadorDos);
	boolean SieteParaCadaUno = batalla.sieteCartasPorJugador();
	// Validacion
	assertTrue(SieteParaCadaUno );
}
*/
@Test
    public void queUnPokemonAlLlegarA0PuntosDeVidaPaseAEstadoDerrotado() {
	// Datos de entrada
	PokemonAgua carta1 = new PokemonAgua("PezPokemon");
	Integer danioRecibido = 200;
	// Ejecucion
	carta1.recibirAtaque(danioRecibido);
	String estadoEsperado= "derrotado";
	String estadoReal = carta1.getEstado();
	// Validacion
	assertEquals(estadoEsperado, estadoReal);
	
}



}
