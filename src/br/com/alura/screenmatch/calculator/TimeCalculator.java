package br.com.alura.screenmatch.calculator;

import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime = 0;

    public int getTotalTime() {
        return this.totalTime;
    }
//    public void includes(Movie f) {
//        this.totalTime += f.getMovieLength();
//
//    }
//
//    public void includes(Serie s) {
//        this.totalTime += s.getMovieLength();
//
//   }
    public void includes(Title title) {
        System.out.println("adding duration in minutes " + title);
        this.totalTime += title.getMovieLength();
    }

}
