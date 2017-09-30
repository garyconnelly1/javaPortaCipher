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
		
		for(String key : Runner.cipherMap.keySet()) {
			//key based operations on hashmap constant time.O(1).
			if(key.indexOf(passCurrent) != -1 && !key.equals("KEYS")) {
				List<Character> chars = Runner.cipherMap.get(key);
				//index of character on the map
				index = chars.indexOf(c);
				if(index == -1) {
					return c;
				}//end inner if
				break;
			}//end if
		}// encryption done
		
		//increment pass position
		passPosition++;
		
		//return the character on the "KEYS" line
		return Runner.cipherMap.get("KEYS").get(index);
		
		/*int unicode = ((int)c - 65); // because A is the 65th character in the unicode table
		
		col = (int)password.charAt(q % password.length())/2 + 1;
		
		System.out.println(col);
		//if
			if(unicode >= 14 && unicode <= 26)
			{
				row = ( (unicode - col) + 1) % 13;
				
				//inner if
				if(row == 0)
				{
					row = 13;// because I dont want row 13 to plus 1 and equal row 0. 
				}//end inner if
				
				c = (char)(row + 64);
			}//end if
		
		//else if
			//Dont really understand how this code works but it does. 
			else if(unicode >= 1 && unicode <= 13)
			{
				row = ( (unicode + col) - 1) % 13 + 13;
				
				//inner if
				if(row == 13)
				{
					row = 26; 
				}//end inner if
				c = (char)(row + 64);
				
			}//end else if
		
		
		q++;
		
		
		return c;*/
	}// end myDecrypter

}//end Decryption
