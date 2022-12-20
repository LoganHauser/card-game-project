import java.util.ArrayList;

public class Hand {
    
    public int size; //Amount of cards this hand can have
    public ArrayList<Card> cards = new ArrayList<>(); //Arraylist for storing the cards

    //Constructor for a hand that takes a size value
    public Hand(int size) {
        this.size = size;
    }

    //Add a card to this hand if there is space.
    public void addCard(Card card) {
        if (this.cards.size() < this.size) {
            this.cards.add(card);
        }
    }

    //Print all cards in this hand
    public void printCards() {
        for (Card card : cards) {
            System.out.println(card);
        }
        System.out.println();
    }
}
