
public class Menu {

	public static void main(String[] args) { //public static void lets us tests it
		Menu menu = new Menu(); // creates an instance of the program
		
		//call the methods created below
		menu.printHeader();
		menu.showMenu();
	}
	
	//if made private then can only be called within a class always make public
	//when we print out a menu make a print out header to the console -- header when access menu
	public void printHeader() {
		System.out.println("+---------------------------------+");
		System.out.println("|            Welcome to           |");
		System.out.println("|         Menu Application        |");
		System.out.println("+---------------------------------+");
	}
	
	//used to 
	public void showMenu(){
		System.out.println("Make a selection:");
		System.out.println("1)Tell me a color.");
		System.out.println("2)Tell me a shape.");
		System.out.println("0)Exit");
		}

}