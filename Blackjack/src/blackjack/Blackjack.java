/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.*;
/**
 *
 * @author mepig
 */
public class Blackjack { /*this game was meant to be part of a whole economy with other games so if you see certain things, it might be because of that. Use this code if you want.*/

 public static void printGameRules() { //prints the game rules
    System.out.println("""
                       πππππ ππ π₯π  πΉππππππππ! πππ ππ ππ π π π₯ππ ππππ ππ€ π₯π  πππ₯ π₯π  ππ π‘π πππ₯π€. ππ πͺπ π¦ ππ  π π§ππ£ ππ π‘π πππ₯π€, πͺπ π¦ ππ π€π. 
                       βπ¦ππππ£ πππ£ππ€ πππ§π π π‘π πππ₯ π§πππ¦π ππ’π¦ππ π₯π  π₯ππππ£ ππ¦ππππ£. π½πππ πππ£ππ€(π, π, β, πΈ) ππ£π ππ π‘π πππ₯π€.
                       ππ π¦ π€π₯ππ£π₯ π π¦π₯ π¨ππ₯π ππππ ππ πππ€ πππ π₯ππ ππ ππ ππ€ π₯π  πππ₯ ππ€ ππππͺ ππ€ πͺπ π¦ πππ. ππ πͺπ π¦ πππ₯ π ππ πππ€ πͺπ π¦ ππ π€π.
                       πΈππ€π , ππ¦π€π₯ π€π  πͺπ π¦ πππ π¨, π₯πππ£π ππ€ ππ  π¨ππͺ π π π¨ππππππ π₯πππ€. πΎπ π π ππ¦ππ!
                       βπ£ππ€π€ π π₯π  ππ©ππ₯ πππͺπ₯πππ.""");
    
    
  }

  public static void printLossMessage() { //prints a randomly generated loss message
    Random rand = new Random();
    int action = rand.nextInt(4)+1;

    switch(action) {
      case 1: System.out.println("π·πΎπ π³πΎπ΄π πΈπ π΅π΄π΄π» ππΎ π»πΎππ΄ ππΎ ππ·π΄ π²πΎπΌπΏπππ΄π ππΎπ π³ππ½π²π΄?"); 
      break;

      case 2: System.out.println("Gα΅’β Gα΅€d."); 
      break;

      case 3: System.out.println("π»ππ πΉπππ πΎπ π»πππ ππππΎππ ππ ππ½π πΈπππππππ πππππΎπ?"); 
      break;

      case 4: System.out.println("ππ€ π₯π‘ππ? π’ππ£πππ§πππ© π?π€πͺ π£ππ§π."); 
      break;

      
    }
  }

  public static void printWinMessage() { //prints a randomly generated loss message
    Random rand = new Random();
    int action = rand.nextInt(4)+1;

    switch(action) {
      case 1: System.out.println("ππΎπ'ππ΄ π½πΎπ πππΏπΏπΎππ΄π³ ππΎ πΊπ½πΎπ π·πΎπ ππΎ πΏπ»π°π π½π΄π-πΆπ΄π½."); 
      break;

      case 2: System.out.println("Nice β½ββ§β§β§β§β§β§β§ Kid.");
      break;

      case 3: System.out.println("βΌβ ββββββ β’ββββ¦βββ‘β βββ’ββ―Β Β β―,β βΎ ββββ¨ ββββββ£ βββββ’ ββ‘ββ βββ’ββ‘β’");
      break;

      case 4: System.out.println("ππ¬ π€ππͺππ©π’ π°π¬πͺπ’π΄π₯π’π―π’ π’π©π°π’, β π¬π«π©πΆ ππ π π’π­π± π€ππͺπ’π° π£π―π¬πͺ π©π¬π°π’π―π°.");
      break;

      
    }
  }
  
