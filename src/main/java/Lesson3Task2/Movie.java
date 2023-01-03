package Lesson3Task2;

public class Movie {
    private String title;
    private String nameAndSurnameOfDirector;
    private int duration;
    private int yearOfProduction;

    public Movie(String title, String nameAndSurnameOfDirector, int duration, int yearOfProduction) {
        this.title = title;
        this.nameAndSurnameOfDirector = nameAndSurnameOfDirector;
        this.duration = duration;
        this.yearOfProduction = yearOfProduction;
    }
}
