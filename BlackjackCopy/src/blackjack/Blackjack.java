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
public class Blackjack {

 public static void printGameRules() { //prints the game rules
    System.out.println("""
                       ๐๐๐๐๐ ๐๐ ๐ฅ๐  ๐น๐๐๐๐๐๐๐๐! ๐๐๐ ๐๐ ๐๐ ๐ ๐ ๐ฅ๐๐ ๐๐๐๐ ๐๐ค ๐ฅ๐  ๐๐๐ฅ ๐ฅ๐  ๐๐ ๐ก๐ ๐๐๐ฅ๐ค. ๐๐ ๐ช๐ ๐ฆ ๐๐  ๐ ๐ง๐๐ฃ ๐๐ ๐ก๐ ๐๐๐ฅ๐ค, ๐ช๐ ๐ฆ ๐๐ ๐ค๐. 
                       โ๐ฆ๐๐๐๐ฃ ๐๐๐ฃ๐๐ค ๐๐๐ง๐ ๐ ๐ก๐ ๐๐๐ฅ ๐ง๐๐๐ฆ๐ ๐๐ข๐ฆ๐๐ ๐ฅ๐  ๐ฅ๐๐๐๐ฃ ๐๐ฆ๐๐๐๐ฃ. ๐ฝ๐๐๐ ๐๐๐ฃ๐๐ค(๐, ๐, โ, ๐ธ) ๐๐ฃ๐ ๐๐ ๐ก๐ ๐๐๐ฅ๐ค.""");
    
    
  }

  public static void printLossMessage() { //prints a randomly generated loss message
    Random rand = new Random();
    int action = rand.nextInt(4)+1;

    switch(action) {
      case 1: System.out.println("๐ท๐พ๐ ๐ณ๐พ๐ด๐ ๐ธ๐ ๐ต๐ด๐ด๐ป ๐๐พ ๐ป๐พ๐๐ด ๐๐พ ๐๐ท๐ด ๐ฒ๐พ๐ผ๐ฟ๐๐๐ด๐ ๐๐พ๐ ๐ณ๐๐ฝ๐ฒ๐ด?"); 
      break;

      case 2: System.out.println("Gแตขโ Gแตคd"); 
      break;

      case 3: System.out.println("ัเธเธฃ เธเธ ืฅเนเธ ั ัืฉัะณ ีเนษญเน ืฅเนเธข ีัเธี ืฅเนเธข เธฃเธขฯะบ, ัืฉัเธ  เธี ฯเธะณเน ๏ปฎเธเนัเธฃ?"); 
      break;

      case 4: System.out.println("๐๐ค ๐ฅ๐ก๐๐ฎ ๐ข๐๐ฃ๐๐๐ง๐๐๐ฉ ๐ฎ๐ค๐ช ๐ฃ๐๐ง๐."); 
      break;

      
    }
  }

  public static void printWinMessage() { //prints a randomly generated loss message
    Random rand = new Random();
    int action = rand.nextInt(4)+1;

    switch(action) {
      case 1: System.out.println("๐๐พ๐'๐๐ด ๐ฝ๐พ๐ ๐๐๐ฟ๐ฟ๐พ๐๐ด๐ณ ๐๐พ ๐บ๐ฝ๐พ๐ ๐ท๐พ๐ ๐๐พ ๐ฟ๐ป๐ฐ๐ ๐ฝ๐ด๐-๐ถ๐ด๐ฝ."); 
      break;

      case 2: System.out.println("โฝโโงโงโงโงโงโงโง");
      break;

      case 3: System.out.println("โผโ โโโโโโ โขโโโโฆโโโกโ โโโขโโฏย ย โฏ,โ โพ โโโโจ โโโโโโฃ โโโโโข โโกโโ โโโขโโกโข");
      break;

      case 4: System.out.println("๐๐ฌ ๐ค๐๐ช๐๐ฉ๐ข ๐ฐ๐ฌ๐ช๐ข๐ด๐ฅ๐ข๐ฏ๐ข ๐ข๐ฉ๐ฐ๐ข, โ ๐ฌ๐ซ๐ฉ๐ถ ๐๐ ๐ ๐ข๐ญ๐ฑ ๐ค๐๐ช๐ข๐ฐ ๐ฃ๐ฏ๐ฌ๐ช ๐ฉ๐ฌ๐ฐ๐ข๐ฏ๐ฐ");
      break;

      
    }
  }
  
