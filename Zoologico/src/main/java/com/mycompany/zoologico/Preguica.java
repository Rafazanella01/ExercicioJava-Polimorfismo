package com.mycompany.zoologico;

/**
 *
 * @author rafaz
 */
public class Preguica extends Animal{

    public Preguica(String nome, int idade)
    {
        super(nome, idade);
    }
    
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " esta fazendo barulho de preguica!");
    }

    public void subirArvore()
    {
        System.out.println("Preguica subindo arvore!");
    }
}
