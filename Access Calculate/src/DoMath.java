
public class DoMath 
{ 
      public static void main(String[]args)
      {  
    	  Calculate.square(7);
    	  Calculate.cube(4);
    	  System.out.println(Calculate.average(2 , 3 ));
          System.out.println(Calculate.average(2 , 4 ,6 ));
          System.out.println(Calculate.toDegrees(1.6));
          System.out.println(Calculate.toRadians(180));
          System.out.println(Calculate.discriminant(2 ,4 ,8 ));
          System.out.println(Calculate.toImproperFrac(3,1,2));
          System.out.println(Calculate.toMixedNum(7,2));
          System.out.println(Calculate.foil(2,3,6,-7,"n"));
          
          // new stuff 9/1
          System.out.println(Calculate.isDivisibleBy(8,4));
          System.out.println(Calculate.absValue(-400));
          System.out.println(Calculate.absValue(270));
          System.out.println(Calculate.max (5,7));
          System.out.println(Calculate.max(4,6,9));
          System.out.println(Calculate.min(5,14));
          System.out.println(Calculate.round2c (1.47383));
          System.out.println(Calculate.round2c (1.34687));
          
          // in order to test the rounding go from 1.440 to 1449 in increments of 0.001
          double value = 1.4402;
          while (value < 1.450) {
        	  System.out.println(value + " -> " + Calculate.round2(value) + ", " + Calculate.round2(value));
              value += 0.001;  
          }
          
          value = -1.4401;
          while (value > -1.450) {
        	  System.out.println(value + " -> " + Calculate.round2(value) + ", " + Calculate.round2(value));
              value -= 0.001;  
          }

      }
}
