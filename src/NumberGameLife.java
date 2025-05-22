import java.util.Scanner;
import java.util.Random;

public class NumberGameLife {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        // Nome do jogador
        System.out.print("Digite seu nome: ");
        String nomeJogador = entrada.nextLine();

        // Escolher dificuldade
        System.out.println("\nEscolha a dificuldade:");
        System.out.println("1 - Fácil (1 a 10) - 5 vidas");
        System.out.println("2 - Médio (1 a 50) - 7 vidas");
        System.out.println("3 - Difícil (1 a 100) - 10 vidas");
        System.out.print("Sua escolha: ");
        int escolha = entrada.nextInt();

        int limite;
        int vidas;
        if (escolha == 1) {
            limite = 10;
            vidas = 5;
        } else if (escolha == 2) {
            limite = 50;
            vidas = 7;
        } else {
            limite = 100;
            vidas = 10;
        }

        int numeroSecreto = aleatorio.nextInt(limite) + 1;
        int tentativa;
        int pontuacao = 1000;

        System.out.println("\n🎮 Bem-vindo(a), " + nomeJogador + "!");
        System.out.println("Tente adivinhar o número entre 1 e " + limite + ".");
        System.out.println("Você tem " + vidas + " vidas.");
        System.out.println("🎯 Você começa com 1.000 pontos. A cada erro perde 100 pontos.\n");


        while (vidas > 0) {
            System.out.print("Digite seu palpite: ");
            tentativa = entrada.nextInt();

            if (tentativa == numeroSecreto) {
                System.out.println("\n🎉 Parabéns, " + nomeJogador + "! Você acertou o número " + numeroSecreto + "!");
                System.out.println("🏆 Sua pontuação final: " + pontuacao + " pontos");
                break;
            } else {
                vidas--;
                pontuacao -= 100;

                if (tentativa < numeroSecreto) {
                    System.out.println("🔼 Tente um número maior!");
                } else {
                    System.out.println("🔽 Tente um número menor!");
                }

                if (vidas > 0) {
                    System.out.println("❤️ Vidas restantes: " + vidas);
                    System.out.println("💯 Pontuação atual: " + pontuacao + "\n");
                } else {
                    System.out.println("\n💀 Fim de jogo, " + nomeJogador + "!");
                    System.out.println("O número secreto era: " + numeroSecreto);
                    System.out.println("💯 Sua pontuação final: 0 pontos");
                }
            }
        }

        entrada.close();
    }
}
