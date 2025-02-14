/* Fichier de test de l'application PokeBagarre
 Liste des tests à effectuer pour vérifier le bon fonctionnement de l'application :
    - Attaque différente
						--> Situation de départ : deux pokémons s'affrontent
						--> Résultat attendu    : Le plus fort des deux gagne
	- Même attaque
						--> Situation de départ : deux pokémons s'affrontent
						--> Résultat attendu    : Celui avec la meilleure defense gagne
	- Même attaque, même defense
						--> Situation de départ : deux pokémons s'affrontent
						--> Résultat attendu    : Le premier pokémon entré gagne
	- Même attaque, même defense mais dans l'autre sens
						--> Situation de départ : deux pokémons s'affrontent
						--> Résultat attendu    : Le premier pokémon entré gagne

*/
package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {

    @Test
    void un_vs_un_premiergagne(){
        //GIVEN
        Pokemon poke1 = new Pokemon("Pikachu", "url", new Stats(10, 5));
        Pokemon poke2 = new Pokemon("Salamèche", "url", new Stats(5, 5));
        //WHEN
        boolean result = poke1.estVainqueurContre(poke2);
        //THEN
        assertTrue(result);
    }

    @Test
    void un_vs_un_deuxieme_gagne(){
        //GIVEN
        Pokemon poke1 = new Pokemon("Pikachu", "url", new Stats(5, 5));
        Pokemon poke2 = new Pokemon("Salamèche", "url", new Stats(10, 5));
        //WHEN
        boolean result = poke1.estVainqueurContre(poke2);
        //THEN
        assertFalse(result);
    }

    @Test
    void un_vs_un_meme_attaque(){
        //GIVEN
        Pokemon poke1 = new Pokemon("Pikachu", "url", new Stats(10, 10));
        Pokemon poke2 = new Pokemon("Salamèche", "url", new Stats(10, 5));
        //WHEN
        boolean result = poke1.estVainqueurContre(poke2);
        //THEN
        assertTrue(result);
    }

    @Test
    void un_vs_un_meme_attaque_meme_defense(){
        //GIVEN
        Pokemon poke1 = new Pokemon("Pikachu", "url", new Stats(10, 10));
        Pokemon poke2 = new Pokemon("Salamèche", "url", new Stats(10, 10));
        //WHEN
        boolean result = poke1.estVainqueurContre(poke2);
        //THEN
        assertTrue(result);
    }

}