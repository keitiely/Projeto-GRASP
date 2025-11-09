/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author keity
 */
public class Usuario {
 /**
 * Princípio GRASP aplicado: Alta Coesão (High Cohesion)
 *
 * Assim como a classe Livro, a classe Usuario demonstra Alta Coesão.
 * Sua única responsabilidade é gerenciar os dados
 * de um usuário da biblioteca.
 *
 * Ela não se preocupa em como um livro é emprestado ou como a
 * interface funciona. Ela apenas guarda informações sobre o usuário.
 * Isso a torna simples, focada e fácil de manter.
 */
    
    private String nome;
    private String matricula;
    
    
    public Usuario(String nome, String matricula){
         this.nome = nome;
         this.matricula = matricula;  
    }
    
    
   // Getters e Setters 
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}
