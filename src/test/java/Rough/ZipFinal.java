package Rough;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipFinal {
	public static void main(String[] args) {
		 try
		  {
		    File inFolder=new File("D:\\Way2\\Classes\\SendEmailandAAPCFULL\\AAPCFULL001\\test-output\\html");
		    File outFolder=new File("results.zip");
		 
		    ZipOutputStream out = new ZipOutputStream(new  BufferedOutputStream( 
		                                                  new FileOutputStream(outFolder)));
		   BufferedInputStream in = null;
		   byte[] data  = new byte[1000];
		   String files[] = inFolder.list();
		 
		  for (int i=0; i<files.length; i++)
		  {
		     in = new BufferedInputStream(new FileInputStream
		                                               (inFolder.getPath() + "/" + files[i]), 1000);  
		     out.putNextEntry(new ZipEntry(files[i])); 
		     int count;
		              while((count = in.read(data,0,1000)) != -1)
		               {
		                    out.write(data, 0, count);
		               }
		              out.closeEntry();
		  }
		 out.flush();
		 out.close();
		  }
		 catch(Exception e)
		 {
		  e.printStackTrace();
		  }

	}

}
