package com.mycompany.zoologico;
import java.util.ArrayList;

/**
 *
 * @author rafaz
 */
public class Zoologico {
    ArrayList jaulas = new ArrayList();

    public void colocarNaJaula(Animal animal)
    {
        jaulas.add(animal);
    }

    public void percorrerJaulas()
    {
        int i;

        for(i = 0; i < jaulas.size(); i++){
            if(jaulas.get(i) instanceof Cachorro){
                Cachorro ca = (Cachorro)jaulas.get(i);
                System.out.println("Jaula aberta!");
                ca.correr();
            }
            else if(jaulas.get(i) instanceof Cavalo){
                Cavalo cav = (Cavalo)jaulas.get(i);
                System.out.println("Jaula aberta!");
                cav.correr();
            }
            else{
                System.out.println("Jaula aberta!");
            }
        }
    }
}
