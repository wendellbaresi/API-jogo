import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner scan = new Scanner((System.in));
        Random gerador = new Random();

        int opcao;
        int pc;
        int user;

        show.println("Seja bem-vindo. Qual o seu nome?");
        String nome = scan.nextLine();

        show.println("Prazer em conhecer você " + nome +"!");
        show.println(nome + ", Bora jogar um joguinho?");
        show.println("\nInforme um número da sua opção. \n1 -> SIM \n2 -> NÃO\n");
        opcao = scan.nextInt();

        if (opcao == 2){
            show.println("Poxa queria muito ter jogado com você :((. "+nome+", na próxima quem sabe!!");
        } else if (opcao == 1) {
            show.println("Partiu jogar!!Vou explicar o jogo....");
            show.println("Eu vou escolher um número de 0 a 10, porém não vou te falar "+nome+"!!");
            show.println("E você tem que tentar advinhar o número. BLZ");

            pc = gerador.nextInt(11);

            show.println("Pronto, "+nome+". Ja escolhi o número!!");
            show.println("Agora tente adivinhar!!!");

            do {
                user = scan.nextInt();
                if (user != pc){
                    show.println("Errooou!");
                }else {
                    show.println("Parabéns "+nome+". Você Aceeeertou!");
                }
            }while (pc != user);

        }
    }
}
