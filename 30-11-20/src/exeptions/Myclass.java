package exeptions;

import javax.management.RuntimeErrorException;

public class Myclass {

	public void printHi() {
		System.out.println("hi");
		return; //The method end without problems
	}
	
	public int divide(int a, int b) throws Exception {//handling one= throws declaration
		if(b!=0) {
		return a/b;
	}else {
		throw new Exception("you cannot divide by zero");
		
	}
		
	}	 
	
	public static void main(String[] args) {
		Myclass c1= new Myclass();
		try {// handling 2 - try- catch
			int res= c1.divide(10, 0);
			System.out.println(res);
			//e is a reference to the exception we caught
		} catch(Exception e) { //handler code
			//System.out.println("error"+e);
			//System.out.println("error"+e.getMessage());
			e.printStackTrace();// print stack  trace help in debug
		}
		
	
		
		
		System.out.println("end of proogram");
	}
}
