import java.util.Scanner;
import java.util.Random;

public class NumberGameLevel {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        // 1. Nome do jogador
        System.out.print("Digite seu nome: ");
        String nomeJogador = entrada.nextLine();

        // 2. Escolher dificuldade
        System.out.println("\nEscolha a dificuldade:");
        System.out.println("1 - Fácil (1 a 10)");
        System.out.println("2 - Médio (1 a 50)");
        System.out.println("3 - Difícil (1 a 100)");
        System.out.print("Sua escolha: ");
        int escolha = entrada.nextInt();

        int limite;
        if (escolha == 1) {
            limite = 10;
        } else if (escolha == 2) {
            limite = 50;
        } else {
            limite = 100;
        }

        int numeroSecreto = aleatorio.nextInt(limite) + 1;
        int tentativa = 0;
        int palpites = 0;

        System.out.println("\n🎮 Bem-vindo(a) ao jogo, " + nomeJogador + "!");
        System.out.println("Tente adivinhar o número entre 1 e " + limite + ".");

        while (tentativa != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            tentativa = entrada.nextInt();
            palpites++;

            if (tentativa < numeroSecreto) {
                System.out.println("🔼 Tente um número maior!");
            } else if (tentativa > numeroSecreto) {
                System.out.println("🔽 Tente um número menor!");
            } else {
                System.out.println("🎉 Parabéns, " + nomeJogador + "! Você acertou o número " + numeroSecreto + " em " + palpites + " tentativas.");
            }
        }

        entrada.close();
    }
}