  public static void main(String[] args) {
  
    
    Scanner scan = new Scanner(System.in);
    Cards crd = new Cards();
    ComputerCards ccrd =new ComputerCards();
    Random rand = new Random();
    int random = 0;
    
    printGameRules(); //prints the game rules
    int bet = 0;
    boolean bett = false;
    
    while (bett == false) {
    System.out.print("Bet Amount: ");
    bet = scan.nextInt(); //waits from input ready message from player
    if (bet <= 99) {
        random = rand.nextInt(4)+1;
        switch (random) {
            case 1: System.out.println("You can't bet under 100 coins sorry, not really sorry.");
            break;
            case 2: System.out.println("Bet more coins nerd. You need at least 100 coins.");
            break;
            case 3: System.out.println("Stop bothering me if you can't bet 100 coins.");
            break;
            case 4: System.out.println("Bet.exe has stopped work. System.error.detected. Engaging self destruction. ");
            System.exit(1);
            
            break;
        }
        
    }
    
    else {
        
        bett = true;
    }
    
    }
    
    BettingSystem bs = new BettingSystem(bet, 1000);
    String choice = "";
    int turn = 1;
    int computerturn = 1;
    
    boolean gameOver = false;
    boolean computerGameOver = false;
    
     
    while(gameOver == false || computerGameOver == false){
        
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
            System.out.println("Type h to hit or type s to stand.");
            choice = scan.next();
        
        }    
      
        if (!choice.toLowerCase().equals("h")&&!choice.toLowerCase().equals("s") && gameOver == false){

            System.out.println("๐น๐๐๐๐ฆ๐ค๐ ๐ ๐ ๐ช๐ ๐ฆ๐ฃ ๐๐๐๐๐๐๐๐ฅ๐ช ๐ฅ๐  ๐๐๐ฅ๐ฆ๐๐๐๐ช ๐ก๐ฃ๐๐ค๐ค ๐ ๐๐ฆ๐ฅ๐ฅ๐ ๐, ๐ ๐จ๐๐๐ ๐๐ ๐จ ๐ฅ๐๐๐ ๐ช๐ ๐ฆ๐ฃ ๐๐ ๐๐๐ช (๐๐๐ ๐๐ ๐จ๐๐ฅ๐ ๐ช๐ ๐ฆ๐ฃ ๐ค๐ ๐๐๐๐ ๐ค๐๐๐ฆ๐ฃ๐๐ฅ๐ช, ๐๐ฃ๐๐๐๐ฅ ๐๐๐ฃ๐, ๐๐๐ ๐๐ก ๐๐ฆ๐๐๐๐ฃ๐ค."); 
            gameOver = true;
                    
        }
                
        else if(choice.toLowerCase().equals("s")){

            gameOver = true;
            continue;

        }
                
        else if(choice.toLowerCase().equals("h")){
            if (turn >= 4) {
                System.out.println("You can't hit anymore!");
            }
            continue;

        }
        
                        
    }
    
    System.out.println("Final hand: "); //prints out the final hand of cards
    System.out.println("Cards: " + crd.getCards() + " || Budget Memer Cards: " + ccrd.getComputerCards()); 
    System.out.println("Total: "+ crd.getScore() + " || Budget Memer Total: " + ccrd.getComputerScore());
    
        

        
//compares total values and gets result
    if(crd.getScore()>21 && ccrd.getComputerScore()>21){ //if you both bust ,you both lose
        System.out.println("You both lost lol");
        printLossMessage();
        bs.loss();
      }
    
    else if(crd.getScore()<=21 && ccrd.getComputerScore()>21){ //if the computer busts but you dont you win
        System.out.println("You win! Your opponent busted.");
        printWinMessage();
        bs.win();
      }
    
    else if(crd.getScore()>21 && ccrd.getComputerScore()<=21){ //if the computer busts but you dont you win
        System.out.println("You lose! You took way to many cards.");
        printLossMessage();
        bs.loss();
      }
    
    else if (crd.getScore() < ccrd.getComputerScore() && ccrd.getComputerScore() < 21 && crd.getScore() < 21) { //if both scores are under 21 and the computer score is greater
        System.out.println("You lost " + bs.getBet() + " coins. Noob.");
        printLossMessage();
        bs.loss();

      }
    
    else if(crd.getScore()==21 && ccrd.getComputerScore()!=21){ //if you get blackjack but the computer doesn't
          System.out.println("You won! Since you got blackjack, you get 50% more profit.");
          printWinMessage();
          bs.win2();
      }
    
    else if(crd.getScore()==21 && ccrd.getComputerScore()!=21){ //if the computer gets blackjack but you don't.
          System.out.println("You lose! NEEEEERDDDD");
          bs.loss();
          printLossMessage();
      }
    
    
    else if (ccrd.getComputerScore() == 21 && crd.getScore() == 21) { //if you both get 21, you lost 25% of your bet
      
      System.out.println("It's a tie! Since you both got BlackJack you only lose 25% of your bet!");
      bs.tie2();

      }

    else if (ccrd.getComputerScore() == crd.getScore() && ccrd.getComputerScore() < 21 && crd.getScore() < 21) {//if it's a tie player loses 50% of their bet
        
      System.out.println("It's a tie! You lose 50% of your bet!");
      bs.tie();
    
    }

    else if (crd.getScore() > ccrd.getComputerScore() && ccrd.getComputerScore() < 21 && crd.getScore() < 21) { // if you both get under 21, but your score is higher
      
      printWinMessage();
      System.out.println("You win! Your cards totaled more than your opponent. Your bet is now magically doubled.");
      bs.win();
     
     }
     
     
    
      


    }
}  

       
    
