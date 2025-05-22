import java.util.Scanner;
import java.util.Random;

public class NumberGameSimple {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        // 1. Pergunta o nome do jogador
        System.out.print("Digite seu nome: ");
        String nomeJogador = entrada.nextLine();

        int numeroSecreto = aleatorio.nextInt(100) + 1;
        int tentativa = 0;
        int palpites = 0;

        // 2. Usamos o nome nas mensagens
        System.out.println("🎮 Bem-vindo(a) ao jogo, " + nomeJogador + "!");
        System.out.println("Tente adivinhar o número que estou pensando (de 1 a 100).");

        while (tentativa != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            tentativa = entrada.nextInt();
            palpites++;

            if (tentativa < numeroSecreto) {
                System.out.println("🔼 Tente um número maior!");
            } else if (tentativa > numeroSecreto) {
                System.out.println("🔽 Tente um número menor!");
            } else {
                System.out.println("🎉 Parabéns! Você acertou o número " + numeroSecreto + " em " + palpites + " tentativas.");
            }
        }

        entrada.close();
    }
}
