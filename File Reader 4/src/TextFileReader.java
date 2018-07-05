import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class TextFileReader {

	public static void main(String[] args) throws Exception
		 {
		    // pass the path
		    try {
		    	FileReader test = new FileReader("Enter the path of the text file");
		    	BufferedReader reader = new BufferedReader(test);		
		    	System.out.println("How many lines you want to read: ");
		    	Scanner s = new Scanner(System.in); 
		    	int k =1;
		    	int n = s.nextInt();
		    	while (true){
		    		if (! reader.ready()) 
		    			break;
		    		String next_line = reader.readLine();
		    		  if (k<=n){
		    		    System.out.println("Line Number: " +k+ " - " + next_line);
		    		    }
		    		  k++;
		    	  }
		    	reader.close();
		    	s.close();
		    }
		    catch (FileNotFoundException ex) {
		        ex.printStackTrace();
		    } catch (IOException ex) {
		        ex.printStackTrace();
		    }
		 }
}