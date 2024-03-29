
public class DoMath 
{
	public static void main(String[]args) {
		
		System.out.println("\nPart 1");
		System.out.println(Calculate.square(7));
		System.out.println(Calculate.cube(4));
		System.out.println(Calculate.average(2, 3));
		System.out.println(Calculate.average(2, 4, 6));
		System.out.println(Calculate.toDegrees(1.6));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(2, 4, 8));
		System.out.println(Calculate.discriminant(0.0, 0.0, 0.0));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));

		// new stuff 9/1
		System.out.println("\nPart 2");
		System.out.println(Calculate.isDivisibleBy(8, 4));
		System.out.println(Calculate.absValue(-400));
		System.out.println(Calculate.absValue(270));
		System.out.println(Calculate.max(5, 7));
		System.out.println(Calculate.max(4, 6, 9));
		System.out.println(Calculate.min(5, 14));
		System.out.println(Calculate.round2(1.47383));
		System.out.println(Calculate.round2(1.34687));

		// part 3 (9/8)
		System.out.println("\nPart 3");
		System.out.println(Calculate.exponent(2, 4));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(59));
		System.out.println(Calculate.isPrime(51));
		System.out.println(Calculate.gcf(25, 15));
		System.out.println(Calculate.gcf(15, 25));
		System.out.println(Calculate.gcf(17, 21));
		System.out.println(Calculate.sqrt(64.0));
		System.out.println(Calculate.sqrt(0.0));
		
		//Part 4 9/18/19
		System.out.println("\nPart 4");
//		System.out.println(Calculate.quadForm(-5,-40,40));
//		System.out.println(Calculate.quadForm(-5 , 4 , 0));
		System.out.println(Calculate.quadForm( 1 , 2 , 1));
		System.out.println(Calculate.quadForm( 1 , 4 , 5));
		System.out.println(Calculate.quadForm( 1 , 4 , 3));
		System.out.println(Calculate.quadForm( 1 , 2 , -2));
		System.out.println(Calculate.quadForm( -1 , -2 , 2));

	}
}