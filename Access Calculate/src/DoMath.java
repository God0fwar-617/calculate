
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
          System.out.println(Calculate.round2 (1.47683));
          System.out.println(Calculate.round2b(1.47683));
          System.out.println(Calculate.round2 (2.78111));
          System.out.println(Calculate.round2b(2.78111));
          System.out.println(Calculate.round2 (1.34687));
          System.out.println(Calculate.round2b(1.34687));
          System.out.println(Calculate.round2 (-1.34687));
          System.out.println(Calculate.round2b(-1.34687));          
          System.out.println(Calculate.round2 (4.124687));
          System.out.println(Calculate.round2b(4.124687));          
          System.out.println(Calculate.round2 (-4.124687));
          System.out.println(Calculate.round2b(-4.124687));
          
          // test positive numbers in 1/100 steps (half should go down, half should go up)
          for (int i=0; i<10; ++i) {
        	  double value = 5.1100001 + (0.001 * i);
              System.out.println("value: " + value
            		  + ", " + Calculate.round2 (value)
            		  + ", " + Calculate.round2b(value));        	  
          }
          
          // test negative numbers in 1/100 steps (half should go down, half should go up)
          for (int i=0; i<10; ++i) {
        	  double value = -6.2200001 - (0.001 * i);
              System.out.println("value: " + value
            		  + ", " + Calculate.round2 (value)
            		  + ", " + Calculate.round2b(value));        	  
          }
          
          // special cases which lies directly in the middle in "nearest" is ambiguous
          {
        	  double value = -6.225;
              System.out.println("value: " + value
            		  + ", " + Calculate.round2 (value)
            		  + ", " + Calculate.round2b(value));        	  
          }
          {
        	  double value = 6.225;
              System.out.println("value: " + value
            		  + ", " + Calculate.round2 (value)
            		  + ", " + Calculate.round2b(value));        	  
          }
      }
}
