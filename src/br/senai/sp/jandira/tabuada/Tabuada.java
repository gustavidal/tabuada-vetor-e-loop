package br.senai.sp.jandira.tabuada;

import br.senai.sp.jandira.tabuada.model.Usuario;

public class Tabuada {

    public static void main(String[] args) {
        System.out.println("Iniciando a calculadora...");

        Usuario usuario = new Usuario();

        usuario.obterInfomacoes();
    }
}
