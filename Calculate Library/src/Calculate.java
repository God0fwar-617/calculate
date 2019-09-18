import java.util.zip.ZipEntry;

public class Calculate {

	public static int square(int num) {
		int squaredNum = num * num;
		return squaredNum;

	}

	public static int cube(int num) {
		int cubeNum = num * num * num;
		return cubeNum;

	}

	public static double average(double num1, double num2) {
		double average = ((num1 + num2) / 2);
		return average;
	}

	public static double average(double num1, double num2, double num3) {
		double ret = ((num1 + num2 + num3) / 3);
		return ret;
	}

	public static double toDegrees(double angle) {
		double deg = 180 * angle / 3.14159;
		return deg;
	}

	public static double toRadians(double angle) {
		double rad = 3.14159 * angle / 180;
		return rad;
	}

	public static double discriminant(double a, double b, double c) { //we use 
		double ret = b * b - (4 * a * c);
		return ret;
	}

	public static String toImproperFrac(int whole, int numerator, int denominator) {
		int first = whole * denominator + numerator;
		String s = first + "/" + denominator;
		return s;
	}

	public static String toMixedNum(int numerator, int denominator) {
		int first = numerator / denominator;
		int m = first * denominator;
		int f = numerator - m;
		String s = first + "_" + f + "/" + denominator;
		return s;

	}

	public static String foil(int ax, int b, int cx, int d, String var) {
		int step1 = (ax + b) * (cx + d);
		int h = ax * cx;
		int h1 = ax * d;
		int g = b * cx;
		int g1 = b * d;
		int f1 = h1 + g;
		String last = h + var + " ^2" + "+ " + f1 + " " + g1;
		return last;

	}

	public static boolean isDivisibleBy(int a, int b) {
		boolean isDivisibleBy1 = (a % b) == 0;
		return isDivisibleBy1;
	}

	public static double absValue(double num) {
		if (num < 0)
			return (-1) * num;
		else
			return num;
	}

	public static double max(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static double max(double a, double b, double c) {
		// return max(max(a,b), c);{

		double max;

		if (a >= b) {
			if (a >= c) {
				max = a;
			} else {
				max = c;
			}
		} else { // b > a
			if (b >= c) {
				max = b;
			} else {
				max = c;
			}
		}

		return max;
	}

	public static int min(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}

//    rounding a double to two decimal points w/ Math library
//    public static double round2(double num) {
//	    long factor = 100L;
//	    double value = num * factor;
//	    long tmp = Math.round(value);
//	    return (double) tmp / factor;    	
//    }

	// rounding a double to two decimal points w/o use of library
	// anything with +n.nn5 and greater will be rounded up
	// anything with -n.nn5 will be rounded down
	public static double round2(double num) {
		if (num < 0.0)
			return (-1.0) * round2(-num); // for negative numbers we invert them

		// convert to integer with last digit being the one deciding the rounding, e.g.
		// 1.34687 -> 1346
		int factor = 1000;
		int value = (int) (num * factor); // 1346

		// get the last digit which decides if round up or down, here: 6
		int lastDigit = value % 10;
		if (lastDigit >= 5) {
			// round up: desired: 1.35 which is 1350 / 1000.0
			value += (10 - lastDigit); // 1346 + (10 - 6) = 1350
		} else {
			// round down
			value -= lastDigit; // 1346 --> 1340
		}
		value = value / 10; // remove the trailing zero, e.g. 1350 --> 135
		double ret = value; // convert to double, e.g. 135.0
		return ret / 100.0D; // 1.35
	}

	// simplified version which leverages that (int) of num * 100 is already the
	// round-down result
	// rounding a double to two decimal points w/o use of library
	// anything with +n.nn5 and greater will be rounded up
	// anything with -n.nn5 will be rounded down
	public static double round2c(double num) {
		if (num < 0.0)
			return (-1.0) * round2c(-num); // for negative numbers we invert them
		int number = (int) (num * 100); // these are the digits we want to keep
		int significantDigit = (int) (num * 1000) % 10; // this digit decides the rounding
		if (significantDigit >= 5)
			++number; // rounding up if next digit (1000th) is >= 5
		return (double) number / 100.0D;
	}

	public static double exponent(double base, int exponentx) {
		double x = 1;
		int a = exponentx;
		int b = exponentx * exponentx;
		for (int i = 1; i <= exponentx; ++i) {
			x = x * base;
		}
		return x;
	}

	public static int factorial(int f) {
		int x = 1;
		for (int i = 1; i <= f; ++i) {
			x = x * i;
		}
		return x;

	}

	public static boolean isPrime(int a) {
		for (int i = 2; i < a; ++i) {
			if (isDivisibleBy(a, i)) {
				return false;
			}
		}
		return true;
	}

	public static int gcf(int a, int b) {
		int i = min(a, b);
		while (i > 1) {
			if (isDivisibleBy(a, i) && isDivisibleBy(b, i))
				return i;
			--i;
		}
		return 1;
	}
	
	
	public static double sqrt (double num) {
		
		double a = 2;
	    double b  = 0.5*((num/a)+a);
	    double x = (b*b);
	    
	    double error = (x-num);
//	    if (( error < 0.005)&&(error > -0.005))
		if (( error < 0.000005)&&(error > -0.000005))
	    	return b;
	    
//        while ((error >=0.005)||(error <=-0.005)) {
        while ((error >=0.000005)||(error <=-0.000005)) {
        	a = b;
        	b = 0.5*((num/a)+a);
        	x = (b*b);
        	error = (x-num);
        }
        return b ; 
	}
	
	
   public static String quadForm (int a , int b , int c) {
	   double discriminant = discriminant(a,b,c);
	   if  (discriminant <0.0){
		      return "no real roots";
	   }
	   
	  // end of discriminat 
	   double s =sqrt (discriminant);
	   double r1p1 = -b + s ;
	   double r1p2 = r1p1/(2*a);

	   // other version 
	   double r2p1 = -b - s ;
	   double r2p2 = r2p1/(2*a);
	   
	   // round the values
       double v1 = round2(r1p2);
       double v2 = round2(r2p2);

       if ( v1 == v2) {
    	   double x = round2 (r1p2);
    	   String t = "" + x;
    	   return t;
       }
          
       // must have two values
       if (r1p2 < r2p2) {    	   
    	   String g = v1+ " and " + v2 ;
    	   return g;
		} else {
			String g = v2 + " and " + v1 ; 
			return g;
    	   
       }
   }
}

       
       
       

	
//	√ N ≈ ½(N/A + A)



	// A call to sqrt returns an approximation of the square root of the value
	// passed, rounded to two decimal places.
	// The method accepts a double and returns a double.
	// While the classic algorithm uses recursion (a topic we will all explore
	// later) for this first pass,
	// you should Newton's method for approximating square roots.
	// Essentially, it employs some fancy guess and check to find an appropriate
	// value.
	// The algorithm you are to use is explained pretty clearly here: goo.gl/Vl3JGe
	// You should keep guessing and altering your guesses until the difference
	// between
	// the original input and your result squared is less than .005.
	// Then round to 2 decimal places.
