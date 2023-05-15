package ar.edu.unlam.pb2.pokeParcial;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

    public class Batalla { 
				
		private Jugador jugador1;
		private Jugador jugador2;
        private Jugador jugadorPerdedor;
		
		private Jugador ganador;
		
		private int ordenMazoJugador1[];
		private int ordenMazoJugador2[];
		private Pokemon[] mazoPokemones = new Pokemon[7];
		private Pokemon[] mazoPokemonesJugador2 = new Pokemon[7];
		
		
		private Integer contadorCartas1, contadorCartas2;
		
		private boolean Eliminado=false;		
				    
	    private static int rondasGanadasJugadorUno, rondasGanadasJugadorDos;
			     	
				        

		public Batalla(Jugador jugador1, Jugador jugador2) {
				super();
			    this.jugador1 = jugador1;
				this.jugador2 = jugador2;
			    this.contadorCartas1 = 0;
			    this.contadorCartas2 = 0;

				}

		public Jugador seleccionarElJugadorQueJuegaPrimero(Jugador jugador1, Jugador jugador2) { // Bay noelia Sabado 13/05
				Jugador elPrimeroEnJugar;
					
				Jugador[] contrincantes = {jugador1, jugador2};
				int primerTurno = (int) (Math.random() * 2);
				elPrimeroEnJugar = contrincantes[primerTurno];

				return elPrimeroEnJugar;
				}
				
				public Jugador batallar(Jugador jugador1, Jugador jugador2) { 
					Random random = new Random();
					Integer PokemonDerrotadosJugadorUno=0;
					Integer PokemonDerrotadosJugadorDos = 0; 
					Jugador ganador = null;
					Jugador empate = null;
					Jugador elQueVaSegundo;
					Jugador elQueVaPrimero = seleccionarElJugadorQueJuegaPrimero(jugador1, jugador2);//Hecho por noelia sabado 13/05
					if (elQueVaPrimero.equals(jugador1)) {
						elQueVaSegundo = jugador2;
					} else {
						elQueVaSegundo = jugador1;
					}
					
					Pokemon pokeCartaAJugar1, pokeCartaAJugar2;
					pokeCartaAJugar1 = null;
					pokeCartaAJugar2 = null;
					for (int i=0; i<7; i++) { //By yanina domingo 14/05
					
						if(i==0) {
							pokeCartaAJugar1 = (elQueVaPrimero.getMano().getPokemonListJugador()).get(random.nextInt((elQueVaPrimero.getMano().getPokemonListJugador()).size()));
							pokeCartaAJugar2 = (elQueVaSegundo.getMano().getPokemonListJugador()).get(random.nextInt((elQueVaSegundo.getMano().getPokemonListJugador()).size()));
							
						} else {
							if(pokeCartaAJugar1.getEstado()=="Derrotado") {
								do {
								    int randomIndex = random.nextInt(elQueVaPrimero.getMano().getPokemonListJugador().size());
								    pokeCartaAJugar1 = elQueVaPrimero.getMano().getPokemonListJugador().get(randomIndex);
								} while (pokeCartaAJugar1.getEstado().equals("Derrotado"));
							} 
							if (pokeCartaAJugar2.getEstado()=="Derrotado") {
								do {
								    int randomIndex = random.nextInt(elQueVaSegundo.getMano().getPokemonListJugador().size());
								    pokeCartaAJugar2 = elQueVaSegundo.getMano().getPokemonListJugador().get(randomIndex);
								} while (pokeCartaAJugar2.getEstado().equals("Derrotado"));
							}
						}
						//hecho por noelia Doming0 14/05
						if(Arrays.asList((elQueVaPrimero.getMano().getNombresPokemonAgua())).contains(pokeCartaAJugar1)) { 
							Integer puntaje = pokeCartaAJugar1.atacar();
							if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonElectricos())).contains(pokeCartaAJugar2)){
								
								 puntaje = pokeCartaAJugar1.setNuevoAtaquePorDebilidad();
								pokeCartaAJugar2.recibirAtaque(puntaje);
							} else if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonFuego())).contains(pokeCartaAJugar2)){
								 puntaje = pokeCartaAJugar1.setNuevoAtaquePorFortaleza();
								pokeCartaAJugar2.recibirAtaque(puntaje);
								} else if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonPlanta())).contains(pokeCartaAJugar2)){
									 puntaje = pokeCartaAJugar1.setNuevoAtaquePorDebilidad();
									pokeCartaAJugar2.recibirAtaque(puntaje);
									}
								else if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonAgua())).contains(pokeCartaAJugar2)){
									pokeCartaAJugar2.recibirAtaque(puntaje);
								}
						} else if(Arrays.asList((elQueVaPrimero.getMano().getNombresPokemonElectricos())).contains(pokeCartaAJugar1)) {
							Integer puntaje = pokeCartaAJugar1.atacar();
							if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonAgua())).contains(pokeCartaAJugar2)){
								 puntaje = pokeCartaAJugar1.setNuevoAtaquePorFortaleza();
								pokeCartaAJugar2.recibirAtaque(puntaje);
							} else if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonPlanta())).contains(pokeCartaAJugar2)){
							    puntaje = pokeCartaAJugar1.setNuevoAtaquePorDebilidad();
								pokeCartaAJugar2.recibirAtaque(puntaje);
							} else if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonFuego())).contains(pokeCartaAJugar2)){
								pokeCartaAJugar2.recibirAtaque(puntaje);
							}else if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonElectricos())).contains(pokeCartaAJugar2)){
								pokeCartaAJugar2.recibirAtaque(puntaje);
							}
						} else if(Arrays.asList((elQueVaPrimero.getMano().getNombresPokemonFuego())).contains(pokeCartaAJugar1)) {
							Integer puntaje = pokeCartaAJugar1.atacar();
							 if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonAgua())).contains(pokeCartaAJugar2)){
								    puntaje = pokeCartaAJugar1.setNuevoAtaquePorDebilidad();
									pokeCartaAJugar2.recibirAtaque(puntaje);
								} else if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonPlanta())).contains(pokeCartaAJugar2)){
									puntaje = pokeCartaAJugar1.setNuevoAtaquePorFortaleza();
									pokeCartaAJugar2.recibirAtaque(puntaje);
									}else if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonFuego())).contains(pokeCartaAJugar2)){
										pokeCartaAJugar2.recibirAtaque(puntaje);
									}else if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonElectricos())).contains(pokeCartaAJugar2)){
										pokeCartaAJugar2.recibirAtaque(puntaje);
									}
						}else if(Arrays.asList((elQueVaPrimero.getMano().getNombresPokemonPlanta())).contains(pokeCartaAJugar1)) {
							Integer puntaje = pokeCartaAJugar1.atacar();
							if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonElectricos())).contains(pokeCartaAJugar2)){
								puntaje = pokeCartaAJugar1.setNuevoAtaquePorFortaleza();
								pokeCartaAJugar2.recibirAtaque(puntaje);
							} else if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonFuego())).contains(pokeCartaAJugar2)){
								    puntaje = pokeCartaAJugar1.setNuevoAtaquePorDebilidad();
									pokeCartaAJugar2.recibirAtaque(puntaje);
								} else if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonAgua())).contains(pokeCartaAJugar2)){
									puntaje = pokeCartaAJugar1.setNuevoAtaquePorFortaleza();
									pokeCartaAJugar2.recibirAtaque(puntaje);
									}else if(Arrays.asList((elQueVaSegundo.getMano().getNombresPokemonPlanta())).contains(pokeCartaAJugar2)){
										pokeCartaAJugar2.recibirAtaque(puntaje);
						}
						
						//By Yanina 14/05
							pokeCartaAJugar2.recibirAtaque(pokeCartaAJugar1.getAtaqueGolpe());
							if(pokeCartaAJugar2.getPuntosDeVida()>0) {
								pokeCartaAJugar1.recibirAtaque(pokeCartaAJugar2.getAtaqueGolpe());
								if (pokeCartaAJugar1.getPuntosDeVida()<=0) {
									pokeCartaAJugar1.setEstado("Derrotado");
									PokemonDerrotadosJugadorUno++;
									Eliminado=true;
								}
							} else {
								pokeCartaAJugar2.setEstado("Derrotado");
								PokemonDerrotadosJugadorDos++;
								Eliminado=true;
							}	
						}
						if(PokemonDerrotadosJugadorUno>PokemonDerrotadosJugadorDos) {
							ganador = elQueVaPrimero;
							jugadorPerdedor=elQueVaSegundo;
						} else if (PokemonDerrotadosJugadorUno<PokemonDerrotadosJugadorDos) {
							ganador = elQueVaSegundo;
							jugadorPerdedor=elQueVaPrimero;
						} else if (PokemonDerrotadosJugadorUno.equals(PokemonDerrotadosJugadorDos)) {
							Jugador Empate = new Jugador("Empate", null);
							ganador = Empate;
						}
					}
						return ganador;
				}
