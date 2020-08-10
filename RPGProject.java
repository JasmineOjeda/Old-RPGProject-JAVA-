/** * Epic game, sort of. Still a work in progress, though. * 
    * Jasmine Ojeda * 10-30-18 */ 
	
import java.util.Scanner;
import java.util.Random; 

public class RPGProject { 
	public static void main(String[]args) { 
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int enemyAppearance = rand.nextInt(2); 
		
		System.out.println("* * * * * * * * * * * * * * * *"); 
		System.out.println("Name your character!!!!"); 
		String name = scan.nextLine(); 
		int userHP = 50; 
		int enemyHP = 100; 
		int instaDeath = rand.nextInt(1000); 
		
		if(instaDeath == 666) { 
			userHP = 0;
		} 
		else if(enemyAppearance == 0) { 
			if(battleDragon(name, userHP, enemyHP)) { 
				enemyHP = 0; 
			} 
			else { 
				userHP = 0; 
			}
		}
		else if(enemyAppearance == 1)
		{ 
			if(battleSkeletonWarrior(name, userHP, enemyHP)) { 
				enemyHP = 0; 
			} 
			else { 
				userHP = 0;
			} 
		}
		else if(enemyAppearance == 2) { 
			if(battleLurker(name, userHP, enemyHP)) { 
				enemyHP = 0; 
			}
			else { 
				userHP = 0; 
			} 
		} 
		
		if(userHP == 0) { 
			System.out.println(name+" was killed in battle!");
			System.out.println(" GAME OVER "); 
		}
		else if(enemyHP == 0) { 
			System.out.println(name+" slayed the enemy!");
			System.out.println(" * * * *YOU WIN* * * * ");
		}
	}
	
	private static Boolean battleDragon(String n, int uHP, int eHP) { 
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		Boolean result = false; 
		System.out.println("The mighty, fiery dragon NOGARDEHT appears!!!\n\n");
		
		while(uHP > 0 && eHP > 0) {
			System.out.println("* * * * * * * * * * * * * * * *"); 
			System.out.println(" What will "+n+" do?"); 
			System.out.println("{"+n+" HP: "+uHP+" Nogardeht HP: "+eHP+"}");
			System.out.println("[HEAL] [MAGIC] [SWORD] [FLEE]]"); String choice = scan.nextLine(); 
		
			int choiceEffect = rand.nextInt(3);
			int enemyEffect = rand.nextInt(3);
			int userAction = rand.nextInt(1); 
		
			if(choice.equalsIgnoreCase("heal")) { 
				if(uHP < 50) { 
					System.out.println("\n"+n+" healed themself!\n");
					if(choiceEffect == 0) { 
						uHP += 1;
						if(uHP > 50) { 
							uHP = 50;
						}
						System.out.println(n+" was healed by 1 HP!\n");
					}
					else if(choiceEffect == 1) { 
						uHP += 5;
						if(uHP > 50) { 
							uHP = 50;
						}
						System.out.println(n+" was healed by 5 HP!\n");
					}
					else if(choiceEffect == 2) { 
						uHP += 15;
						if(uHP > 50) { 
							uHP = 50;
						}
						System.out.println(n+" was healed by 15 HP!\n");
					} 
					else if(choiceEffect == 3) { 
						uHP += 20; 
						if(uHP > 50) { 
							uHP = 50;
						}
						System.out.println(n+" was healed by 20 HP!\n"); 
					} 
				}
				else { 
					System.out.println(n+" is already at full health!\n");
				}
			} 
			else if(choice.equals("magic")) { 
				if(choiceEffect == 0) { 
					eHP -= 5;
					System.out.println(n+" used BASIC magic!");
					System.out.println("NOGARDEHT took 5 damage!\n");
				} 
				else if(choiceEffect == 1) { 
					eHP -= 10;
					System.out.println(n+" used COMPLEX magic!");
					System.out.println("NOGARDEHT took 10 damage!\n");
				}
				else if(choiceEffect == 2) { 
					eHP -= 15;
					System.out.println(n+" used DARK magic!");
					System.out.println("NOGARDEHT took 15 damage!\n");
				}
				else if(choiceEffect == 3) { 
					eHP -= 30;
					System.out.println(n+" used LIGHT magic!");
					System.out.println("NOGARDEHT took 30 damage!\n");
				}
			}
			else if(choice.equals("sword")) { 
				if(choiceEffect == 0) { 
					eHP -= 5;
					System.out.println(n+" swung their sword, but with wimpy force!");
					System.out.println("NOGARDEHT took 5 damage!\n");
				}
				else if(choiceEffect == 1) { 
					eHP -= 10;
					System.out.println(n+" swung their sword!");
					System.out.println("NOGARDEHT took 10 damage!\n");
				}
				else if(choiceEffect == 2) { 
					eHP -= 15;
					System.out.println(n+" swung their sword!");
					System.out.println("NOGARDEHT took 15 damage!\n");
				}
				else if(choiceEffect == 3) { 
					eHP -= 30;
					System.out.println(n+" swung their sword! It was a mighty swing!");
					System.out.println("NOGARDEHT took 30 damage!\n");
				}
			}
			else if(choice.equals("flee")) { 
				uHP = 0;
			}
			
			if(enemyEffect == 0) { 
				System.out.println("NOGARDEHT swung his claws!");
				if(userAction == 0) { 
				
				}
				else if(userAction == 1) { 
				
				}
				uHP -= 5;
				System.out.println(n+" took 5 damage!\n");
			}
			else if(enemyEffect == 1) { 
				if(userAction == 0) {
					
				}
				else if(userAction == 1){
					
				}
				uHP -= 10;
				System.out.println("NOGARDEHT swung his spiky tail!");
				System.out.println(n+" took 10 damage!\n");
			}
			else if(enemyEffect == 2) { 
				if(userAction == 0) {
					
				}
				else if(userAction == 1) {
					
				}
				uHP -= 15;
				System.out.println("NOGARDEHT pounced!");
				System.out.println(n+" took 15 damage!\n");
			}
			else if(enemyEffect == 3) { 
				if(userAction == 0) {
					
				}
				else if(userAction == 1) {
					
				} 
				uHP -= 20;
				System.out.println("NOGARDEHT blasted an inferno!");
				System.out.println(n+" took 20 damage!\n");
			}
		} 
		
		if(uHP <= 0) { 
			result = false;
		}
		else if(eHP <= 0) { 
			result = true;
		} 
		
		return result; 
	}

