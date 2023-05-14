package ar.edu.unlam.pb2.pokeParcial;


import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Batalla { 
				
				private Jugador jugador1;
				private Jugador jugador2;
				
				    
				    private static int rondasGanadasJugadorUno, rondasGanadasJugadorDos;
			     	
				        

				public Batalla(Jugador jugador1, Jugador jugador2) {
						super();
						this.jugador1 = jugador1;
						this.jugador2 = jugador2;
					}

				public Jugador seleccionarElJugadorQueJuegaPrimero(Jugador jugador1, Jugador jugador2) { // Bay noelia Sabado 13/05
					Jugador elPrimeroEnJugar;
					
					Jugador[] contrincantes = {jugador1, jugador2};
					int primerTurno = (int) (Math.random() * 2);
					elPrimeroEnJugar = contrincantes[primerTurno];

					return elPrimeroEnJugar;
				}
				
				public void batallar(Jugador jugador1, Jugador jugador2) { 
					Random random = new Random();
					Integer PokemonDerrotadosJugadorUno=0;
					Integer PokemonDerrotadosJugadorDos = 0; 
					Jugador ganador;
					Jugador empate = null;
					Jugador elQueVaSegundo;
					Jugador elQueVaPrimero = seleccionarElJugadorQueJuegaPrimero(jugador1, jugador2);
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
						
						
						if(pokeCartaAJugar2.getPuntosDeVida()>0) {
							Integer puntaje2 = pokeCartaAJugar2.atacar();
							pokeCartaAJugar1.recibirAtaque(puntaje2);
						} else {
							pokeCartaAJugar2.setEstado("Derrotado");
							PokemonDerrotadosJugadorDos++;
						}
							if (pokeCartaAJugar1.getPuntosDeVida()>0) {
								puntaje = pokeCartaAJugar1.atacar();
								pokeCartaAJugar2.recibirAtaque(puntaje);
							}else {
							pokeCartaAJugar1.setEstado("Derrotado");
							PokemonDerrotadosJugadorUno++;
						
							
						}
					
					if(PokemonDerrotadosJugadorUno>PokemonDerrotadosJugadorDos) { // By yanina Sabado 13/05
						ganador = elQueVaPrimero;
					} else if (PokemonDerrotadosJugadorUno<PokemonDerrotadosJugadorDos) {
						ganador = elQueVaSegundo;
					} else if (PokemonDerrotadosJugadorUno==PokemonDerrotadosJugadorDos) {
						ganador = empate;
					}
					
				}
				
				
			}
	
				}

				@Override
				public String toString() {
					return "Batalla [jugador1=" + jugador1 + ", jugador2=" + jugador2 + "]";
				}
				
				
			}