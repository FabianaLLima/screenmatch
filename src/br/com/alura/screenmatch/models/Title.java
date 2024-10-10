package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int yearOfRelease;
    private int movieLength;
    private boolean includedInThePlan;
    private double sumOfEvaluations;
    private int totalReviews;


    public void showTechnicalSheet(){
        System.out.println("Movie Name: " + name);
        System.out.println("yearOfRelease: " + yearOfRelease);
        System.out.println("movieLength: " + movieLength);
        System.out.println("includedInThePlan: " + includedInThePlan);

    }

    public void evaluation (double nota){
        sumOfEvaluations += nota;
        totalReviews++;
    }

    public double catchTheAverage() {
        return sumOfEvaluations / totalReviews;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public boolean getIncludedInThePlan() {
        return this.includedInThePlan;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public int getMovieLength() {
        return this.movieLength;
    }

    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }

    public int getTotalReviews() {
        return this.totalReviews;
    }
}
