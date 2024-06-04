package com.mycompany.zoologico;

/**
 *
 * @author rafaz
 */
public class Cavalo extends Animal{

    public Cavalo(String nome, int idade)
    {
        super(nome, idade);
    }
    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " esta relinchando!");
    }

    public void correr()
    {
        System.out.println("Cavalo correndo!");
    }
}
