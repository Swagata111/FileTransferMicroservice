package com.capgemini.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FileUpdate 
{
	@RequestMapping(value="/updatefile")

    public String updateFile() {
      BufferedWriter bw = null;

         FileWriter fw = null;
         
      try {
    	 
          String data = " This is new content";
          File file = new File("D:\\Swagata\\new.txt");
               // if file doesnt exists, then create it

               if (!file.exists()) {

                      file.createNewFile();
               }
             // true = append file

               fw = new FileWriter(file.getAbsoluteFile(), true);

               bw = new BufferedWriter(fw);
           bw.write(data);
          System.out.println("File updated successfully");
    } catch (IOException e) {

         e.printStackTrace();
    } finally {
  try {       if (bw != null)

                             bw.close();
if (fw != null)

                             fw.close();



               } catch (IOException ex) {



                      ex.printStackTrace();

                      System.out.println("File update failed");



               }

         }

         return "File updated Successfully";



  }


}
