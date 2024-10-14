public class CircleCircumference {

    public static double calculateCircumference(double radius) {

        final double PI = 3.14;
        double circumference = 2 * PI * radius;
        return circumference;
    }

    public static void main(String a[]){
        double radius = 5.5;
        double circumference = calculateCircumference(radius);
        System.out.println("Circumference of the circle is: " + circumference);
    }
}
