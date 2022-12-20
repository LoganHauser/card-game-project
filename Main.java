import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {

        Deck deck = new Deck(); //Create a deck object
        deck.shuffle(); //Shuffle the deck

        ArrayList<Hand> hands = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            hands.add(new Hand(5));      //Create 5 hand objects and add
            deck.addCardsToHand(hands.get(i));//random cards to each from the deck
        }

        //Print each hand's cards
        for (int i = 0; i < hands.size(); i++) {
            System.out.println("Hand " + (i + 1) + ":");
            hands.get(i).printCards();
        }

        //Compare hand 3's 5th card with hand 5's 2nd card and print the result.
        System.out.println(hands.get(2).cards.get(4).compareWithCard(hands.get(4).cards.get(1)));
    }
}
