package Icarus;

public class whileLoopPractice {
	
	public static void main(String args[])  {
		//"while" loops allows you to execute certain block of code many times, but only write it one time
		int counter = 0;
		//the (above) counter variable starts at zero
		while (counter < 10)  {
		//while the counter is less than zero, the system will check the counter again and add 1 value to it (++), then it will check the value again, and again, until it gets to 10
			System.out.println(counter);
			counter++;
			
		}
	}
}
