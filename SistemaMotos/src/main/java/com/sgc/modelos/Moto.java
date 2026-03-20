package main.java.com.sgc.modelos;

public class Moto {

    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private int cilindradas;

    // Construtor vazio
    public Moto() {
    }

    // Construtor com parâmetros
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cilindradas = cilindradas;
    }

    // Método específico
    public String verificarCategoria() {
        if (cilindradas < 300) {
            return "Moto de baixa cilindrada.";
        } else if (cilindradas <= 600) {
            return "Moto de média cilindrada.";
        } else {
            return "Moto de alta cilindrada.";
        }
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    // toString
    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", cilindradas=" + cilindradas +
                '}';
    }
}