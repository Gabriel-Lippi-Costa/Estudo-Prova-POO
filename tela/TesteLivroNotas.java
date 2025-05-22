package tela;

import javax.swing.JOptionPane;

import modelo.LivroDeNotas;

public class TesteLivroNotas {
    public static void main(String[] args) {
        var livroDeNotas = new LivroDeNotas();

        String nomeDoCurso = JOptionPane.showInputDialog("Professor, qual o nome do curso? ");

        livroDeNotas.setNomeDoCurso(nomeDoCurso);
        livroDeNotas.exibirMensagem();
    }
}
