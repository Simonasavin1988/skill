package org.example.blackjack;

public class MainBlackJack {
    public static void main(String[] args) {
        BlackJack blackjack = new BlackJack();

        int primaCarte = BlackJack.parseCard("ace");
        int aDouaCarte = BlackJack.parseCard("king");

        String rezultat = blackjack.firstTurn("ace","king","ace");
        System.out.println(rezultat);
    }
}
