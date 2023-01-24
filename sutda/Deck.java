package sutda;

class Deck {
    final int CARD_NUM = 20;

    Card[] cards = new Card[CARD_NUM];

    Deck() {
        for (int i=0; i<cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = ((i < cards.length/2) && (num == 1 || num == 3 || num == 8));

            cards[i] = new Card(num, isKwang);
        }
    }

    void shuffle() {
        for (int i=0; i<cards.length; i++) {
            int j = (int) (Math.random() * CARD_NUM);
            Card tmp = cards[j];
            cards[j] = cards[i];
            cards[i] = tmp;
        }
    }

    Card pick() {
        int card = (int) (Math.random() * CARD_NUM);
        return cards[card];
    }
}
