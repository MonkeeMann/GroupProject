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
                       𝕎𝕖𝕝𝕔𝕠𝕞𝕖 𝕥𝕠 𝔹𝕝𝕒𝕔𝕜𝕁𝕒𝕔𝕜! 𝕋𝕙𝕖 𝕘𝕠𝕒𝕝 𝕠𝕗 𝕥𝕙𝕖 𝕘𝕒𝕞𝕖 𝕚𝕤 𝕥𝕠 𝕘𝕖𝕥 𝕥𝕠 𝟚𝟙 𝕡𝕠𝕚𝕟𝕥𝕤. 𝕀𝕗 𝕪𝕠𝕦 𝕘𝕠 𝕠𝕧𝕖𝕣 𝟚𝟙 𝕡𝕠𝕚𝕟𝕥𝕤, 𝕪𝕠𝕦 𝕝𝕠𝕤𝕖. 
                       ℕ𝕦𝕞𝕓𝕖𝕣 𝕔𝕒𝕣𝕕𝕤 𝕙𝕒𝕧𝕖 𝕒 𝕡𝕠𝕚𝕟𝕥 𝕧𝕒𝕝𝕦𝕖 𝕖𝕢𝕦𝕒𝕝 𝕥𝕠 𝕥𝕙𝕖𝕚𝕣 𝕟𝕦𝕞𝕓𝕖𝕣. 𝔽𝕒𝕔𝕖 𝕔𝕒𝕣𝕕𝕤(𝕂, 𝕁, ℚ, 𝔸) 𝕒𝕣𝕖 𝟙𝟘 𝕡𝕠𝕚𝕟𝕥𝕤.""");
    
    
  }

  public static void printLossMessage() { //prints a randomly generated loss message
    Random rand = new Random();
    int action = rand.nextInt(4)+1;

    switch(action) {
      case 1: System.out.println("🄷🄾🅆 🄳🄾🄴🅂 🄸🅃 🄵🄴🄴🄻 🅃🄾 🄻🄾🅂🄴 🅃🄾 🅃🄷🄴 🄲🄾🄼🄿🅄🅃🄴🅁 🅈🄾🅄 🄳🅄🄽🄲🄴?"); 
      break;

      case 2: System.out.println("Gᵢₜ Gᵤd"); 
      break;

      case 3: System.out.println("ђคร คภץ๏ภє єשєг Շ๏ɭ๔ ץ๏ย ՇђคՇ ץ๏ย รยςк, єשєภ คՇ ςคг๔ ﻮค๓єร?"); 
      break;

      case 4: System.out.println("𝙂𝙤 𝙥𝙡𝙖𝙮 𝙢𝙞𝙣𝙚𝙘𝙧𝙖𝙛𝙩 𝙮𝙤𝙪 𝙣𝙚𝙧𝙙."); 
      break;

      
    }
  }

  public static void printWinMessage() { //prints a randomly generated loss message
    Random rand = new Random();
    int action = rand.nextInt(4)+1;

    switch(action) {
      case 1: System.out.println("🆈🅾🆄'🆁🅴 🅽🅾🆃 🆂🆄🅿🅿🅾🆂🅴🅳 🆃🅾 🅺🅽🅾🆆 🅷🅾🆆 🆃🅾 🅿🅻🅰🆈 🅽🅴🆆-🅶🅴🅽."); 
      break;

      case 2: System.out.println("Ⓗⓐⓧⓧⓧⓧⓧⓧⓧ");
      break;

      case 3: System.out.println("Ⓖⓞ ⓖⓐⓜⓑⓛⓔ ⓢⓞⓜⓔⓦⓗⓔⓡⓔ ⓔⓛⓢⓔ    ,⃝ Ⓘ ⓞⓝⓛⓨ ⓐⓒⓒⓔⓟⓣ ⓖⓐⓜⓔⓢ ⓕⓡⓞⓜ ⓛⓞⓢⓔⓡⓢ");
      break;

      case 4: System.out.println("𝔊𝔬 𝔤𝔞𝔪𝔟𝔩𝔢 𝔰𝔬𝔪𝔢𝔴𝔥𝔢𝔯𝔢 𝔢𝔩𝔰𝔢, ℑ 𝔬𝔫𝔩𝔶 𝔞𝔠𝔠𝔢𝔭𝔱 𝔤𝔞𝔪𝔢𝔰 𝔣𝔯𝔬𝔪 𝔩𝔬𝔰𝔢𝔯𝔰");
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

            System.out.println("𝔹𝕖𝕔𝕒𝕦𝕤𝕖 𝕠𝕗 𝕪𝕠𝕦𝕣 𝕚𝕟𝕒𝕓𝕚𝕝𝕚𝕥𝕪 𝕥𝕠 𝕒𝕔𝕥𝕦𝕒𝕝𝕝𝕪 𝕡𝕣𝕖𝕤𝕤 𝕒 𝕓𝕦𝕥𝕥𝕠𝕟, 𝕀 𝕨𝕚𝕝𝕝 𝕟𝕠𝕨 𝕥𝕒𝕜𝕖 𝕪𝕠𝕦𝕣 𝕞𝕠𝕟𝕖𝕪 (𝕒𝕝𝕠𝕟𝕘 𝕨𝕚𝕥𝕙 𝕪𝕠𝕦𝕣 𝕤𝕠𝕔𝕚𝕒𝕝 𝕤𝕖𝕔𝕦𝕣𝕚𝕥𝕪, 𝕔𝕣𝕖𝕕𝕚𝕥 𝕔𝕒𝕣𝕕, 𝕒𝕟𝕕 𝕚𝕡 𝕟𝕦𝕞𝕓𝕖𝕣𝕤."); 
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

       
    