	private static boolean battleSkeletonWarrior(String n, int uHP, int eHP) { 
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		Boolean result = false; 
		System.out.println("The Skeleton Warrior, DESPERO, appears!!!!\n\n");
		
		while(uHP > 0 && eHP > 0) { 
			System.out.println("* * * * * * * * * * * * * * * *"); 
			System.out.println(" What will "+n+" do?");
			System.out.println("{"+n+" HP: "+uHP+" Despero HP: "+eHP+"}");
			System.out.println("[HEAL] [MAGIC] [SWORD] [FLEE]]");
			String choice = scan.nextLine(); 
			
			int choiceEffect = rand.nextInt(3);
			int enemyEffect = rand.nextInt(3);
			int userAction = rand.nextInt(1);
			
			if(choice.equalsIgnoreCase("heal")) { 
				if(uHP < 50) { 
					System.out.println("\n"+n+" healed themself!");
					if(choiceEffect == 0) { 
						uHP += 1;
						if(uHP > 50) { 
							uHP = 50;
						}
						System.out.println(n+" was healed by 1 HP!\n"); 
					}
					else if(choiceEffect == 1) { 
						uHP += 5;
						if(uHP > 50) { 
							uHP = 50;
						}
						System.out.println(n+" was healed by 5 HP!\n");
					}
					else if(choiceEffect == 2) { 
						uHP += 15;
						if(uHP > 50) { 
							uHP = 50;
						}
						System.out.println(n+" was healed by 15 HP!\n");
					}
					else if(choiceEffect == 3) { 
						uHP += 20;
						if(uHP > 50) { 
							uHP = 50;
						}
						System.out.println(n+" was healed by 20 HP!\n");
					}
				} 
				else { 
					System.out.println(n+" is already at full health!\n");
				}
			}
			else if(choice.equals("magic")) { 
				if(choiceEffect == 0) { 
					eHP -= 5;
					System.out.println(n+" used BASIC magic!");
					System.out.println("DESPERO took 5 damage!\n");
				}
				else if(choiceEffect == 1) { 
					eHP -= 20;
					System.out.println(n+" used COMPLEX magic!");
					System.out.println("DESPERO took 20 damage!\n");
				}
				else if(choiceEffect == 2) { 
					System.out.println(n+" used DARK magic!");
					System.out.println("It is ineffective on DESPERO.\n");
				}
				else if(choiceEffect == 3) { 
					eHP -= 30;
					System.out.println(n+" used LIGHT magic!");
					System.out.println("DESPERO took 30 damage!\n");
				}
			}
			else if(choice.equals("sword")) { 
				if(choiceEffect == 0) { 
					System.out.println(n+" swung their sword, but with wimpy force!");
					System.out.println("DESPERO's bones merely rattled.\n");
				}
				else if(choiceEffect == 1) { 
					eHP -= 10;
					System.out.println(n+" swung their sword!");
					System.out.println("DESPERO took 10 damage!\n");
				}
				else if(choiceEffect == 2) { 
					eHP -= 15;
					System.out.println(n+" swung their sword!");
					System.out.println("DESPERO took 15 damage!\n");
				}
				else if(choiceEffect == 3) { 
					eHP -= 30;
					System.out.println(n+" swung their sword! It was a mighty swing!");
					System.out.println("DESPERO took 30 damage!\n");
				}
			} 
			else if(choice.equals("flee")) { 
				uHP = 0;
			}
				
			if(enemyEffect == 0) { 
				uHP -= 5;
				System.out.println("DESPERO jabbed his word at "+n+"!");
				System.out.println(n+" took 5 damage!\n");
			}
			else if(enemyEffect == 1) { 
				if(userAction == 0) { 
				
				} 
				else if(userAction == 1) {
					
				}
				uHP -= 10;
				System.out.println("DESPERO swung a battle axe at "+n+"!");
				System.out.println(n+" took 10 damage!\n");
			}
			else if(enemyEffect == 2) { 
				if(userAction == 0) {
					
				}
				else if(userAction == 1) {
					
				}
				uHP -= 15;
				System.out.println("DESPERO summoned Skele-Bats to attack "+n+"!");
				System.out.println(n+" took 15 damage!\n");
			}
			else if(enemyEffect == 3) { 
				if(userAction == 0) {
					
				}
				else if(userAction == 1) {
					
				}
				uHP -= 20;
				System.out.println("DESPERO summoned sharp bones from the ground, piercing "+n+"!"); 
				System.out.println(n+" took 20 damage!\n");
			} 
		}
		
		if(uHP <= 0) { 
			result = false; }
		else if(eHP <= 0) { 
			result = true;
		} 
			
		return result;
	}
			
