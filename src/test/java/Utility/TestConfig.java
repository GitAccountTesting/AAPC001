package Utility;

public class TestConfig {
	public static String server="smtp.gmail.com";
	public static String from="harrypjohn@gmail.com";
	public static String password="01667325120";
	public static String[] to={"professionalharry@gmail.com","harrypjohn@gmail.com"};
	public static String subject="Test Report";
	public static String messageBody="TestMessage";
	public static String attachmentPath="D:\\Way2\\Classes\\SendEmailandAAPCFULL\\AAPCFULL001\\test-output\\emailable-report.html";
	public static String attachmentName="report.htm";
	public static String reportPath = System.getProperty("user.dir")+"//Reports.zip";


	/*//SQL DATABASE DETAILS	
	public static String driver="net.sourceforge.jtds.jdbc.Driver"; 
	public static String dbConnectionUrl="jdbc:jtds:sqlserver://192.101.44.22;DatabaseName=monitor_eval"; 
	public static String dbUserName="sa"; 
	public static String dbPassword="$ql$!!1"; 
	
	
	//MYSQL DATABASE DETAILS
	public static String mysqldriver="com.mysql.jdbc.Driver";
	public static String mysqluserName = "root";
	public static String mysqlpassword = "selenium";
	public static String mysqlurl = "jdbc:mysql://localhost:3306/niit";*/
}
