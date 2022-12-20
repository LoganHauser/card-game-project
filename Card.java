public class Card implements Comparable<Card> {
    public Value value;
    public Suit suit;

    //Constructor for a card that accepts a value and suit.
    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    //Returs the name of a card as a string
    @Override
    public String toString() {
        return value.toString().toLowerCase() + " of " + suit.toString().toLowerCase();
    }

    //Returns -1 if this card's value is less than the card being compared to,
    // 1 if it is greater, and 0 if the values are the same
    @Override
    public int compareTo(Card o) {
        if (this.value.compareTo(o.value) < 0) {
            return -1;
        }
        if (this.value.compareTo(o.value) > 0) {
            return 1;
        }
        return 0;
    }

    public String compareWithCard(Card card) {
        switch (this.compareTo(card)) {
            case -1:
                return "Card1 (" + this.toString() + ") is less than Card2 (" + card.toString() + ")";
            case 1:
                return "Card1 (" + this.toString() + ") is greater than Card2 (" + card.toString() + ")";
            case 0:
                return "Card1 (" + this.toString() + ") is equal to Card2 (" + card.toString() + ")";
            default:
                return "";
        }
    }

    //Every value a card can have, in order from least to greatest
    public enum Value {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE
    }
    
    //Every suit a card can have
    public enum Suit {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }
}