// By yanina 14/05
				public boolean getEliminado() {
					return Eliminado;
				}
				
				public boolean mazoJugador1Aleatorio() {
					boolean estaOrdenado = false;
					for (int i = 0; i < 7; i++) {
					    if (ordenMazoJugador1[i] > ordenMazoJugador1[i + 1]) {
					        estaOrdenado = false;
					        break;
					    }
					}
					return estaOrdenado;
				
				}
				
			
				
				
	
				
		/*	public boolean noCartasRepetidas() {
					boolean noRepeticiones=false;
					Pokemon variable;
					for (int i=0; i<7; i++) {
						variable = mazoPokemones[i];
						for (int j=0; j<7; j++) {
							if ((variable==mazoPokemones[j])&&(i!=j)) {
								noRepeticiones=true;
								break;
							}
						}
					}
					return noRepeticiones;
				}
				*/
			public boolean sieteCartasPorJugador() {
				boolean informe=false;
				
				Integer cartasJugador1 = jugador1.getMano().getPokemonListJugador().size();
				Integer cartasJugador2 = jugador2.getMano().getPokemonListJugador().size();
				
				if(cartasJugador1==7 && cartasJugador2==7) {
					informe=true;
				}
				return informe;
			}
				
				public boolean verificarPokemonesRepetidos() {
			        List<Pokemon> pokemonListJugador = new ArrayList<>();

			        // Generar la lista de elementos
			        int totalElementos = 7;
			        for (int i = 0; i < totalElementos; i++) {
			            Pokemon pokeCartaAJugar = jugador1.getMano().getPokemonListJugador().get(i);
			            pokemonListJugador.add(pokeCartaAJugar);
			        }

			        // Verificar que no haya elementos repetidos en la lista
			        Set<Pokemon> pokemonSet = new HashSet<>(pokemonListJugador);
			        return pokemonSet.size() == totalElementos;
			    }
				
				public Jugador getGanador() {
					return ganador;
				}
				public Jugador getPerdedor() {
					return this.jugadorPerdedor;
				}
			    
				public boolean noCartasRepetidas() {
					boolean noRepeticiones=false;
					Pokemon variable;
					for (int i=0; i<7; i++) {
						variable = mazoPokemones[i];
						for (int j=0; j<7; j++) {
							if ((variable==mazoPokemones[j])&&(i!=j)) {
								noRepeticiones=true;
								break;
							}
						}
					}
					return noRepeticiones;
				}
			          
				public boolean mazoJugadoresIguales() {
					boolean sonIguales=false;
					Integer contadorCoincidencias=0;
					for (int i=0;i<7;i++) {
						if(mazoPokemones[i].equals(mazoPokemonesJugador2[i])) {
							sonIguales=true;
							break;
						}
					}
					return sonIguales;
				}
				@Override
				public String toString() {
					return "Batalla [jugador1=" + jugador1 + ", jugador2=" + jugador2 + "]";
				}
				
				
			}