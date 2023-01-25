package exercise1;
import java.util.Scanner; 
import java.util.Random; 
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Mark Machado Jan 25, 2022 
  
 */
public class CardTrick {
    
    public static void main(String[] args) {
     Card[] hand = new Card[7];
        Random random = new Random(); 
        Scanner input = new Scanner(System.in); 

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)  (Math.random() * 13) +1);  
            card.setSuit(Card.SUITS[random.nextInt(4)]); 
           
            System.out.println(card.getValue() + " " + card.getSuit()); 
            hand[i] = card; 
        }
            
         
        System.out.println("Please enter a value for your card. Enter a number between and 1 and 13.");
        int value = input.nextInt(); 
        
        System.out.println("Please enter a suit for your card. Enter a number between 0 and 3."); 
        String suits = input.next(); 
        int num = Integer.parseInt(suits); 
        
        Card selected = new Card(); 
        selected.setValue(value);
        selected.setSuit(Card.SUITS[num]); 
       
        selected.getValue();
        selected.getSuit();
         
         
        System.out.println("Your card is: " + selected.getValue() + " of " + selected.getSuit()); 
        
 
        
        for (int i = 0; i < 1; i++) {
            if((hand[i] .getValue() == selected.getValue() && hand[i].getSuit().equals(selected.getSuit()))) {
                printInfo();  }
            else{
                System.out.println("Oh no incorrect guess.");
                    
        } 
               
               
        
      
        } 
        
  

   
        
    } 
    
    
    
      private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println(); }
}

   
 
    


