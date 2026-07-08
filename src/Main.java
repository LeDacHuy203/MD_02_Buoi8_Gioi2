public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(4.5, 3.5);
        Rectangle r3 = new Rectangle(4.5, 3.5);


        System.out.printf("Rectangle 1: width=%.1f, height=%.1f, area=%.2f, perimeter=%.1f%n",
                r1.getWidth(), r1.getHeight(), r1.getArea(), r1.getPerimeter());

        System.out.printf("Rectangle 2: width=%.1f, height=%.1f, area=%.2f, perimeter=%.1f%n",
                r2.getWidth(), r2.getHeight(), r2.getArea(), r2.getPerimeter());

        System.out.printf("Rectangle 3: width=%.1f, height=%.1f, area=%.2f, perimeter=%.1f%n",
                r3.getWidth(), r3.getHeight(), r3.getArea(), r3.getPerimeter());
        double maxArea = Math.max(r1.getArea(), Math.max(r2.getArea(), r3.getArea()));
        int count = 0;

        if (r1.getArea() == maxArea) count++;
        if (r2.getArea() == maxArea) count++;
        if (r3.getArea() == maxArea) count++;
        if (count > 1) {
            System.out.printf("%nCó %d hình có diện tích lớn nhất bằng nhau:%n", count);

            if (r1.getArea() == maxArea) {
                System.out.printf("Rectangle 1: width=%.1f, height=%.1f%n",
                        r1.getWidth(), r1.getHeight());
            }

            if (r2.getArea() == maxArea) {
                System.out.printf("Rectangle 2: width=%.1f, height=%.1f%n",
                        r2.getWidth(), r2.getHeight());
            }

            if (r3.getArea() == maxArea) {
                System.out.printf("Rectangle 3: width=%.1f, height=%.1f%n",
                        r3.getWidth(), r3.getHeight());
            }

        } else {
            if (r1.getArea() == maxArea) {
                System.out.printf("%nLargest area = %.2f (Rectangle 1: width=%.1f, height=%.1f)%n",
                        maxArea, r1.getWidth(), r1.getHeight());
            } else if (r2.getArea() == maxArea) {
                System.out.printf("%nLargest area = %.2f (Rectangle 2: width=%.1f, height=%.1f)%n",
                        maxArea, r2.getWidth(), r2.getHeight());
            } else {
                System.out.printf("%nLargest area = %.2f (Rectangle 3: width=%.1f, height=%.1f)%n",
                        maxArea, r3.getWidth(), r3.getHeight());
            }
        }
    }

}
