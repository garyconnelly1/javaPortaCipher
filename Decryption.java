// Author Gary Connelly
//porta cipher - decrypter

package ie.gmit.sw;

import java.util.List;

public class Decryption {
	
	//private static int q = 0;
	//private static int col = 0;
	//private static int row = 0;
	
	//initialise pass position
	private static int passPosition = 0;
	
	public static char myDecrypter(char c, String password)
	{
		//password to uppercase
		password = password.toUpperCase();
		
		//to go back to beginning of password
		if(passPosition == password.length()) {
			passPosition = 0;
		}
		
		char passCurrent = password.charAt(passPosition);
		
		int index = 0;