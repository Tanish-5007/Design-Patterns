package creational.factory;

public class Main {
    public static void main(String[] args) {
        Shape shapeObj = ShapeFactory.getShape("CIRCLE");
        shapeObj.draw();
    }
}
