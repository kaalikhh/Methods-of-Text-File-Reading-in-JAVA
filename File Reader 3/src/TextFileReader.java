import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class TextFileReader {

	public static void main(String[] args) throws Exception
		 {
		    // pass the path
		    try {
		    	FileReader test = new FileReader("Path of the text file");
		    		    int i;
		    		    while ((i=test.read()) != '\0')
		    		      System.out.print((char) i);
		    test.close();
		  }
		    catch (FileNotFoundException ex) {
		        ex.printStackTrace();
		    } catch (IOException ex) {
		        ex.printStackTrace();
		    }
		 }
}