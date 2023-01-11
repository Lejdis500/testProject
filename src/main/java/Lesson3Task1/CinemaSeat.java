package Lesson3Task1;

public class CinemaSeat {
    private final int number;
    private final int rowNumber;
    private boolean isFree;

    public CinemaSeat(int number, int rowNumber) {
        this.isFree = true;
        this.number = number;
        this.rowNumber = rowNumber;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}

