package lesson2task5;

public class Numbers {
    public static void main(String[] args) {
        System.out.println(isAnEvenNumber(10));
    }

    public static boolean isAnEvenNumber(int value) {
        return value % 2 == 0;
    }

    public static boolean isAnOddNumber(int value) {
        return value % 2 == 1;
    }

}
