package Lesson4Task3;

public class Square implements Geometry {

    private int sideA;

    public Square(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public int getArea() {
        return sideA * sideA;

    }

    @Override
    public int getPerimeter() {
        return 4 * sideA;
    }
}
