package jogo;

import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) {
        var cacador = new Personagem();

        String nomePersonagem = JOptionPane.showInputDialog("Qual o nome do seu personagem? ");

        cacador.nome = nomePersonagem;
        cacador.cacar();
        cacador.comer();
        cacador.dormir();
    }
}
