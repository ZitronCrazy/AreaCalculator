public class AreaCalculator<y> {

    public static double area(double radius) {

        if (radius < 0) {
            System.out.println(radius + " is invalid radius.");
            return -1.0;
        } else if (radius > 360) {
            System.out.println(radius + " is invalid radius.");
            return -1.0;
        } else if (radius <= 360 && radius >= 0) {
            System.out.println(radius + " * " + radius + " * " + "PI " + "equals " + radius * radius * Math.PI);
            return radius * radius * Math.PI;
        }
        return radius;
    }

    public static double area(double x, double y) {
        if ((x < 0 || y < 0) || (x < 0 && y < 0)){
            System.out.println(x + " and " + y + " are invalid numbers.");
            return -1.0;
        } else if ((x >= 0 || y >= 0) || (x >= 0 && y >= 0)) {
            System.out.println(x + " * " + y + " equals " + x * y);
            return x * y;
        }
        return x;
    }
}
