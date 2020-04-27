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
			performAction(choice); //method that performs an action given the choice
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
		System.out.println("\nMake a selection of either 1 to get a random color or 2 to get a random shape: ");
		System.out.println("1)Tell me a color.");
		System.out.println("2)Tell me a shape.");
		System.out.println("0)Exit");
		}
	
	//see if you can rewrite this part
	private int getInput() {
		Scanner kb = new Scanner(System.in);
		int choice = -1;
		while(choice < 0 || choice > 2){
			try { //use try catch block whenever you might have an error thrown
				System.out.print("\nEnter your selection: "); //just print so can be on same line
				choice = Integer.parseInt(kb.nextLine()); //wrapping to get kb string into integer
			}
			catch (NumberFormatException e) {
				System.out.println("\nInvalid selection please try again");
			}
		}
		return choice; //need this to return the method
	}
	
	private void performAction(int choice) {
		switch(choice) {
		case 0:
			exit = true; //if the user chooses to exit the program
			System.out.println("\nThank you for using the app!");
			break;
		case 1:
			pickColor(); //if user chooses 1 call the method pickColor
			break;
		case 2:
			pickShape();
			break;
		default:
			System.out.println("\nAn unknown error has occured."); //should never get to here as the logic
		}
	}
	
	private void pickColor() {
		int num = (int) (Math.random() * 4); // pick a number 1-3
		switch(num) {
			case 0:
				System.out.println("\nGreen");
				break;
			case 1:
				System.out.println("\nRed");
				break;
			case 2:
				System.out.println("\nBlue");
				break;
			case 3:
				System.out.println("\nWhite");
				break;
			default:
				System.out.println("\nNo selection made."); //should never occur due to logic
				break;
		}
	}
	
	private void pickShape() {
		int num = (int) (Math.random() * 4);
		switch(num) {
			case 0:
				System.out.println("\nSquare");
				break;
			case 1:
				System.out.println("\nTriangle");
				break;
			case 2:
				System.out.println("\nCircle");
				break;
			case 3:
				System.out.println("\nHexagon");
				break;
			default:
				System.out.println("\nNo selection made."); //should never occur due to logic
				break;
		}	
	}
}