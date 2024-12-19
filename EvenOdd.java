package Hwday8;

public class EvenOdd {
	 public static int check(int no) {
		 if(no%2==0) {
			 System.out.println("Even no"+ no);
		 }
		 else {
			 System.out.println("Odd no" + no);
		 }
		 return no;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(check(40));
	}

	}

