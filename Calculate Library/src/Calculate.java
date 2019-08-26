
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


    public static double toDegees(double angle) {
        double deg = 180 * angle / 3.14159;
        return deg;
    }


    public static double toRadians(double angle) {
        double rad = 3.14159 * angle / 180;
        return rad;
    }

    public static double discriminat(double a, double b, double c) {
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
}





