package pack;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class ReadFiles {
//	static logger
	static Logger logger = Logger.getLogger(ReadFiles.class.getName());
	
	public static void main(String[] args) throws IOException {
		//1. Source folder
		final File folder = new File("/home/ridhoajibx/Documents/java/SomeFile");
		
		//2. Read all files in folder
		listFilesForFolder(folder);      
		
	}
	
	public static void listFilesForFolder(final File folder) throws IOException {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	        	//3. Move
	        	moveFile(fileEntry);
	        }
	    }
	}
}
