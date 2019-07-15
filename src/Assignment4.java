import java.io.*;


public class Assignment4 {
	
	public static void main (String [] args) {
		
	
	try {
	File file = new File("Assignment04.dat");
		
			// printwriter is the output we want to make in the file
			// output.println will PRINT a line in the text file
			// we must CLOSE the output. 
		FileOutputStream fo = new FileOutputStream(file);
		ObjectOutputStream output = new ObjectOutputStream(fo);
	
			output.writeByte('1');
			output.writeBytes("0101");
			output.close();
		}
		// catch IOexception is strictly for IO.
		catch (IOException ex) {
			// printF & %s make the exception "ex" a string and we will see it in console.  
			System.out.printf("ERROR: %s\n", ex);
		}
		
		
	}
}
