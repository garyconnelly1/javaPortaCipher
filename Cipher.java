// Author Gary Connelly
//porta cipher - cipher

package ie.gmit.sw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cipher {
	//Actual porta cipher we were told to use as 2d array
	public static final String [][] tableau = 
		{
				{"KEYS","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"},
				{"AB",  "N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C","D","E","F","G","H","I","J","K","L","M"},
				{"CD",  "O","P","Q","R","S","T","U","V","W","X","Y","Z","M","N","A","B","C","D","E","F","G","H","I","J","K","L"},
				{"EF",  "P","Q","R","S","T","U","V","W","X","Y","Z","N","O","L","M","A","B","C","D","E","F","G","H","I","J","K"},
				{"GH",  "Q","R","S","T","U","V","W","X","Y","Z","N","O","P","K","L","M","A","B","C","D","E","F","G","H","I","J"},
				{"IJ",  "R","S","T","U","V","W","X","Y","Z","N","O","P","Q","J","K","L","M","A","B","C","D","E","F","G","H","I"},
				{"KL",  "S","T","U","V","W","X","Y","Z","N","O","P","Q","R","I","J","K","L","M","A","B","C","D","E","F","G","H"},
				{"MN",  "T","U","V","W","X","Y","Z","N","O","P","Q","R","S","H","I","J","K","L","M","A","B","C","D","E","F","G"},
				{"OP",  "U","V","W","X","Y","Z","N","O","P","Q","R","S","T","G","H","I","J","K","L","M","A","B","C","D","E","F"},
				{"QR",  "V","W","X","Y","Z","N","O","P","Q","R","S","T","U","F","G","H","I","J","K","L","M","A","B","C","D","E"},
				{"ST",  "W","X","Y","Z","N","O","P","Q","R","S","T","U","V","E","F","G","H","I","J","K","L","M","A","B","C","D"},
				{"UV",  "X","Y","Z","N","O","P","Q","R","S","T","U","V","W","D","E","F","G","H","I","J","K","L","M","A","B","C"},
				{"WX",  "Y","Z","N","O","P","Q","R","S","T","U","V","W","X","C","D","E","F","G","H","I","J","K","L","M","A","B"},
				{"YZ",  "Z","N","O","P","Q","R","S","T","U","V","W","X","Y","B","C","D","E","F","G","H","I","J","K","L","M","A"},
		};//2d array
		
		//create hash map. I use protected so it can be used within the project but not outside it
	protected static void createCipherMap(HashMap<String, List<Character>> cipherMap) {
		for(int i=0; i < tableau.length; i++) {
			String key = tableau[i][0];
			ArrayList<Character> chars = new ArrayList<>();
			for(int j=1; j < tableau[i].length; j++) {
				chars.add(tableau[i][j].charAt(0));
			}//end inner for
			cipherMap.put(key, chars);
		}//end for. Indented for loop will run at quadratic time.O(n^2).
	}//end createCipherMap

}