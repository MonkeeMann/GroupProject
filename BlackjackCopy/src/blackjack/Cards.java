/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author mepig
 */
import java.util.Random;

class Cards{
    private boolean deck[];//array of all cards, each index has a boolean to check if a card has been drawn or not
    private String suitArray[]; //array of suits
    private String valueArray[];//array of card values
    private String icons[];
    private String cardString = "";
    private int score = 0;
    
    
    public Cards(){
        deck =  new boolean[52];//creates deck
        suitArray = new String[4]; //creates array of suits
        suitArray[0] = "Clubs";
        suitArray[1] = "Diamonds";
        suitArray[2] = "Hearts";
        suitArray[3] = "Spades";
        valueArray = new String[13];//creates array of values
        for (int x = 0; x<9; x++){
            valueArray[x] = Integer.toString(x+2);
        }
        valueArray[9] = "J";
        valueArray[10] = "Q";
        valueArray[11] = "K";
        valueArray[12] = "A";
        icons = new String[4];
        icons[0] = "♣";
        icons[1] = "♦";
        icons[2] = "♥";
        icons[3] = "♠";
    }
    
    
    public String draw(){ //chooses random index in deck
        //sets index = false to signal we already drew the card, then calls toString
        
        Random rand = new Random();
        int card = rand.nextInt(51);
        
        while (deck[card] == false) { //generates a random card that has not been already drawn
        card = rand.nextInt(51);
        }
        deck[card] = false; //sets the index in deck to false so that it isn't drawn again
        cardString += toString(card);
        return (cardString);
    }
    public String toString(int index){
        //based on the int division, so all indexes 0-12 would be clubs, 13-25 would be diamonds, etc. 
        int num1 = index/13;
        String suit = icons[num1];
        //based on mod, so all indexes with % 13 = 1 would have value 2, % 13 = 2 would have value 3, etc. 
        int num2 = index%13;
        String cardValue = valueArray[num2];
        if (num2>=0 && num2<=8){
            score+=(num2+2);
        }
        else if(num2>=9 &&num2<=12){
            score+=10;
        }
        return(cardValue + suit);
        //prints out value and suit
        
    }
    //resets the deck, setting all array indexs to be true so they can be drawn
    public void shuffle(){
        for(int x = 0; x<52; x++){
            deck[x] = true;
        }
    }
    
    public String getCards() {
        return cardString;
    }
    
    public int getScore(){
        return score;
    }
    
    
}
