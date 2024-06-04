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

    public void correr()
    {
        System.out.println("Cavalo correndo!");
    }
}
