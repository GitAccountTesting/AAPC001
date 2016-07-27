package Rough;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ForFile {
public static void main(String[] args) throws IOException {
	File file=new File("D:\\Way2\\Classes\\AAPCFULL\\AAPCFULL001\\FileRecordsOfSuccessfulMethods.txt");
	FileWriter filewriter=new FileWriter(file);
	BufferedWriter bw=new BufferedWriter(filewriter);
	String msgdoLogin="1.In HomePage Class doLogin fdsdsfdsfdasfmehtod is working correctly";
	bw.write(msgdoLogin);
	bw.close();
	System.out.println("ok");
}
}
