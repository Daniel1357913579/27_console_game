import java.util.Random;
public class Main{
public static void main(String[] args){
  //addventurar
  //
  ///
  //Adventurer fighter1 = new Fighter("Bob",1000);
  Adventurer grenadier1 = new Grenadier("farmer",100);
  Adventurer grenadier2 = new Grenadier();
  System.out.println(grenadier1.getName());
  System.out.println(grenadier2.getName());
  System.out.println(grenadier1.toString() + " HP: " +grenadier1.getHP());
  System.out.println(grenadier2.toString() + " HP: " + grenadier2.getHP());
  System.out.println(grenadier1.toString() + " MaxHP: " + grenadier1.getmaxHP());
  System.out.println(grenadier2.toString() + " MaxHP: " + grenadier2.getmaxHP());
  System.out.println(grenadier1.toString() + " Special Attack Name: " + grenadier1.getSpecialName());
  System.out.println(grenadier2.toString() + " Special Attack Name: " + grenadier2.getSpecialName());
  System.out.println(grenadier1.toString() + " Special Attacks Left: " + grenadier1.getSpecial());
  System.out.println(grenadier2.toString() + " Special Attacks Left: " +grenadier2.getSpecial());
  System.out.println(grenadier1.toString() + " Maximum Special Attacks: " +grenadier1.getSpecialMax());
  System.out.println(grenadier2.toString() + " Maximum Special Attacks: " +grenadier2.getSpecialMax());
  System.out.println("Removing all Special Attacks");
  grenadier1.setSpecial(0);
  grenadier2.setSpecial(0);
  System.out.println("Restoring one Special Attack");
  grenadier1.restoreSpecial(1);
  grenadier2.restoreSpecial(1); 
  System.out.println(grenadier1.attack(grenadier2));
  System.out.println(grenadier2.attack(grenadier1));
  System.out.println(grenadier1.toString() + " HP: " + grenadier1.getHP());
  System.out.println(grenadier2.toString() + " HP: " + grenadier2.getHP());
  System.out.println(grenadier1.toString() + " "+grenadier1.getSpecialName() + ": "+grenadier1.getSpecial());
  System.out.println(grenadier2.toString() + " "+grenadier2.getSpecialName() + ": "+grenadier2.getSpecial());
  System.out.println(grenadier1.support(grenadier2));
  System.out.println(grenadier1.toString() + " HP: " + grenadier1.getHP());
  System.out.println(grenadier2.support(grenadier1));
  System.out.println(grenadier2.toString() + " HP: " + grenadier2.getHP());
  System.out.println("Setting both grenadier's MaxHP to 10000000");
  grenadier1.setmaxHP(10000000);
  grenadier2.setmaxHP(10000000);
  System.out.println(grenadier1.support());
  System.out.println(grenadier2.support());
  System.out.println("Setting both grenadier's MaxHP to 10");
  grenadier1.setmaxHP(10);
  grenadier2.setmaxHP(10);
  System.out.println(grenadier1.support());
  System.out.println(grenadier2.support());
  System.out.println(grenadier1.specialAttack(grenadier2));
  System.out.println(grenadier2.specialAttack(grenadier1));
  
  

  
//Adventurer snipper1 = new Sniper("snipper",100);

// give 2nd and 4th tier upgrades
}
public static void p(String k){
  System.out.println(k);
}
public static void p(int k){
  System.out.println(k);
}
public static void p(double k){
  System.out.println(k);
}
public static void p(Boolean k){
  System.out.println(k);
}
}
