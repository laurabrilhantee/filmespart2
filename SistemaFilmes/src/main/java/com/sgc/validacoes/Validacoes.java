package main.java.com.sgc.validacoes;

public class Validacoes {
    
    // Construtor privado para evitar instanciação
    private Validacoes() {}
    
    // Validação para título
    public static boolean isTituloValido(String titulo) {
        return titulo != null && !titulo.trim().isEmpty();
    }
    
    // Validação para diretor
    public static boolean isDiretorValido(String diretor) {
        return diretor != null && !diretor.trim().isEmpty();
    }
    
    // Validação para ano (cinema começou por volta de 1888)
    public static boolean isAnoValido(int ano) {
        int anoAtual = java.time.Year.now().getValue();
        return ano >= 1888 && ano <= anoAtual;
    }
    
    // Validação para duração (em minutos, deve ser positiva)
    public static boolean isDuracaoValida(int duracao) {
        return duracao > 0;
    }
    
    // Validação genérica
    public static boolean isObjetoValido(Object obj) {
        return obj != null;
    }
}