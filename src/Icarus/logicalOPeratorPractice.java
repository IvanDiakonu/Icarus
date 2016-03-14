package Icarus;

public class logicalOPeratorPractice {

	public static void main(String agrs[])  {
		int boy, girl;
		boy = 18;
		girl = 40;
	
	//double "&&" is a logic statement which means either test on either side of the test must be true.
	// you can also use "||" which is a logic statement which means or.
		//this means either statement in the CAN be true. This means that only one variable in the test must test true.
		if (boy > 10 && girl < 60)  {
			System.out.println("you can enter");
		}else {
			System.out.println("you cannot enter");
		}
	}
}
