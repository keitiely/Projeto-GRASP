/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author keity
 */
public class Livro {
 /**
 * Princípio GRASP aplicado: Alta Coesão (High Cohesion).
 *
 * Esta classe demonstra alta coesão ao ter uma responsabilidade única
 * e bem definida: gerenciar o estado e o comportamento de um 'Livro'.
 *
 * Todos os seus métodos (como 'emprestar()', 'devolver()', 'estaDisponivel()')
 * servem exclusivamente a esse propósito.
 *
 * A classe não se envolve com outras lógicas do sistema (como interface
 * ou gerenciamento de usuários), tornando-a mais simples,
 * reutilizável e fácil de manter.
 */

    private String titulo;
    private String autor;
    private boolean emprestado;
    private Usuario emprestadoPara;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    // MÉTODO QUE DEMONSTRA ALTA COESÃO
    public boolean estaDisponivel() {
        return !emprestado;
    }

    // MÉTODO QUE DEMONSTRA ALTA COESÃO
    public void emprestar(Usuario usuario) {
        if (estaDisponivel()) {
            this.emprestado = true;
            this.emprestadoPara = usuario;
        }
    }

    // MÉTODO QUE DEMONSTRA ALTA COESÃO
    public void devolver() {
        this.emprestado = false;
        this.emprestadoPara = null;
    }

    // Getters e Setters...
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
     public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
     public boolean getEmprestado(){
        return emprestado;
    }
    
    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }
    
     public Usuario getEmprestadoPara(){
        return emprestadoPara;
    }
    
    public void setEmprestadoPara(Usuario emprestadoPara){
        this.emprestadoPara = emprestadoPara;
    } 
    
}
