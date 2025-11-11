/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Livro;
import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author keity
 */
public class BibliotecaController {
    // Princípio GRASP aplicado: Controller
    // Esta classe é o meio de campo entre a interface e as classes Livro e Usuario.
    // Com ela, a View não precisa cuidar da lógica de cadastrar livros ou cadastrar usuários.
    // Tudo isso fica aqui, deixando o código mais organizado e fácil de manter.
    
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public BibliotecaController() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    // CADASTRO DE LIVRO
    public void cadastrarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        livros.add(livro);
    }

    // CADASTRO DE USUARIO
    public void cadastrarUsuario(String nome, String matricula) {
        Usuario usuario = new Usuario(nome, matricula);
        usuarios.add(usuario);
    }
}
