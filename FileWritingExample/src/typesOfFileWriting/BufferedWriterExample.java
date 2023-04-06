package typesOfFileWriting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {
		
		String location="BufferdExample.txt";
		String contents="Man of Mind-Harold";
		
		FileWriter filewriter=new FileWriter(location);
		
		BufferedWriter bufferedWriter=new BufferedWriter(filewriter);
		
		bufferedWriter.write(contents);
		
		bufferedWriter.close();
		

	}

}
