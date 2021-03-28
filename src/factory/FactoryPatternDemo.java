package factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        //获取Circle的对象，并调用它的draw（）
        Shape shape1 = factory.getShape("CIRCLE");
        shape1.draw();

        //获取Rectangled的对象，并调用它的draw（）方法
        Shape shape2 = factory.getShape("RECTANGLE");
        shape2.draw();

        //获取Square 的对象，并调用它的draw方法
        Shape shape3 = factory.getShape("SQUARE");
        shape3.draw();
    }
}
