import java.util.Scanner;

public class Menu {

	public static void main(String[] args) { //public static void lets us tests it
		Menu menu = new Menu(); // creates an instance of the program
		
		menu.runMenu();
	}
	
	boolean exit; //instantiation for the exit logic
	
	//method to be able to run a menu, now we switch back to private will be able to have logic
	public void runMenu() {
		printHeader();
		while(!exit) { //exit doesn't exit so need to add instance exit logic
			printMenu();
			int choice = getInput(); 
		}
	}
	
	//if made private then can only be called within a class always make public
	//when we print out a menu make a print out header to the console -- header when access menu
	private void printHeader() {
		System.out.println("+---------------------------------+");
		System.out.println("|            Welcome to           |");
		System.out.println("|         Menu Application        |");
		System.out.println("+---------------------------------+");
	}
	
	//used to 
	private void printMenu(){
		System.out.println("Make a selection:");
		System.out.println("1)Tell me a color.");
		System.out.println("2)Tell me a shape.");
		System.out.println("0)Exit");
		}
	
	//see if you can rewrite this part
	private void getInput() {
		Scanner kb = new Scanner(System.in);
		int choice = -1;
		while (choice < 0 || choice > 2) {
			try {
				choice = Integer.parseInt(kb.nextLine()); 
			}
			catch (NumberFormatException e) {
				
			}
		
		}
	}

}