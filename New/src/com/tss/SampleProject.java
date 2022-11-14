package com.tss;

public class SampleProject {

	public static String PrimeNumber(int number) {
		 int m = 0, flag = 0; String result=null;
		m = number / 2;
		if (number == 0 || number == 1) {
			return number + " is not prime number";
		} else {
			for (int i = 2; i <= m; i++) {
				if (number % i == 0) {
					 result=number + " is not prime number";
					flag = 1;
					if(result!=null) return result;
				}
			}
			if (flag == 0) {
				return number + " is prime number";
			}
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(PrimeNumber(12));
	}
}
