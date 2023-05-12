package ar.edu.unlam.pb2.pokeParcial;

	import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
	import java.util.Random;

	public class Batalla { //me falto la clase de Pokemon curacion y Pokemon potenciador 
	    private static final String[] POKENOMBRES = {"Squirtle", "Wartortle", "Blastoise", "Psyduck", "Golduck", "Poliwag", "Poliwhirl", "Poliwrath", "Tentacool", "Tentacruel", "Slowpoke", "Slowbro", "Seel", "Dewgong", "Shellder", "Cloyster", "Krabby", "Kingler", "Horsea", "Seadra", "Goldeen", "Seaking", "Staryu", "Starmie", "Magikarp", "Gyarados", "Lapras", "Vaporeon", "Omanyte", "Omastar", "Kabuto", "Kabutops", "Totodile", "Croconaw", "Feraligatr", "Chinchou", "Lanturn", "Marill", "Azumarill", "Politoed", "Wooper", "Quagsire", "Slowking", "Qwilfish", "Corsola", "Remoraid", "Octillery", "Mantine", "Kingdra", "Suicune", "Charmander", "Charmeleon", "Charizard", "Vulpix", "Ninetales", "Growlithe", "Arcanine", "Ponyta", "Rapidash", "Magmar", "Flareon", "Moltres", "Cyndaquil", "Quilava", "Typhlosion", "Slugma", "Magcargo", "Houndour", "Houndoom", "Entei", "Pikachu", "Raichu", "Magnemite", "Magneton", "Voltorb", "Electrode", "Electabuzz", "Jolteon", "Zapdos", "Chinchou", "Lanturn", "Pichu", "Mareep", "Flaaffy", "Ampharos", "Elekid", "Raikou", "Bulbasaur", "Ivysaur", "Venusaur", "Oddish", "Gloom", "Vileplume", "Paras", "Parasect", "Bellsprout", "Weepinbell", "Victreebel", "Exeggcute", "Exeggutor", "Tangela", "Chikorita", "Bayleef", "Meganium", "Bellossom", "Hoppip", "Skiploom", "Jumpluff", "Sunkern", "Sunflora", "Celebi"};
	    private static final String[] NOMBRES_POKEMON_AGUA = {"Squirtle", "Wartortle", "Blastoise", "Psyduck", "Golduck", "Poliwag", "Poliwhirl", "Poliwrath", "Tentacool", "Tentacruel", "Slowpoke", "Slowbro", "Seel", "Dewgong", "Shellder", "Cloyster", "Krabby", "Kingler", "Horsea", "Seadra", "Goldeen", "Seaking", "Staryu", "Starmie", "Magikarp", "Gyarados", "Lapras", "Vaporeon", "Omanyte", "Omastar", "Kabuto", "Kabutops", "Totodile", "Croconaw", "Feraligatr", "Chinchou", "Lanturn", "Marill", "Azumarill", "Politoed", "Wooper", "Quagsire", "Slowking", "Qwilfish", "Corsola", "Remoraid", "Octillery", "Mantine", "Kingdra", "Suicune"};
	    private static final String[] NOMBRES_POKEMON_FUEGO = {"Charmander", "Charmeleon", "Charizard", "Vulpix", "Ninetales", "Growlithe", "Arcanine", "Ponyta", "Rapidash", "Magmar", "Flareon", "Moltres", "Cyndaquil", "Quilava", "Typhlosion", "Slugma", "Magcargo", "Houndour", "Houndoom", "Entei"};
	    private static final String[] NOMBRES_POKEMON_ELECTRICOS  = {"Pikachu", "Raichu", "Magnemite", "Magneton", "Voltorb", "Electrode", "Electabuzz", "Jolteon", "Zapdos", "Chinchou", "Lanturn", "Pichu", "Mareep", "Flaaffy", "Ampharos", "Elekid", "Raikou"};
	    private static final String[] NOMBRES_POKEMON_PLANTA = {"Bulbasaur", "Ivysaur", "Venusaur", "Oddish", "Gloom", "Vileplume", "Paras", "Parasect", "Bellsprout", "Weepinbell", "Victreebel", "Exeggcute", "Exeggutor", "Tangela", "Chikorita", "Bayleef", "Meganium", "Bellossom", "Hoppip", "Skiploom", "Jumpluff", "Sunkern", "Sunflora", "Celebi"};
	    

	    public static List<Pokemon> repartirCartas() { //otorga una lista de 7 cartas pokemon random
	        Random random = new Random();
	        List<Pokemon> pokemonList = new ArrayList<Pokemon>();
	        for (int i = 0; i < 7; i++) {
	            String nombreRandom = POKENOMBRES[(int) (Math.random() * POKENOMBRES.length)];   
	            if(Arrays.asList(NOMBRES_POKEMON_AGUA).contains(nombreRandom) ){
	            	PokemonAgua pokemonDeAguaRandom = new PokemonAgua(nombreRandom);
                    pokemonList.add(pokemonDeAguaRandom);
	            }else {
	            	if(Arrays.asList(NOMBRES_POKEMON_FUEGO).contains(nombreRandom) ){
	            	PokemonFuego pokemonDeFuegoRandom = new PokemonFuego(nombreRandom);
                    pokemonList.add(pokemonDeFuegoRandom);
	            	}else {
		            	if(Arrays.asList(NOMBRES_POKEMON_ELECTRICOS).contains(nombreRandom) ){
		            	PokemonElectrico pokemonDeElectricidadRandom = new PokemonElectrico(nombreRandom);
	                    pokemonList.add(pokemonDeElectricidadRandom);
		            	}else {
			            	if(Arrays.asList(NOMBRES_POKEMON_PLANTA).contains(nombreRandom) ){
			            	PokemonPlanta pokemonDePlantaRandom = new PokemonPlanta(nombreRandom);
		                    pokemonList.add(pokemonDePlantaRandom);
			            	}
	        }
	        
	    }
	}

	        }                       
	                        
	                        
	        return pokemonList;                
	                        
	                        
	    }    
	    
	}              
	                       