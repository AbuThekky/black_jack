package Black_Jack;

public class Calculation {
	public static void main(int a, int b) {
		if(a<=21 && a>b); {
			 System.out.println("a is the winner with: " + a + " out of 21");
		}
		if(b>a){
			System.out.println("b is the winner with: " + b + " out of 21");
			
		}
	}

	public static void unique(int a, int b, int c) {
		if (a == b) {
			System.out.println(c);
		} else {
			if (b == c) {
				System.out.println(a);
			} else {
				if (c == a) {
					System.out.println(b);
				} else {
					if (c != b || a != c || b != c) {
						System.out.println(a + b + c);
					}
				}
			}
		}
	}


	public static void taxes(int a) {
		if(a<=14999) {
			System.out.println("you will have 0% tax with a total of: " + 0);
		} else {
			if(15000 <= a && a <= 19999) {
				System.out.println("you will have 10% tax with a total of: " + ((a-15000)*.10));
			} else {
				if(20000 <= a && a <= 29999) {
					System.out.println("you will have 15% tax with a total of: " + ((a-20000)*.15));
				} else {
					if(30000 <= a && a <= 44999) {
						System.out.println("you will have 20% tax with a total of: " + ((a-30000)*.20));
			}else {
				if(45000 < a) {
					System.out.println("you will have 25% tax with a total of: " + ((a-45000)*.25));
		}
		
	}
	
	
	
	
}
			}
		}
	}
	
	public static void fizzbuzz(int a) {
		if(a%3 == 0 && a%5 == 0) {
			System.out.println("FizzBuzz");
		} else {
			if(a%3 == 0) {
				System.out.println("Fizz");
			} else {
				if(a%5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(a + " is neither");
				}
		
			}
		}
		
	}
	
	public static void evenodd(int a) {
		if(a%2 == 0) {
			System.out.println(a+1);
		} else {
			System.out.println(a-1); 
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

