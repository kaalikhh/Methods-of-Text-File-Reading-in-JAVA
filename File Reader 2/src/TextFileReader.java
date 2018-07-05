import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TextFileReader {

	public static void main(String[] args) throws Exception
		 {
		    try {
		    	FileReader test = new FileReader("C:\\Users\\dell\\Desktop\\test.txt");
		    BufferedReader reader = new BufferedReader(test);
	        String i;
		    while ((i=reader.readLine()) != null )
		      System.out.print(i + "\n");
		    test.close();
		  }
		    catch (FileNotFoundException ex) {
		        ex.printStackTrace();
		    } catch (IOException ex) {
		        ex.printStackTrace();
		    }
		 }
}
