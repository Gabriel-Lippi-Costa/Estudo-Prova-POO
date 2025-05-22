package jogo;

public class Jogo {
    public static void main(String[] args) {
        var cacador = new Personagem();

        cacador.nome = "Gabriel";
        cacador.cacar();
        cacador.comer();
        cacador.dormir();
    }
}
