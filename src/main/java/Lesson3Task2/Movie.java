package Lesson3Task2;

public class Movie {
    private final String title;
    private final String nameAndSurnameOfDirector;
    private final int durationOfMinutes;
    private final int yearOfProduction;

    public Movie(String title, String nameAndSurnameOfDirector, int durationOfMinutes, int yearOfProduction) {
        this.title = title;
        this.nameAndSurnameOfDirector = nameAndSurnameOfDirector;
        this.durationOfMinutes = durationOfMinutes;
        this.yearOfProduction = yearOfProduction;
    }
}
