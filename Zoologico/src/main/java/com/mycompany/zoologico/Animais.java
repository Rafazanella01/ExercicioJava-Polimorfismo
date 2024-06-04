package com.mycompany.zoologico;
import java.util.Random;

/**
 *
 * @author rafaz
 */
public class Animais {
    public static void main(String[] args) throws Exception {
        
        Cachorro ca = new Cachorro("Tufão", 12);
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

        Random gerador = new Random();

        int i;
        for(i = 0; i < 10; i++){
            int numero = gerador.nextInt(3);

            if(numero == 0){
                zoo.colocarNaJaula(ca);
            }
            else if(numero == 1){
                zoo.colocarNaJaula(cav);
            }
            else{
                zoo.colocarNaJaula(p);
            }
        }
        zoo.percorrerJaulas();
    }
}
