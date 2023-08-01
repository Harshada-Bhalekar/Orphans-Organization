package com.connectdb;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.Part;

public class FileConvert {
	public static InputStream fileObj(Part filePart)
	{
		InputStream inputStream=null;
		if (filePart != null) {
        	System.out.println("Fileobject method start");
            // Prints out some information
            // for debugging
            System.out.println(
                filePart.getName());
            System.out.println(
                filePart.getSize());
            System.out.println(
                filePart.getContentType());
 
            // Obtains input stream of the upload file
            try {
				inputStream= filePart.getInputStream();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("if block end");
        }

		return inputStream;
		
	}

}
