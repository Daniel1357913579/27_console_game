import java.util.Random;
import java.util.Scanner;
public class Game{
public static void main(String[] args){
  Adventurer playerRole = null;
  Adventurer enemyRole;
  String playerAction;
  double enemyCharacter = Math.random();
  double enemyAction = Math.random();
  if (enemyCharacter < (1.0/3.0)){
    enemyRole = new Fighter();
  }
  else if (enemyCharacter < (2.0/3.0)){
    enemyRole = new Grenadier();
  }
  else {
    enemyRole = new Sniper();
  }
  Scanner p = new Scanner(System.in);

  boolean inputRejected = true;

  System.out.println("Choose a job: \n Fighter \n Grenadier \n Sniper");
  String playerCharacter = p.nextLine();
  while(playerRole == null) {
    if (playerCharacter.equals("Fighter")){
      playerRole = new Fighter();
    } else {
      if(playerCharacter.equals("Grenadier")){
        playerRole = new Grenadier();
      } else {
        if(playerCharacter.equals("Sniper")){
          playerRole = new Sniper();
        } else {
          System.out.println("Invalid Input. Please choose a job: \n Fighter \n Grenadier \n Sniper");
          playerCharacter = p.nextLine();
        }
      }
    }
  }

  inputRejected = true;
  for (int i = 0; i <  2147483647; i++){
    if (playerRole.getHP() > 0){
      System.out.println("Your Statistics: \n ROLE: " + playerRole.getName() + "\n HP: " + playerRole.getHP() + "\n Special Attack Name: " + playerRole.getSpecialName() + "\n Special Attacks Left: " + playerRole.getSpecial());
      System.out.println("Enemy Statistics: \n ROLE: " + enemyRole.getName() + "\n HP: " + enemyRole.getHP() + "\n Special Attack Name: " + enemyRole.getSpecialName() + "\n Special Attacks Left: " + enemyRole.getSpecial());
      System.out.println("PLAYER TURN \n Type: attack / special / support / quit");
  //    playerAction = p.nextLine();

      inputRejected = true;
      while(inputRejected) {
        playerAction = p.nextLine();
        if (playerAction.equals("a") || playerAction.equals("attack")){
          System.out.println(playerRole.attack(enemyRole));
          inputRejected = false;
        }
        else if (playerAction.equals("sp") || playerAction.equals("special")){
          System.out.println(playerRole.specialAttack(enemyRole));
          inputRejected = false;
        }
        else if (playerAction.equals("su") || playerAction.equals("support")){
          System.out.println(playerRole.support());
          inputRejected = false;
        }
        else if (playerAction.equals("quit")){
          System.out.println("You quit the game.");
          p.close();
          System.exit(0);
        } else{
          System.out.println("Invalid input. Type: attack / special / support / quit");
        }// ok
//kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
}
    } else{
      System.out.println("Your character has died");
      System.out.println("You have lost");
      p.close();
      System.exit(0);
    }

    if (enemyRole.getHP() > 0){
    System.out.println("ENEMY TURN");
      enemyAction = Math.random();
      if (enemyAction < 1.0/3.0){
        System.out.println(enemyRole.attack(playerRole));
      }
      else if(enemyAction < 2.0/3.0){
        System.out.println(enemyRole.support());
      }
      else{
        System.out.println(enemyRole.specialAttack(playerRole));
      } // random action
    } else{
      System.out.println("The enemy has died");
      System.out.println(" You have won!");
      p.close();
      System.exit(0);
    }

    } // end for loop


    /////////end pvsm
    }
  }