	private static boolean battleLurker(String n, int uHP, int eHP) { 
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		Boolean result = false; 
		System.out.println("The ghastly LURKER appears!!!\n\n");
		
		while(uHP > 0 && eHP > 0) { 
			System.out.println("* * * * * * * * * * * * * * * *"); 
			System.out.println(" What will "+n+" do?");
			System.out.println("{"+n+" HP: "+uHP+" LuRkEr HP: "+eHP+"}");
			System.out.println("[HEAL] [MAGIC] [SWORD] [FLEE]]");
			String choice = scan.nextLine(); 
			
			int choiceEffect = rand.nextInt(3);
			int enemyEffect = rand.nextInt(3);
			int userAction = rand.nextInt(1);
			
			if(choice.equalsIgnoreCase("heal")) { 
				if(uHP < 50) { 
					System.out.println("\n"+n+" healed themself!");
					if(choiceEffect == 0) { 
						uHP += 2;
						if(uHP > 50) { 
							uHP = 50;
						}
						System.out.println(n+" was healed by 2 HP!\n");
					}
					else if(choiceEffect == 1) { 
						uHP += 5;
						if(uHP > 50) { 
							uHP = 50;
						}
						System.out.println(n+" was healed by 5 HP!\n");
					}
					else if(choiceEffect == 2) { 
						uHP += 15;
						if(uHP > 50) { 
							uHP = 50;
						}
						System.out.println(n+" was healed by 15 HP!\n");
					}
					else if(choiceEffect == 3) { 
						uHP += 20;
						if(uHP > 50) { 
							uHP = 50;
						}
						System.out.println(n+" was healed by 20 HP!\n");
					}
				}
				else { 
					System.out.println(n+" is already at full health!");
				}
			}
			else if(choice.equals("magic")) { 
				if(choiceEffect == 0) { 
					System.out.println(n+" used BASIC magic!"); 
					System.out.println("It does not effect the LURKER...\n");
				}
				else if(choiceEffect == 1) { 
					eHP -= 25;
					System.out.println(n+" used COMPLEX magic!");
					System.out.println("LURKER took 25 damage!\n");
				}
				else if(choiceEffect == 2) { 
					System.out.println(n+" used DARK magic!");
					System.out.println("It does not effect the LURKER...!\n");
				}
				else if(choiceEffect == 3) { 
					eHP -= 50;
					System.out.println(n+" used LIGHT magic!");
					System.out.println("LURKER took 50 damage!\n");
				}
			} 
			else if(choice.equals("sword")) { 
				System.out.println(n+" swung their sword!");
				System.out.println("The sword went straight through the LURKER!!!\n");
			}
			else if(choice.equals("flee")) { 
				uHP = 0;
			}
			
			if(enemyEffect == 0) { 
				System.out.println("The LURKER waves a whispy, claw-hand"); 
				System.out.println(n+" shivers.\n"); 
			}
			else if(enemyEffect == 1) { 
				System.out.println("The LURKER threw a dagger at "+n+"!");
				if(userAction == 0) { 
					uHP -= 10;
					System.out.println(n+" took 10 damage!\n");
				}
				else if(userAction == 1) { 
					System.out.println(n+" was able to dodge it!");
				}
			}
			else if(enemyEffect == 2) { 
				System.out.println("The LURKER flew at "+n+" with its claws!");
				if(userAction == 0) { 
					uHP -= 15;
					System.out.println(n+" took 15 damage!\n");
				}
				else if(userAction == 1) { 
					System.out.println(n+" was able to jump back in time!");
				}
			}
			else if(enemyEffect == 3) { 
					if(userAction == 0) {
						
					}
					else if(userAction == 1) {
						
					}
					uHP -= 20;
					System.out.println("The LURKER used DARK magic on "+n+"!");
					System.out.println(n+" took 20 damage!\n"); 
				}
			} 
			/* * Put randomizer within enemyEffect if statements to put whether
			   * the player avoids attack or is hit by it.
			   *
			   * Also, make the text/prompts more readable! 
			*/
			if(uHP <= 0) { 
				result = false;
			}
			else if(eHP <= 0) { 
				result = true;
			}
			
		return result;
	}
} 
