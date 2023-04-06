package typesOfFileWriting;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritingClass {
	
	public static void main (String[] args) throws IOException {
		
		
		String location="UsingFileWriting.txt";
		String Content="Man of Action-John Reese";
		
		FileWriter filewriter=new FileWriter(location);
		
		filewriter.write(Content);
		
		filewriter.close();
		
	}

}