  public static void main(String[] args) {
  
    
    Scanner scan = new Scanner(System.in);
    Cards crd = new Cards();
    ComputerCards ccrd =new ComputerCards();
    Random rand = new Random();
    BettingSystem easteregg = new BettingSystem(100, 10000); //lets you start off with more coins if you can activate the easter egg
    
    printGameRules(); //prints the game rules
    
    int bet = 0;
    
    int random = 0;
    int tempcoins = 0;
    boolean bett = false;
    boolean resultsdisplayed = false; //prevents the results from displaying more than once
    boolean discover = false; //only lets you discover the easter egg once
    boolean playing = true; //boolean to determine if game is repeated or not
    BettingSystem bs = new BettingSystem(bet, 1000);
    
    while (playing == true) {
        resultsdisplayed = false;
        crd.resetScore();
        crd.resetCards();
        ccrd.resetScore();
        ccrd.resetCards();
        bet = 0;
        bett = false;
        
        if (bs.getCoins() < 250) {
            System.out.println("GaMe oveR. You lOsT ahaHAHAh. yOu ENdED uP wIth 0 coiNS.");
            System.exit(1);
            
        }
        
        while (bett == false) { //repeats until a valid bet is entered
            
            System.out.println("ππ¨π’π§π¬: " + bs.getCoins());
            System.out.print("ππ²π ππΊπΌππ»π: ");
            bet = scan.nextInt(); //waits from input ready message from player
    
            if ((bet == 69 || bet == 420 || bet == 12345 || bet==21 || bet==19) && discover == false) { /*gives you coins if you get the easter egg and you haven't done it before. don't tell anyone this, but if you enter a meme number it activates.*/

                int coins = rand.nextInt(100000)+1;
                System.out.println("You truly are a dank memer. Take these " + coins + " coins as a reward!");
                easteregg.awardCoins(coins);
                discover = true;
            }
    
            else if ((bet == 69 || bet == 420 || bet == 12345 || bet==21) && discover == true) {
        
                System.out.println("SToP TrYiNg tO KhEaT YoU GrEeDy aMaTeUr. ThE GeNiUsEs tHaT KrEaTeD Me wOuLdN'T LeT YoU GeT AwAy wItH ThAt.");
       
            }
            
            else if (bet > bs.getCoins()) {
        
                System.out.println("You only have " + bs.getCoins() + " coins fool.");
       
            }
        
            else if (bet <= 249) {
                random = rand.nextInt(4)+1;
            
                switch (random) {
                    case 1: System.out.println("You can't bet under 250 coins sorry, not really sorry.");
                    break;
                    case 2: System.out.println("Bet more coins nerd. You need at least 250 coins.");
                    break;
                    case 3: System.out.println("Stop bothering me if you can't bet 250 coins.");
                    break;
                    case 4: System.out.println("Bet.exe has stopped work. System.error.detected. Engaging self destruction. "); //stops code if you're unlucky
                    System.out.print("By the way, you had: " + bs.getCoins() + " ππ¨π’π§π¬.");
                    System.exit(1);
                
                }
        
            }
    
            if (bet >= 250) {
                
                break;
            
            }
    
    }
    
        bs = new BettingSystem(bet, bs.getCoins()); //syncs the amount of coins over
        String choice = "";
        int turn = 1;
        int computerturn = 1;
        boolean gameOver = false;
        boolean computerGameOver = false;
    
     
    while(gameOver == false || computerGameOver == false){ // the actual game, repeats until the results are clear
        
        if (turn >= 4) {
            gameOver = true;
            
            break;
        }
        
        if (computerturn >= 4) {
            
            computerGameOver = true;
            break;
        }
        
        if (crd.getScore() >= 21 || ccrd.getComputerScore() >= 21) {
          gameOver = true;
          computerGameOver = true;
          break;
        }
        
        if (turn == 1) {  //players turn
        
        crd.shuffle();
        crd.draw();
        crd.draw();
        turn += 1;
        
        }
        
        else if (turn >= 2 && gameOver == false) {
        turn += 1;
        crd.draw();
        
        }
        
        if (computerturn == 1) { //plays computers turn
        computerturn++;
        ccrd.shuffle();
        ccrd.drawForComputer();
        ccrd.drawForComputer();
        }
      
        else if (computerturn >= 2 && computerGameOver == false && (ccrd.getComputerScore() < 17 || crd.getScore() > ccrd.getComputerScore())) { //draws for computer is computer score is under 17
        computerturn += 1;
        ccrd.drawForComputer();
        
        }
        
        else if (computerturn >= 2 && computerGameOver == false && ccrd.getComputerScore() >= 17) {
            
            computerGameOver = true;
        }
       
       
        if (crd.getScore() >= 21 || ccrd.getComputerScore() >= 21) {
          
            gameOver = true;
            computerGameOver = true;
            break;
        }
        
      
        if (gameOver == false) {
            
            System.out.println("Cards: " + crd.getCards() + " || Budget Memer Cards: " + ccrd.getComputerCards()); //prints outscore
            System.out.println("Total: "+ crd.getScore() + " || Budget Memer Total: " + ccrd.getComputerScore());
            if (gameOver == false) {
            System.out.println("Type h to hit, type s to stand, or e to exit.");
            choice = scan.next();
            }
        
        }    
      
        if (!choice.toLowerCase().equals("h")&&!choice.toLowerCase().equals("s")&&!choice.toLowerCase().equals("e") && gameOver == false){

            System.out.println("πΉππππ¦π€π π π πͺπ π¦π£ ππππππππ₯πͺ π₯π  πππ₯π¦ππππͺ π‘π£ππ€π€ π ππ¦π₯π₯π π, π π¨πππ ππ π¨ π₯πππ πͺπ π¦π£ ππ πππͺ (πππ ππ π¨ππ₯π πͺπ π¦π£ π€π ππππ π€πππ¦π£ππ₯πͺ, ππ£ππππ₯ πππ£π, πππ ππ‘ ππ¦ππππ£π€."); 
            gameOver = true;
                    
        }
                
        else if(choice.toLowerCase().equals("s")){

            gameOver = true;
            

        }
        
        else if(choice.toLowerCase().equals("e")){

            System.out.println("You ended the game with " + bs.getCoins() + " coins in your wallet. GG's");
            System.exit(1);

        }
                
        else if(choice.toLowerCase().equals("h")){
            if (turn >= 4) {
                System.out.println("You can't hit anymore! You already hit twice dummy.");
            }
            
            
    }
        
                        
    }
    
    if (gameOver == true && computerGameOver == true && resultsdisplayed == false) {
    System.out.println("ππΆπ»π?πΉ π΅π?π»π±: "); //prints out the final hand of cards
    System.out.println("Cards: " + crd.getCards() + " || Budget Memer Cards: " + ccrd.getComputerCards()); 
    System.out.println("Total: "+ crd.getScore() + " || Budget Memer Total: " + ccrd.getComputerScore());
    resultsdisplayed = true;
        

        
    //compares total values and gets result
    if(crd.getScore() > 21 && ccrd.getComputerScore() > 21){ //if you both bust ,you both lose
        System.out.println("You both lost lol.");
        printLossMessage();
        bs.loss();
        continue;
      }
    
    else if(crd.getScore() <= 21 && ccrd.getComputerScore() > 21){ //if the computer busts but you dont you win
        System.out.println("You win! Your opponent busted.");
        printWinMessage();
        bs.win();
        continue;
      }
    
    else if(crd.getScore() > 21 && ccrd.getComputerScore() <= 21){ //if the computer busts but you dont you win
        System.out.println("You lose! You took way to many cards.");
        printLossMessage();
        bs.loss();
        continue;
      }
    
     else if(crd.getScore() < 21 && ccrd.getComputerScore() == 21){ //if the computer busts but you dont you win
        System.out.println("You lose! Budget Memer achieved blackjack.");
        printLossMessage();
        bs.loss();
        continue;
      }
     
    else if (crd.getScore() < ccrd.getComputerScore() && ccrd.getComputerScore() < 21 && crd.getScore() < 21) { //if both scores are under 21 and the computer score is greater
        System.out.println("You lost " + bs.getBet() + " coins. Noob.");
        printLossMessage();
        bs.loss();
        continue;
      }
    
    else if(crd.getScore() == 21 && ccrd.getComputerScore() != 21){ //if you get blackjack but the computer doesn't
        
        System.out.println("You won! Since you got blackjack, you get 50% more profit.");
        bs.win2();
        printWinMessage();
        continue;
      }
    
    else if(crd.getScore() == 21 && ccrd.getComputerScore() != 21){ //if the computer gets blackjack but you don't.
        
        System.out.println("You lose! NEEEEERDDDDDD");
        bs.loss();
        printLossMessage();
        continue;
      
    }
    
   
    else if (ccrd.getComputerScore() == 21 && crd.getScore() == 21) { //if you both get 21, you lost 25% of your bet
      
        System.out.println("It's a tie! Since you both got BlackJack you only lose 25% of your bet!");
        bs.tie2();
        continue;

      }

    else if (ccrd.getComputerScore() == crd.getScore() && ccrd.getComputerScore() < 21 && crd.getScore() < 21) {//if it's a tie player loses 50% of their bet
        
        System.out.println("It's a tie! You lose 50% of your bet!");
        bs.tie();
        continue;
    
    }

    else if (crd.getScore() > ccrd.getComputerScore() && ccrd.getComputerScore() < 21 && crd.getScore() < 21) { // if you both get under 21, but your score is higher
      
      
        System.out.println("You win! Your cards totaled more than your opponent. Your bet is now magically doubled.");
        printWinMessage();
        bs.win();
        continue;
     
    }
    
    
}
} 
    
    
}
}  

       
    
