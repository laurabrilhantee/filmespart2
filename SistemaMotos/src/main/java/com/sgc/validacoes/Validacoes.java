package main.java.com.sgc.validacoes;

public class Validacoes {
    
    // Construtor privado para evitar instanciação
    private Validacoes() {}
    
    // Validação para modelo da moto
    public static boolean isModeloValido(String modelo) {
        return modelo != null && !modelo.trim().isEmpty();
    }
    
    // Validação para marca da moto
    public static boolean isMarcaValida(String marca) {
        return marca != null && !marca.trim().isEmpty();
    }
    
    // Validação para ano (primeiras motos surgiram por volta de 1885)
    public static boolean isAnoValido(int ano) {
        int anoAtual = java.time.Year.now().getValue();
        return ano >= 1885 && ano <= anoAtual;
    }
    
    // Validação para cilindrada (em cc, deve ser positiva)
    public static boolean isCilindradaValida(int cilindrada) {
        return cilindrada > 0;
    }
    
    // Validação genérica
    public static boolean isObjetoValido(Object obj) {
        return obj != null;
    }
}