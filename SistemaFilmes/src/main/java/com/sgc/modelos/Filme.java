package main.java.com.sgc.modelos;

public class Filme {

    // Atributos
    private String titulo;
    private String diretor;
    private int ano;
    private double duracao;

    // Construtor vazio
    public Filme() {
    }

    // Construtor com parâmetros
    public Filme(String titulo, String diretor, int ano, double duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.ano = ano;
        this.duracao = duracao;
    }

    // Método específico
    public String verificarClassificacao() {
        if (ano < 2000) {
            return "Filme considerado clássico.";
        } else {
            return "Filme considerado recente.";
        }
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    // toString
    @Override
    public String toString() {
        return "Filme{" + "titulo='" + titulo + '\'' + ", diretor='" + diretor + '\'' + ", ano=" + ano + ", duracao=" + duracao + '}';
    }
}