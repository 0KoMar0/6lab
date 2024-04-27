public class Main {
    public static void main(String[] args) {
        double x = 2.0;
        double y = 3.0;

        double x1 = 1.0, y1 = 1.0;
        double x2 = 5.0, y2 = 1.0;
        double x3 = 3.0, y3 = 4.0;

        boolean isInTriangle = isPointInTriangle(x, y, x1, y1, x2, y2, x3, y3);

        if (isInTriangle) {
            System.out.println("Точка (" + x + ", " + y + ") принадлежит треугольнику с вершинами (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + ")");
        } else {
            System.out.println("Точка (" + x + ", " + y + ") не принадлежит треугольнику с вершинами (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + ")");
        }
    }

    public static boolean isPointInTriangle(double x, double y, double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (-y2 * x3 + y1 * (-x2 + x3) + x1 * (y2 - y3) + x2 * y3);
        double s = 1 / (2 * area) * (y1 * x3 - x1 * y3 + (y3 - y1) * x + (x1 - x3) * y);

        double t = 1 / (2 * area) * (x1 * y2 - y1 * x2 + (y1 - y2) * x + (x2 - x1)* y);

        return s > 0 && t > 0 && 1 - s - t > 0;
    }
}