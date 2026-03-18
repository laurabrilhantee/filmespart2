package main.java.com.sgc.app;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.sgc.modelos.Filme;
import main.java.com.sgc.validacoes.Validacoes;

public class Main {

    private static ArrayList<Filme> filmes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean executando = true;

        while (executando) {
            exibirMenu();

            int opcao;
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // limpar buffer
            } catch (Exception e) {
                System.out.println("Digite um número válido!");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarFilme();
                    break;
                case 2:
                    listarFilmes();
                    break;
                case 3:
                    buscarFilme();
                    break;
                case 0:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
        System.out.println("Sistema encerrado.");
    }

    private static void exibirMenu() {
        System.out.println("\n=== SISTEMA DE FILMES ===");
        System.out.println("1 - Cadastrar Filme");
        System.out.println("2 - Listar Filmes");
        System.out.println("3 - Buscar Filme por título");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarFilme() {
        System.out.println("\n=== CADASTRAR FILME ===");

        String titulo;
        do {
            System.out.print("Título: ");
            titulo = scanner.nextLine();
            if (!Validacoes.isTituloValido(titulo)) {
                System.out.println("Título inválido!");
            }
        } while (!Validacoes.isTituloValido(titulo));

        String diretor;
        do {
            System.out.print("Diretor: ");
            diretor = scanner.nextLine();
            if (!Validacoes.isDiretorValido(diretor)) {
                System.out.println("Diretor inválido!");
            }
        } while (!Validacoes.isDiretorValido(diretor));

        int ano;
        do {
            System.out.print("Ano: ");
            ano = scanner.nextInt();
            if (!Validacoes.isAnoValido(ano)) {
                System.out.println("Ano inválido!");
            }
        } while (!Validacoes.isAnoValido(ano));

        double duracao;
        do {
            System.out.print("Duração (em horas): ");
            duracao = scanner.nextDouble();
            if (!Validacoes.isDuracaoValida((int)(duracao * 60))) {
                System.out.println("Duração inválida!");
            }
        } while (!Validacoes.isDuracaoValida((int)(duracao * 60)));

        scanner.nextLine(); // limpar buffer

        Filme filme = new Filme(titulo, diretor, ano, duracao);
        filmes.add(filme);

        System.out.println("Filme cadastrado com sucesso!");
    }

    private static void listarFilmes() {
        System.out.println("\n=== LISTA DE FILMES ===");

        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
            return;
        }

        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }

    private static void buscarFilme() {
        System.out.println("\n=== BUSCAR FILME ===");

        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
            return;
        }

        System.out.print("Digite o título do filme: ");
        String tituloBusca = scanner.nextLine();

        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(tituloBusca)) {
                System.out.println("Filme encontrado:");
                System.out.println(filme);
                break;
            }
        }
    }
}