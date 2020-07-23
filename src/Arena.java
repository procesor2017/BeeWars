public class Arena {
    public static void main(String[] args) {
        Character player = new Character();
        Character enemy = new Character();
        CardDeck playerCardDeck = new CardDeck();
        playerCardDeck.addCard("1");
        playerCardDeck.addCard("2");
        System.out.println(playerCardDeck.cardFinalDeck);

        // Start fight
        String[] a = playerCardDeck.useCardFromFinalDeck("1");
        System.out.println(playerCardDeck.cardFinalDeck);
        System.out.println(player);
        System.out.println(a);
        player.getResource(a);
        System.out.println(player.hp);

    }
}
