package typesOfFileWriting;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		
		
		String location="FileOutputStream.txt";
		String content="WhatEver";
		
		FileOutputStream output=new FileOutputStream(location);
		
		byte[] writeasbyte=content.getBytes();
		
		output.write(writeasbyte);
		
		output.close();

	}

}
