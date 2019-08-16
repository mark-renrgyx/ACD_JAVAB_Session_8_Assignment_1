package week1.day8.assignment1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopier {
	
	public static boolean copyFile(File in, File out) {
		if (!in.exists()) {
			System.err.println("Input file not found");
			return false;
		}
		if (!out.exists()) {
			System.err.println("Output file not found");
			return false;
		}
		
		try {
			FileReader fileReader = new FileReader(in);
			FileWriter fileWriter = new FileWriter(out);
		    int ch = 0;
		    while(ch != -1) {
		        ch = fileReader.read();
		        fileWriter.write(ch);
		        System.out.print((char) ch);
		    }
		    fileReader.close();
			fileWriter.close();
		} catch (IOException e) {
		    System.err.println("Exception attempting to copy file");
		    return false;
		}
		
		return true;
	}
}
