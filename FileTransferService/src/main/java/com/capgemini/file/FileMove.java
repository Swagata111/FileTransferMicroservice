package com.capgemini.file;

import java.io.*;
import java.nio.file.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FileMove {
	
	@RequestMapping(value="/move")
	public String movefile() throws IOException
	{
		Path temp = Files.move
		        (Paths.get("C:\\Users\\swkundu\\t.txt"), 
		        Paths.get("D:\\\\Swagata\\\\ab.txt"));
		 
		        if(temp != null)
		        {
		            System.out.println("File renamed and moved successfully");
		        }
		        else
		        {
		            System.out.println("Failed to move the file");
		        }
		         return "file moved successfully";
	}

}
