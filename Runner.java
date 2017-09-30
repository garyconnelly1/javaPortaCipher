// Author Gary Connelly
//porta cipher - runner

package ie.gmit.sw;

import java.util.*;

public class Runner {
	
	//bring in the scanner
	private static Scanner myScanner = new Scanner(System.in);
	protected static HashMap<String, List<Character>> cipherMap = new HashMap<>();
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//myMenu();
		//WarAndPeace-LeoTolstoy.txt
		Cipher.createCipherMap(cipherMap);
		
		int input = 0;
		do{
			//user menu
			System.out.println("Pick the number that you want:");
			System.out.println("1: For parsing and encrypting.");
			System.out.println("2: For decrypting");
			System.out.println("-1: For exit");
			
			input = myScanner.nextInt();
			
			//String location = null;
			//WarAndPeace-LeoTolstoy.txt
			//switch statement for menu
			switch(input)
			{
			case 1:
				Parser.FileWriter(Input("Please enter location of the file/Url here: "), Input("Please enter the keyword here: (Write down file as you will need it to decrypt this file:)"), "encrypt.txt");
				break;
				
			case 2:
				Parser.FileWriter(Input("Please enter location of the file/Url here: "), Input("Please enter the keyword that you wrote down when parsing the file:)"), "decrypt.txt");
				break;
				
			case -1:
				break;
				
				default:
					System.out.println("Invalid input. Please try again");
				
			}
		}while(input != -1);//end do while. while loop in linear time.O(n).
		
	}
	
		
		
		
		
		

	//}//end main
	
	//create a main menu
	//public static void myMenu()
	//{
		
	//Create a method for the user input
	
	private static String Input(String output)
	{
		System.out.println(output);
		//Scanner myScanner;
		String input = myScanner.next();
		return input;
	}
	
}
