package com.mycompany.zoologico;

/**
 *
 * @author rafaz
 */
public class Veterinario {

    public void examinar(Animal animal) {
        System.out.println("Examinando " + animal.getNome());
        animal.emitirSom();
    }
}
