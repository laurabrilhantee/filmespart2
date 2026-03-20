package main.java.com.sgc.app;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.sgc.modelos.Moto;

public class Main {

    private static ArrayList<Moto> motos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean executando = true;

        while (executando) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarMoto();
                    break;
                case 2: 
                    listarMotos();
                    break;
                case 3:
                    buscarMoto();
                    break;
                case 0: 
                    executando = false;
                    System.out.println("Encerrando o programa...");
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
        System.out.println("\n=== SISTEMA DE MOTOS ===");
        System.out.println("1 - Cadastrar Moto");
        System.out.println("2 - Listar Motos");
        System.out.println("3 - Buscar Moto por modelo");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarMoto() {
        System.out.println("\n=== CADASTRAR MOTO ===");

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();

        System.out.print("Cilindradas: ");
        int cilindradas = scanner.nextInt();
        scanner.nextLine();

        Moto moto = new Moto(marca, modelo, ano, cilindradas);
        motos.add(moto);

        System.out.println("Moto cadastrada com sucesso!");
    }

    private static void listarMotos() {
        System.out.println("\n=== LISTA DE MOTOS ===");

        if (motos.isEmpty()) {
            System.out.println("Nenhuma moto cadastrada.");
            return;
        }

        for (Moto moto : motos) {
            System.out.println(moto);
        }
    }

    private static void buscarMoto() {
        System.out.println("\n=== BUSCAR MOTO ===");

        if (motos.isEmpty()) {
            System.out.println("Nenhuma moto cadastrada.");
            return;
        }

        System.out.print("Digite o modelo da moto: ");
        String modeloBusca = scanner.nextLine();

        for (Moto moto : motos) {
            if (moto.getModelo().equalsIgnoreCase(modeloBusca)) {
                System.out.println("Moto encontrada:");
                System.out.println(moto);
                System.out.println(moto.verificarCategoria());
                return;
            }
        }

        System.out.println("Moto não encontrada.");
    }
}