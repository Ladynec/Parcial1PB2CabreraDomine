package ar.edu.unlam.pb2.pokeParcial;

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
	public void queUnAtaqueDeUnPokemonAguaSeaDe50puntos() {
		PokemonAgua pokemonAtacante = new PokemonAgua("Squirtle");
		PokemonAgua pokemonVictima = new PokemonAgua("Squirtle");
		Integer ataque = pokemonAtacante.atacar();
		Integer puntosDeAtaqueEsperados = 50;
		assertEquals(puntosDeAtaqueEsperados, ataque);
	}
	
}
