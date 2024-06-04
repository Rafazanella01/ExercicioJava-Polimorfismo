package com.mycompany.zoologico;
import java.util.ArrayList;
import com.mycompany.zoologico.Animal;

/**
 *
 * @author rafaz
 */
public class Zoologico {
    ArrayList<Animal> jaulas = new ArrayList<>();
    
    public void colocarNaJaula(Animal animal)
    {
        jaulas.add(animal);
    }

    public void percorrerJaulas()
    {
        for (Animal animal : jaulas) {
            System.out.println("Jaula aberta!");
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).correr();
            } else if (animal instanceof Cavalo) {
                ((Cavalo) animal).correr();
            } else if (animal instanceof Preguica) {
                ((Preguica) animal).subirArvore();
            }
        }
    }
}
