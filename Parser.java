// Author Gary Connelly
//porta cipher - parser

package ie.gmit.sw;
import java.io.*;
//import java.net.MalformedURLException;
//import java.net.URL;
import java.net.*;

public class Parser {
	
	private static long benchmarkTime = 0;
	
	//method to create the buffer reader
	public static BufferedReader myParser(String location)
	{
		//initialise buffered reader
		BufferedReader br = null;
		
		//try catch statement
		try
		{
			if(location.contains("www. ") || location.contains("http. "))
			{
				URL myUrl = new URL(location);
				//buffer reader
				br = new BufferedReader(new InputStreamReader(myUrl.openStream()));//To read in the url
			}//end if
			else
			{
				br = new BufferedReader(new FileReader(location));//To read in the file
			}//end else
		}//end try
		catch (IOException e)
		{
			System.out.println("Error: Your file/URL was not found");//If an error occurs while inputting data
		}//end catch
		
			//return
		return br;//return what was read in
	}//end buffered reader
	
	//write to file method
	public static void FileWriter(String location, String password, String fileName)
	{
		BufferedReader br = myParser(location);
		
		int x;