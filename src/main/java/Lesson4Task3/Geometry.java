package Lesson4Task3;

public interface Geometry {
    public static int areaOfSquare(int sideA) {
        return sideA * sideA;
    }

    public static int fieldOfSquare(int sideA) {
        return 4 * sideA;
    }

    public static int areaOfRectangle(int sideA, int sideB) {
        return sideA * sideB;
    }

    public static int fieldOfRectangle(int sideA, int sideB) {
        return 2 * sideA + 2 * sideB;
    }

}



