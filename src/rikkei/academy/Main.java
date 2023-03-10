package rikkei.academy;

public class Main {

    public static void main(String[] args) {
//	    // Kiểm thử class Shape
//        System.out.println("----------SHAPE--------------");
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red", false);
//        System.out.println(shape);
//        //Kiểm thử class Circle
//        System.out.println("----------CIRCLE--------------");
//        Circle circle = new Circle();
//        System.out.println(circle);
//        circle = new Circle(3.5);
//        System.out.println(circle);
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
//        //Kiểm thử class RECTANGLE
//        System.out.println("---------RECTANGLE----------");
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.3, 5.8);
//        System.out.println(rectangle);
//
//        rectangle = new Rectangle(2.5, 3.8, "orange", true);
//        System.out.println(rectangle);
//        //Kiểm thử SQUARE
//        System.out.println("---------SQUARE----------");
//        Square square = new Square();
//        System.out.println(square);
//        square = new Square(2.3);
//        System.out.println(square);
//        square = new Square(5.8, "yellow", true);
//        System.out.println(square);

//        Circle circle = new Circle(4);
//        System.out.println(circle);
//        circle.resize(2);
////        circle.getArea();
//        System.out.println(circle);

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Square(6);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                // ép kiểu về circle để chấm đc resize
                Circle circle = (Circle) shape;
                circle.resize((int) (Math.random() * 100));
            }
            if (shape instanceof Rectangle) {
                // ép kiểu về circle để chấm đc resize
                Rectangle rectangle = (Rectangle) shape;
                rectangle.resize((int) (Math.random() * 100));
            }
        }

        System.out.println("-------------------------------------------------");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

//        for (int i = 0; i < shapes.length; i++) {
//            if (shapes[i] instanceof Circle) {
//                System.out.println(shapes[i]);
//                Circle circle = (Circle) shapes[i];
//                circle.resize((int) (Math.random()*100));
//                System.out.println("--------------------------------");
//                System.out.println(circle);
//            }
//            if (shapes[i] instanceof  Rectangle)
//        }
    }
}
