// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		int sum = x1;
		for (int i=0;i<x2;i++){sum++;}
		return sum;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		int d = x1;
		for (int i=0;i<x2;i++){d--;}
		return d;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int ans = 0;
		for(int i=0;i<x2;i++){
			ans = plus(ans,x1);}
		
		return ans;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int power = x;
		for(int i=1;i<n;i++){
			power = times(power,x);
		}
		return power;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int divie = x1;
		int coun = 0;
		while(divie>=x2){
			divie = minus(divie,x2);
			coun++;}
		return coun;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		int modulu = x1;
		while(modulu>=x2){
			modulu = minus(modulu,x2);}
		return modulu;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		int sqr = 0;
		for(int i=0;i<x;i++){
			if(pow(i,2)>x){
				sqr = minus(i, 1);
				i=x;}
		}
		return sqr;
	}	  	  
}