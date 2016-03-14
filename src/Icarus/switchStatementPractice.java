package Icarus;

public class switchStatementPractice {

		public static void main(String args[])  {
			int age;
			age = 3;
			
		//you can only write a "switch" statement once
				//"switch" statement finds the variable value in the peramiters
			switch (age)  {
			//the "case" statement check the value after the case (example below), to see if if it matches the value given at the top (int value).
			case 1:
				System.out.println("you can crawl");
				//"break" means if the (above) test is true, there is no need to test the rest of the code, and it can cancel.
				break;
			case 2:
				System.out.println("you can talk");
				break;
			case 3:
				System.out.println("you can get in trouble");
				break;
			//the last thing you have in ever switch statement is a "default".
					//"default" does a default statement if non of the (above) values are true.
			default :
				System.out.println("I dont know how old you are");
			}
		}
}
