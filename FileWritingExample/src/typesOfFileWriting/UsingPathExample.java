package typesOfFileWriting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPathExample {

	public static void main(String[] args) throws IOException {
		
		String location="pathExample.txt";
		String content="A man Who loved Jessica? John Reese";
		
		Path path=Paths.get(location);
		
		Files.write(path, content.getBytes());

	}

}
