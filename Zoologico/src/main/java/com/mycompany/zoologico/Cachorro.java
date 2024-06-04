package com.mycompany.zoologico;

/**
 *
 * @author rafaz
 */
public class Cachorro extends Animal {

    public Cachorro(String nome, int idade)
    {
        super(nome, idade);
    }
    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " esta latindo!");
    }
    
    public void correr()
    {
        System.out.println("Cachorro correndo!");
    }
}
