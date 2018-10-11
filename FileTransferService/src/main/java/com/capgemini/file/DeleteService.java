package com.capgemini.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteService {
	@RequestMapping(value="/delete")
	public String delfile() throws IOException
	{
		 File file = new File("D:\\Swagata\\abc.txt");
         
	        if(file.delete())
	        {
	            System.out.println("File deleted successfully");
	        }
	        else
	        {
	            System.out.println("Failed to delete the file");
	        }
		         return "file deleted successfully";
	}

}
