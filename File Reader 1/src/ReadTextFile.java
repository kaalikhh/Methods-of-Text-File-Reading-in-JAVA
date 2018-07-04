 import java.io.FileReader; 
import java.io.IOException; 

public class ReadTextFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try { 
			FileReader textFileReader = new FileReader("Put the address of your file in system"); 
			char[] buffer = new char[10000]; 
			int numberOfCharsRead = textFileReader.read(buffer); 
			while (numberOfCharsRead != -1) 
			{ 
				System.out.println(String.valueOf(buffer, 0, numberOfCharsRead)); 
				numberOfCharsRead = textFileReader.read(buffer); 
				} 
			textFileReader.close(); 
			} 
		catch (IOException e) 
		{ 
			// TODO Auto-generated catch block 
			e.printStackTrace(); 
			}
	}
}