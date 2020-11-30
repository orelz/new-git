package classNasting;

import classNasting.State.Citizen;

public class Test {

	public static void main(String[] args) {
		
		State israel= new State("israel", 0, 100);
		State usa= new State("israel", 0, 100);
		Citizen c1= israel.new Citizen("orel");
		Citizen c2= israel.new Citizen("orel1");
		Citizen c3= israel.new Citizen("orel2");
		Citizen c4= usa.new Citizen("dan");
		Citizen c5= usa.new Citizen("jhone");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
