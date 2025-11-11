/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetograsp;

import Controller.BibliotecaController;
import Model.Livro;
import Model.Usuario;

/**
 *
 * @author keity
 */
public class ProjetoGRASP {

    public static void main(String[] args) {
        BibliotecaController bc = new BibliotecaController();
        bc.cadastrarLivro("Joao e Maria", "Neymar");
        bc.cadastrarUsuario("Neymar", "UC2014");
    }
}
