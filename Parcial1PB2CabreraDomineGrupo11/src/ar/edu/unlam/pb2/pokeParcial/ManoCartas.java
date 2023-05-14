package ar.edu.unlam.pb2.pokeParcial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ManoCartas {
	
	    private static final String[] POKENOMBRES = {"Squirtle", "Wartortle", "Blastoise", "Psyduck", "Golduck", "Poliwag", "Poliwhirl", "Poliwrath", "Tentacool", "Tenta cruel", "Slowpoke", "Slowbro", "Seel", "Dewgong", "Shellder", "Cloyster", "Krabby", "Kingler", "Horsea", "Seadra", "Goldeen", "Seaking", "Staryu", "Starmie", "Magikarp", "Gyarados", "Lapras", "Vaporeon", "Omanyte", "Omastar", "Kabuto", "Kabutops", "Totodile", "Croconaw", "Feraligatr", "Chinchou", "Lanturn", "Marill", "Azumarill", "Politoed", "Wooper", "Quagsire", "Slowking", "Qwilfish", "Corsola", "Remoraid", "Octillery", "Mantine", "Kingdra", "Suicune", "Charmander", "Charmeleon", "Charizard", "Vulpix", "Ninetales", "Growlithe", "Arcanine", "Ponyta", "Rapidash", "Magmar", "Flareon", "Moltres", "Cyndaquil", "Quilava", "Typhlosion", "Slugma", "Magcargo", "Houndour", "Houndoom", "Entei", "Pikachu", "Raichu", "Magnemite", "Magneton", "Voltorb", "Electrode", "Electabuzz", "Jolteon", "Zapdos", "Chinchou", "Lanturn", "Pichu", "Mareep", "Flaaffy", "Ampharos", "Elekid", "Raikou", "Bulbasaur", "Ivysaur", "Venusaur", "Oddish", "Gloom", "Vileplume", "Paras", "Parasect", "Bellsprout", "Weepinbell", "Victreebel", "Exeggcute", "Exeggutor", "Tangela", "Chikorita", "Bayleef", "Meganium", "Bellossom", "Hoppip", "Skiploom", "Jumpluff", "Sunkern", "Sunflora", "Celebi"};
	    private static final String[] NOMBRES_POKEMON_AGUA = {"Squirtle", "Wartortle", "Blastoise", "Psyduck", "Golduck", "Poliwag", "Poliwhirl", "Poliwrath", "Tentacool", "Tentacruel", "Slowpoke", "Slowbro", "Seel", "Dewgong", "Shellder", "Cloyster", "Krabby", "Kingler", "Horsea", "Seadra", "Goldeen", "Seaking", "Staryu", "Starmie", "Magikarp", "Gyarados", "Lapras", "Vaporeon", "Omanyte", "Omastar", "Kabuto", "Kabutops", "Totodile", "Croconaw", "Feraligatr", "Chinchou", "Lanturn", "Marill", "Azumarill", "Politoed", "Wooper", "Quagsire", "Slowking", "Qwilfish", "Corsola", "Remoraid", "Octillery", "Mantine", "Kingdra", "Suicune"};
	    private static final String[] NOMBRES_POKEMON_FUEGO = {"Charmander", "Charmeleon", "Charizard", "Vulpix", "Ninetales", "Growlithe", "Arcanine", "Ponyta", "Rapidash", "Magmar", "Flareon", "Moltres", "Cyndaquil", "Quilava", "Typhlosion", "Slugma", "Magcargo", "Houndour", "Houndoom", "Entei"};
	    private static final String[] NOMBRES_POKEMON_ELECTRICOS  = {"Pikachu", "Raichu", "Magnemite", "Magneton", "Voltorb", "Electrode", "Electabuzz", "Jolteon", "Zapdos", "Chinchou", "Lanturn", "Pichu", "Mareep", "Flaaffy", "Ampharos", "Elekid", "Raikou"};
	    private static final String[] NOMBRES_POKEMON_PLANTA = {"Bulbasaur", "Ivysaur", "Venusaur", "Oddish", "Gloom", "Vileplume", "Paras", "Parasect", "Bellsprout", "Weepinbell", "Victreebel", "Exeggcute", "Exeggutor", "Tangela", "Chikorita", "Bayleef", "Meganium", "Bellossom", "Hoppip", "Skiploom", "Jumpluff", "Sunkern", "Sunflora", "Celebi"};
	    
	  

	    private static List<Pokemon> pokemonListJugador = new ArrayList<Pokemon>();
   
    
    public ManoCartas(Integer longitud) {
			super();
			pokemonListJugador = repartirCartas(longitud);
		}


	public static List<Pokemon> repartirCartas(int longitud) { //otorga una lista de 7 cartas pokemon random
        Random random = new Random();
        
        for (int i = 0; i < longitud ; i++) {
            String nombreRandom = POKENOMBRES[(int) (Math.random() * POKENOMBRES.length)];   
            if(Arrays.asList(NOMBRES_POKEMON_AGUA).contains(nombreRandom) ){
            	PokemonAgua pokemonDeAguaRandom = new PokemonAgua(nombreRandom);
                pokemonListJugador.add(pokemonDeAguaRandom);
            }else {
            	if(Arrays.asList(NOMBRES_POKEMON_FUEGO).contains(nombreRandom) ){
            	PokemonFuego pokemonDeFuegoRandom = new PokemonFuego(nombreRandom);
                pokemonListJugador.add(pokemonDeFuegoRandom);
            	}else {
	            	if(Arrays.asList(NOMBRES_POKEMON_ELECTRICOS).contains(nombreRandom) ){
	            	PokemonElectrico pokemonDeElectricidadRandom = new PokemonElectrico(nombreRandom);
                    pokemonListJugador.add(pokemonDeElectricidadRandom);
	            	}else {
		            	if(Arrays.asList(NOMBRES_POKEMON_PLANTA).contains(nombreRandom) ){
		            	PokemonPlanta pokemonDePlantaRandom = new PokemonPlanta(nombreRandom);
	                    pokemonListJugador.add(pokemonDePlantaRandom);
		            	}
		            	
	            	} 
            	}
            }
        }            
        return pokemonListJugador;                          
    }


	
	
	public static String[] getPokenombres() {
		return POKENOMBRES;
	}


	public static List<Pokemon> getPokemonListJugador() {
		return pokemonListJugador;
	}


	public static void setPokemonListJugador(List<Pokemon> pokemonListJugador) {
		ManoCartas.pokemonListJugador = pokemonListJugador;
	}


	public static String[] getNombresPokemonAgua() {
		return NOMBRES_POKEMON_AGUA;
	}


	public static String[] getNombresPokemonFuego() {
		return NOMBRES_POKEMON_FUEGO;
	}


	public static String[] getNombresPokemonElectricos() {
		return NOMBRES_POKEMON_ELECTRICOS;
	}


	public static String[] getNombresPokemonPlanta() {
		return NOMBRES_POKEMON_PLANTA;
	}      
	
	
}
