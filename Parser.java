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