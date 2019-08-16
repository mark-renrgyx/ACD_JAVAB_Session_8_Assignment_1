package week1.day8.assignment1;

import java.io.File;
import java.io.IOException;

public class FileCopyMain {

	public static void main(String[] args) {
		final String FOLDER = "file_copying";
		final String INPUT_FILE_NAME = "input.txt";
		final String OUTPUT_FILE_NAME = "output.txt";
		
		File location = new File(FOLDER);
		if (!location.exists())
			location.mkdir();
		
		File in = new File(FOLDER + File.separator + INPUT_FILE_NAME);
		File out = new File(FOLDER + File.separator + OUTPUT_FILE_NAME);
		
		if (!in.exists()) {
			System.err.println("No input file, " + in.getAbsolutePath());
		}
		if (!out.exists()) {
			try {
				out.delete();
				out.createNewFile();
			} catch (IOException e) {
				System.err.println("Failed to create output file");
			}
		}
		FileCopier.copyFile(in, out);
	}
}
