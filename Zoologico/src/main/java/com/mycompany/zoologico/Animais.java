package com.mycompany.zoologico;
import java.util.List;

/**
 *
 * @author rafaz
 */
public class Animais {
    public static void main(String[] args) {
        Cachorro ca = new Cachorro("Tufao", 12);
        ca.emitirSom();

        Cavalo cav = new Cavalo("Nick", 33);
        cav.emitirSom();

        Preguica p = new Preguica("Schmidt", 12);
        p.emitirSom();

        Veterinario vet = new Veterinario();
        vet.examinar(ca);
        vet.examinar(cav);
        vet.examinar(p);

        Zoologico zoo = new Zoologico();

        // Colocando manualmente os animais nas jaulas
        List<Animal> animais = List.of(
            new Cachorro("Tufao", 12),
            new Cachorro("Franco", 8),
            new Cavalo("Nick", 33),
            new Cavalo("Paraguaio", 5),
            new Preguica("Schmidt", 12),
            new Preguica("Cid", 10),
            new Cachorro("Einstein", 4),
            new Cavalo("Pe de pano", 7),
            new Preguica("dorme", 9),
            new Cachorro("Caramelo", 6)
        );

        for (Animal animal : animais) {
            zoo.colocarNaJaula(animal);
        }

        zoo.percorrerJaulas();
    }
}
