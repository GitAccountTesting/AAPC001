package Rough;

public class autoboxing {

public static void main(String[] args) {
	int x=90;
	Integer wrapper=new Integer(x);
	System.out.println(wrapper);
	int unwrapper=wrapper.intValue();
	System.out.println(unwrapper);
}
}
