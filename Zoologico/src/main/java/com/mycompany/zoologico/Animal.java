package com.mycompany.zoologico;

/**
 *
 * @author rafaz
 */
public class Animal {
    private String nome;
    private int idade;

    //Construtor
    public Animal(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
    
    //Getters
    public String getNome()
    {
        return nome;
    }
    
    public int getIdade()
    {
        return idade;
    }
    
    //Setters
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public void emitirSom()
    {
        System.out.println("Animal emitindo som!");
    }
}
