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
class BettingSystem{ //Card betting System
	
    protected int coins; //amount of coins a player has
    protected int bet; //amount of coins that a player bets
	
    BettingSystem(int bet1, int coins1) { //gathering player's bet
      coins = coins1;
      bet = bet1;
    }
	
	// Gets a player's coins amount
	public int getCoins() {
		return coins;
	}
	
// Adds a player's bet from their coins if they win. Resets bet to continue players.
	public void win() {
		coins += bet;
		bet = 0;
	}

  public void win2() {
		coins += bet*1.5;
		bet = 0;
	}

  public void tie() {
		coins -= bet/2;
		bet = 0;
	}

  public void tie2() {
    coins -= bet/4;
		bet = 0;
  }
	// Removes a player's bet from their coins if they lose. Sets bet to zero afterwards.
	public void loss() {
		coins -= bet;
		bet = 0;
	}
	
	// This resets the coins to 0.
	public void resetcoins() {
		coins = 0;
	}
	
	//Awards extra score when a player get's blackjack
	public void blackjack() {
		coins += bet * 1.5;
		bet = 0;
	}
	
	
	// Gets a player's bet
	public int getBet(){
		return bet;
	}

}
