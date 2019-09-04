public class Calculate {

	public static int square(int num) {
        int squaredNum = num * num;
        return squaredNum;

    }

    public static int cube(int num) {
        int cubeNum = num * num;
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

    public static double discriminant(double a, double b, double c) {
        double ret = b * b / (4 * a * c);
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
        String s =  first + "_" + f + "/" + denominator;
        return  s;

    }

    public static String foil (int ax, int b, int cx, int d, String var) {
        int step1 = (ax + b) * (cx + d);
        int  h= ax*cx;
        int h1= ax*d;
        int g= b*cx;
        int g1= b*d;
        int  f1=h1+g;
        String last = h + var+ " ^2" + "+ " + f1+" " + g1;
        return last;

    }
    
    public static boolean isDivisibleBy (int a, int b ) {
	    boolean isDivisibleBy1 =  (a %  b) == 0 ;
	    return isDivisibleBy1;
    }
    
   public static double absValue (double num) {
	   if ( num < 0) return (-1) * num;
	   else return num;
   }
   
   
    public static double max(double a , double b ) {
      if (a > b) 
      { 
           return a;
       } 
       else 
       {
             return b;
       } 
    }
    
 
    public static double max(double a, double b, double c) {
    	// return max(max(a,b), c);{
    	
    	double max;
    	
    	if (a>=b) {
    		if (a>=c) {
    			max=a;
    		} else {
    			max=c;
    		}
    	} else { // b > a
			if (b>=c) {
				max = b;
			} else {
				max = c;
			}
    	}
    	
    	return max;
    }
    
    public static double min(double a , double b ) {
        if (a < b) 
        { 
             return a;
         } 
         else 
         {
               return b;
         } 
    }
    
    
    public static double round2(double num) {
	    long factor = 100L;
	    double value = num * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;    	
    }

    public static double round2b(double num) {
    	if (num < 0.0) return round2b_neg_(num);
    	else return round2b_pos_(num);
    }
    
    /** implement rounding w/o using any library methods 
     *  rounding is implemented to round to two digits 
     *  works only on positive numbers*/
    private static double round2b_pos_(double num) {    	
    	// convert to integer with last digit being the one deciding the rounding, e.g. 1.34687 -> 1346
	    int factor = 1000;
	    int value = (int) (num * factor); // 1346
	    
	    // get the last digit which decides if round up or down, here: 6
	    int lastDigit = value % 10;
	    if (lastDigit >=5) {
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
    
    /** implement rounding w/o using any library methods 
     *  rounding is implemented to round to two digits 
     *  works only for negative numbers 
     *  
     *  there is some ambiguous cases like -6.225 which can either go -6.220 or -6.250
     *  going to -6.23 is easier as we need to only look at the last digit
     *  it also means that -6.225 is rounded to -6.23 and +6.225 is rounded to +6.23
     *  while this is symmetric to each other it means -6.225 is rounded down and +5.225 is rounded up
     *  
     *  http://mathforum.org/library/drmath/view/71202.html
     *  
     *  
     *  */
    private static double round2b_neg_(double num) {    	
    	// convert to integer with last digit being the one deciding the rounding, e.g. 1.34687 -> 1346
	    int factor = 1000;
	    int value = (int) (num * factor); // 1346
	    
	    // get the last digit which decides if round up or down, here: 6
	    int lastDigit = value % 10;
	    if (lastDigit >= 5) { 
	    	// round down, e.g. -6.225 and smaller -> -6.23  (-6.23 is closer than -6.22)
	    	value -= (10 - lastDigit);
	    } else {
	    	// round up, e.g. -6.224999 and bigger -> -6.22
	    	value += lastDigit;
	    }  	
    	value = value / 10; // remove the trailing zero, e.g. 1350 --> 135
    	double ret = value; // convert to double, e.g. 135.0
    	return ret / 100.0D; // 1.35
    }
}