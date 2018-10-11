package com.capgemini.file;

import java.io.*;
import java.nio.file.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FileCopy {
	
	@RequestMapping(value="/copy")
	public String movefile() throws IOException
	{
		Path temp = Files.copy
		        (Paths.get("C:\\Users\\swkundu\\a.txt"), 
		        Paths.get("D:\\\\Swagata\\\\abcd.txt"));
		 
		        if(temp != null)
		        {
		            System.out.println("File renamed and copied successfully");
		        }
		        else
		        {
		            System.out.println("Failed to copy the file");
		        }
		         return "file copied successfully";
	}

}
