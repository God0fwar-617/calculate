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

//    public static double round2b(double num) {
//    	// 1.34687 -> 1346.87
//	    int factor = 1000;
//	    int value = (int) num * factor; // 1346
//	    
//	    // here: 6
//	    int lastDigit = value % 10;
//	    if (lastDigit >=5) {
//	    	// round up: desired: 1.35 which is 1350 / 1000.0
//	    	return (double) value / 1000.0;
//	    	
//	    } else {
//	    	// round down
//	    	return (double) value / 1000.0;
//	    }  	
//    }
    
}